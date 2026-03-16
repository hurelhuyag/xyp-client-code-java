package mn.gov.xyp.mocks;

import jakarta.xml.ws.WebServiceContext;
import jakarta.xml.ws.handler.MessageContext;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.List;
import java.util.Map;

public class MockHelper {

    // Load server public key (used to verify signatures)
    public static PublicKey getPublicKey() {
        var publicKeyName = "sit.pub";
        try(var keyStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(publicKeyName)) {
            if (keyStream == null) {
                throw new RuntimeException("Unable to load public key " + publicKeyName);
            }
            var keyBytes = keyStream.readAllBytes();
            var keyStr = new String(keyBytes)
                    .replace("-----BEGIN PUBLIC KEY-----", "")
                    .replace("-----END PUBLIC KEY-----", "")
                    .replaceAll("\\s+", "");
            var decoded = Base64.getDecoder().decode(keyStr);
            var spec = new X509EncodedKeySpec(decoded);
            var kf = KeyFactory.getInstance("RSA");
            return kf.generatePublic(spec);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load public key", e);
        }
    }

    public static String verifyRequest(WebServiceContext wsContext) {
        var mc = wsContext.getMessageContext();
        Map<String, List<String>> headers = (Map<String, List<String>>) mc.get(MessageContext.HTTP_REQUEST_HEADERS);

        // Check required headers
        if (headers == null
                || !headers.containsKey("accessToken")
                || !headers.containsKey("timestamp")
                || !headers.containsKey("signature")) {
            return "Missing authentication headers";
        }

        String token = headers.get("accessToken").get(0);
        String timestamp = headers.get("timestamp").get(0);
        String signatureB64 = headers.get("signature").get(0);

        try {
            // Verify signature using public key
            PublicKey publicKey = getPublicKey();
            Signature sig = Signature.getInstance("SHA256withRSA");
            sig.initVerify(publicKey);
            sig.update((token + "." + timestamp).getBytes());

            byte[] sigBytes = Base64.getDecoder().decode(signatureB64);
            boolean valid = sig.verify(sigBytes);

            if (!valid) {
                return "Invalid signature";
            }
        } catch (Exception e) {
            return "Signature verification error: " + e.getMessage();
        }

        return null;
    }

    public static XMLGregorianCalendar generateDate(int year, int month, int day) {
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(year, month, day, 0, 0, 0, 0, 8);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
