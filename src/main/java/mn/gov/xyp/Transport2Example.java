package mn.gov.xyp;

import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.MessageContext;
import mn.gov.xyp.transport.*;

import java.net.URL;
import java.util.*;

public class Transport2Example {
//    static String wsdl = "https://xyp.gov.mn/transport-1.5.0/ws?WSDL";
    static String wsdl = "http://localhost:8003/transport?wsdl";

    public static void callUseOTP(String timestamp, String regnum) throws Exception {
        /*int otpCode;
        Scanner sc= new Scanner(System.in);
        System.out.print("Иргэнд ирсэн OTP кодыг оруулна уу: ");
        otpCode = sc.nextInt();
        sc.close();

        if(otpCode == 0){
            System.out.println("OTP код буруу байна.");
            return;
        }*/

        TransportService citizenService = new TransportServiceService(new URL(wsdl)).getTransportServicePort();
        Map<String, Object> req_ctx = ((BindingProvider)citizenService).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdl);
        Map<String, List<String>> headers = new HashMap<>();
        XypSign xypSign = new XypSign();
        Hashtable<String, String> fields = xypSign.Generate(Constants.ACCESS_TOKEN, timestamp);
        try{
            headers.put("accessToken", Collections.singletonList(fields.get("accessToken")));
            headers.put("timestamp", Collections.singletonList(fields.get("timestamp")));
            headers.put("signature", Collections.singletonList(fields.get("signature")));
            req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

            //var authorizationEntity = new AuthorizationEntity();
            //authorizationEntity.setRegnum(regnum);
            //authorizationEntity.setOtp(otpCode);

            //var authorizationData = new AuthorizationData();
            //authorizationData.setCitizen(authorizationEntity);

            var requestData = new VehicleRequestData();
            requestData.setPlateNumber("1234УАА"); // ENTER MANUALLY
            //requestData.setAuth(authorizationData);

            ServiceResponse serviceResponse = citizenService.ws100401GetVehicleInfo(requestData);

            System.out.println(serviceResponse.getResultCode());
            System.out.println(serviceResponse.getResultMessage());
            System.out.println(serviceResponse.getRequestId());

            var response = (VehicleData) serviceResponse.getResponse();

            System.out.println("Plate Number                : " + response.getPlateNumber());
            System.out.println("Driver Class                : " + response.getClassName());
            System.out.println("Owner License Number        : " + response.getOwnerRegnum());
            System.out.println("Vehicle Registration Number : " + response.getCabinNumber());
            System.out.println("Made Year                   : " + response.getBuildYear());
            System.out.println("Mark                        : " + response.getMarkName() + " " + response.getModelName());
            System.out.println("Color                       : " + response.getColorName());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public static void main(String[] args) throws Exception {
        var timestamp = Long.toString(System.currentTimeMillis()/1000);
        callUseOTP(timestamp, Constants.REGNUM);
    }
}
