package mn.gov.xyp.mocks;

import jakarta.annotation.Resource;
import jakarta.jws.WebService;
import jakarta.xml.ws.WebServiceContext;
import mn.gov.xyp.meta.*;

@WebService(
    serviceName = "MetaServiceService",
    portName = "MetaServicePort",
    targetNamespace = "http://meta.xyp.gov.mn/",
    endpointInterface = "mn.gov.xyp.meta.MetaService"
)
public class MetaServiceMock implements MetaService {

    @Resource
    WebServiceContext context;

    @Override
    public ServiceResponse ws100011CheckOtpByCitizen(CheckOtpByCitizenRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100006CheckAccess(AclRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100014AuthServiceByCitizen(AuthServiceByCitizenRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100017LogCheck(LogRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100018GetGsignPhoneNo(GetGsignPhoneNoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100003GetLog(LogRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100019SsoRegisterOtp(SsoRegisterOtpRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100002Mock(MockRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100009CheckOtp(CheckOtpRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100001ListAccess() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100013AuthServiceCheckByOtp(AuthServiceCheckRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100016VerifyLog(VerifyLogRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100008RegisterOTPRequest(RegisterOTPRequest request) {
        var error = MockHelper.verifyRequest(context);
        if (error != null) {
            var r = new ServiceResponse();
            r.setRequest(request);
            r.setRequestId("1");
            r.setResultCode(606);
            r.setResultMessage(error);
            return r;
        }
        var r = new ServiceResponse();
        r.setRequest(request);
        r.setRequestId("1");
        r.setResultCode(0);
        r.setResultMessage("OK");
        return r;
    }

    @Override
    public ServiceResponse ws100015AuthServiceCheckByCitizen(AuthServiceCheckByCitizenRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100012AuthServiceByOtp(AuthServiceRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100010RegisterOTPByCitizen(RegisterOtpByCitizenRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100005ListOrganization() {
        throw new UnsupportedOperationException("not supported");
    }
}