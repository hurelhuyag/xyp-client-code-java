
package mn.gov.xyp.meta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mn.gov.xyp.meta package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WS100001ListAccess_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100001_listAccess");
    private final static QName _WS100001ListAccessResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100001_listAccessResponse");
    private final static QName _WS100002Mock_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100002_mock");
    private final static QName _WS100002MockResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100002_mockResponse");
    private final static QName _WS100003GetLog_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100003_getLog");
    private final static QName _WS100003GetLogResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100003_getLogResponse");
    private final static QName _WS100005ListOrganization_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100005_listOrganization");
    private final static QName _WS100005ListOrganizationResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100005_listOrganizationResponse");
    private final static QName _WS100006CheckAccess_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100006_checkAccess");
    private final static QName _WS100006CheckAccessResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100006_checkAccessResponse");
    private final static QName _WS100008RegisterOTPRequest_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100008_registerOTPRequest");
    private final static QName _WS100008RegisterOTPRequestResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100008_registerOTPRequestResponse");
    private final static QName _WS100009CheckOtp_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100009_checkOtp");
    private final static QName _WS100009CheckOtpResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100009_checkOtpResponse");
    private final static QName _WS100010RegisterOTPByCitizen_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100010_registerOTPByCitizen");
    private final static QName _WS100010RegisterOTPByCitizenResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100010_registerOTPByCitizenResponse");
    private final static QName _WS100011CheckOtpByCitizen_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100011_checkOtpByCitizen");
    private final static QName _WS100011CheckOtpByCitizenResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100011_checkOtpByCitizenResponse");
    private final static QName _WS100012AuthServiceByOtp_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100012_authServiceByOtp");
    private final static QName _WS100012AuthServiceByOtpResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100012_authServiceByOtpResponse");
    private final static QName _WS100013AuthServiceCheckByOtp_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100013_authServiceCheckByOtp");
    private final static QName _WS100013AuthServiceCheckByOtpResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100013_authServiceCheckByOtpResponse");
    private final static QName _WS100014AuthServiceByCitizen_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100014_authServiceByCitizen");
    private final static QName _WS100014AuthServiceByCitizenResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100014_authServiceByCitizenResponse");
    private final static QName _WS100015AuthServiceCheckByCitizen_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100015_authServiceCheckByCitizen");
    private final static QName _WS100015AuthServiceCheckByCitizenResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100015_authServiceCheckByCitizenResponse");
    private final static QName _WS100016VerifyLog_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100016_verifyLog");
    private final static QName _WS100016VerifyLogResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100016_verifyLogResponse");
    private final static QName _WS100017LogCheck_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100017_logCheck");
    private final static QName _WS100017LogCheckResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100017_logCheckResponse");
    private final static QName _WS100018GetGsignPhoneNo_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100018_GetGsignPhoneNo");
    private final static QName _WS100018GetGsignPhoneNoResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100018_GetGsignPhoneNoResponse");
    private final static QName _WS100019SsoRegisterOtp_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100019_SsoRegisterOtp");
    private final static QName _WS100019SsoRegisterOtpResponse_QNAME = new QName("http://meta.xyp.gov.mn/", "WS100019_SsoRegisterOtpResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mn.gov.xyp.meta
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WS100001ListAccess }
     * 
     */
    public WS100001ListAccess createWS100001ListAccess() {
        return new WS100001ListAccess();
    }

    /**
     * Create an instance of {@link WS100001ListAccessResponse }
     * 
     */
    public WS100001ListAccessResponse createWS100001ListAccessResponse() {
        return new WS100001ListAccessResponse();
    }

    /**
     * Create an instance of {@link WS100002Mock }
     * 
     */
    public WS100002Mock createWS100002Mock() {
        return new WS100002Mock();
    }

    /**
     * Create an instance of {@link WS100002MockResponse }
     * 
     */
    public WS100002MockResponse createWS100002MockResponse() {
        return new WS100002MockResponse();
    }

    /**
     * Create an instance of {@link WS100003GetLog }
     * 
     */
    public WS100003GetLog createWS100003GetLog() {
        return new WS100003GetLog();
    }

    /**
     * Create an instance of {@link WS100003GetLogResponse }
     * 
     */
    public WS100003GetLogResponse createWS100003GetLogResponse() {
        return new WS100003GetLogResponse();
    }

    /**
     * Create an instance of {@link WS100005ListOrganization }
     * 
     */
    public WS100005ListOrganization createWS100005ListOrganization() {
        return new WS100005ListOrganization();
    }

    /**
     * Create an instance of {@link WS100005ListOrganizationResponse }
     * 
     */
    public WS100005ListOrganizationResponse createWS100005ListOrganizationResponse() {
        return new WS100005ListOrganizationResponse();
    }

    /**
     * Create an instance of {@link WS100006CheckAccess }
     * 
     */
    public WS100006CheckAccess createWS100006CheckAccess() {
        return new WS100006CheckAccess();
    }

    /**
     * Create an instance of {@link WS100006CheckAccessResponse }
     * 
     */
    public WS100006CheckAccessResponse createWS100006CheckAccessResponse() {
        return new WS100006CheckAccessResponse();
    }

    /**
     * Create an instance of {@link WS100008RegisterOTPRequest }
     * 
     */
    public WS100008RegisterOTPRequest createWS100008RegisterOTPRequest() {
        return new WS100008RegisterOTPRequest();
    }

    /**
     * Create an instance of {@link WS100008RegisterOTPRequestResponse }
     * 
     */
    public WS100008RegisterOTPRequestResponse createWS100008RegisterOTPRequestResponse() {
        return new WS100008RegisterOTPRequestResponse();
    }

    /**
     * Create an instance of {@link WS100009CheckOtp }
     * 
     */
    public WS100009CheckOtp createWS100009CheckOtp() {
        return new WS100009CheckOtp();
    }

    /**
     * Create an instance of {@link WS100009CheckOtpResponse }
     * 
     */
    public WS100009CheckOtpResponse createWS100009CheckOtpResponse() {
        return new WS100009CheckOtpResponse();
    }

    /**
     * Create an instance of {@link WS100010RegisterOTPByCitizen }
     * 
     */
    public WS100010RegisterOTPByCitizen createWS100010RegisterOTPByCitizen() {
        return new WS100010RegisterOTPByCitizen();
    }

    /**
     * Create an instance of {@link WS100010RegisterOTPByCitizenResponse }
     * 
     */
    public WS100010RegisterOTPByCitizenResponse createWS100010RegisterOTPByCitizenResponse() {
        return new WS100010RegisterOTPByCitizenResponse();
    }

    /**
     * Create an instance of {@link WS100011CheckOtpByCitizen }
     * 
     */
    public WS100011CheckOtpByCitizen createWS100011CheckOtpByCitizen() {
        return new WS100011CheckOtpByCitizen();
    }

    /**
     * Create an instance of {@link WS100011CheckOtpByCitizenResponse }
     * 
     */
    public WS100011CheckOtpByCitizenResponse createWS100011CheckOtpByCitizenResponse() {
        return new WS100011CheckOtpByCitizenResponse();
    }

    /**
     * Create an instance of {@link WS100012AuthServiceByOtp }
     * 
     */
    public WS100012AuthServiceByOtp createWS100012AuthServiceByOtp() {
        return new WS100012AuthServiceByOtp();
    }

    /**
     * Create an instance of {@link WS100012AuthServiceByOtpResponse }
     * 
     */
    public WS100012AuthServiceByOtpResponse createWS100012AuthServiceByOtpResponse() {
        return new WS100012AuthServiceByOtpResponse();
    }

    /**
     * Create an instance of {@link WS100013AuthServiceCheckByOtp }
     * 
     */
    public WS100013AuthServiceCheckByOtp createWS100013AuthServiceCheckByOtp() {
        return new WS100013AuthServiceCheckByOtp();
    }

    /**
     * Create an instance of {@link WS100013AuthServiceCheckByOtpResponse }
     * 
     */
    public WS100013AuthServiceCheckByOtpResponse createWS100013AuthServiceCheckByOtpResponse() {
        return new WS100013AuthServiceCheckByOtpResponse();
    }

    /**
     * Create an instance of {@link WS100014AuthServiceByCitizen }
     * 
     */
    public WS100014AuthServiceByCitizen createWS100014AuthServiceByCitizen() {
        return new WS100014AuthServiceByCitizen();
    }

    /**
     * Create an instance of {@link WS100014AuthServiceByCitizenResponse }
     * 
     */
    public WS100014AuthServiceByCitizenResponse createWS100014AuthServiceByCitizenResponse() {
        return new WS100014AuthServiceByCitizenResponse();
    }

    /**
     * Create an instance of {@link WS100015AuthServiceCheckByCitizen }
     * 
     */
    public WS100015AuthServiceCheckByCitizen createWS100015AuthServiceCheckByCitizen() {
        return new WS100015AuthServiceCheckByCitizen();
    }

    /**
     * Create an instance of {@link WS100015AuthServiceCheckByCitizenResponse }
     * 
     */
    public WS100015AuthServiceCheckByCitizenResponse createWS100015AuthServiceCheckByCitizenResponse() {
        return new WS100015AuthServiceCheckByCitizenResponse();
    }

    /**
     * Create an instance of {@link WS100016VerifyLog }
     * 
     */
    public WS100016VerifyLog createWS100016VerifyLog() {
        return new WS100016VerifyLog();
    }

    /**
     * Create an instance of {@link WS100016VerifyLogResponse }
     * 
     */
    public WS100016VerifyLogResponse createWS100016VerifyLogResponse() {
        return new WS100016VerifyLogResponse();
    }

    /**
     * Create an instance of {@link WS100017LogCheck }
     * 
     */
    public WS100017LogCheck createWS100017LogCheck() {
        return new WS100017LogCheck();
    }

    /**
     * Create an instance of {@link WS100017LogCheckResponse }
     * 
     */
    public WS100017LogCheckResponse createWS100017LogCheckResponse() {
        return new WS100017LogCheckResponse();
    }

    /**
     * Create an instance of {@link WS100018GetGsignPhoneNo }
     * 
     */
    public WS100018GetGsignPhoneNo createWS100018GetGsignPhoneNo() {
        return new WS100018GetGsignPhoneNo();
    }

    /**
     * Create an instance of {@link WS100018GetGsignPhoneNoResponse }
     * 
     */
    public WS100018GetGsignPhoneNoResponse createWS100018GetGsignPhoneNoResponse() {
        return new WS100018GetGsignPhoneNoResponse();
    }

    /**
     * Create an instance of {@link WS100019SsoRegisterOtp }
     * 
     */
    public WS100019SsoRegisterOtp createWS100019SsoRegisterOtp() {
        return new WS100019SsoRegisterOtp();
    }

    /**
     * Create an instance of {@link WS100019SsoRegisterOtpResponse }
     * 
     */
    public WS100019SsoRegisterOtpResponse createWS100019SsoRegisterOtpResponse() {
        return new WS100019SsoRegisterOtpResponse();
    }

    /**
     * Create an instance of {@link CheckOtpByCitizenRequest }
     * 
     */
    public CheckOtpByCitizenRequest createCheckOtpByCitizenRequest() {
        return new CheckOtpByCitizenRequest();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link AuthorizationData }
     * 
     */
    public AuthorizationData createAuthorizationData() {
        return new AuthorizationData();
    }

    /**
     * Create an instance of {@link AuthorizationEntity }
     * 
     */
    public AuthorizationEntity createAuthorizationEntity() {
        return new AuthorizationEntity();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link CheckOtpData }
     * 
     */
    public CheckOtpData createCheckOtpData() {
        return new CheckOtpData();
    }

    /**
     * Create an instance of {@link AclRequestData }
     * 
     */
    public AclRequestData createAclRequestData() {
        return new AclRequestData();
    }

    /**
     * Create an instance of {@link CheckAccessResponseData }
     * 
     */
    public CheckAccessResponseData createCheckAccessResponseData() {
        return new CheckAccessResponseData();
    }

    /**
     * Create an instance of {@link CheckAccessMap }
     * 
     */
    public CheckAccessMap createCheckAccessMap() {
        return new CheckAccessMap();
    }

    /**
     * Create an instance of {@link CheckAccessOutputParameterData }
     * 
     */
    public CheckAccessOutputParameterData createCheckAccessOutputParameterData() {
        return new CheckAccessOutputParameterData();
    }

    /**
     * Create an instance of {@link AuthServiceByCitizenRequest }
     * 
     */
    public AuthServiceByCitizenRequest createAuthServiceByCitizenRequest() {
        return new AuthServiceByCitizenRequest();
    }

    /**
     * Create an instance of {@link AuthServiceByCitizenData }
     * 
     */
    public AuthServiceByCitizenData createAuthServiceByCitizenData() {
        return new AuthServiceByCitizenData();
    }

    /**
     * Create an instance of {@link LogRequestData }
     * 
     */
    public LogRequestData createLogRequestData() {
        return new LogRequestData();
    }

    /**
     * Create an instance of {@link LogCheckData }
     * 
     */
    public LogCheckData createLogCheckData() {
        return new LogCheckData();
    }

    /**
     * Create an instance of {@link GetGsignPhoneNoRequestData }
     * 
     */
    public GetGsignPhoneNoRequestData createGetGsignPhoneNoRequestData() {
        return new GetGsignPhoneNoRequestData();
    }

    /**
     * Create an instance of {@link GetGsignPhoneNoData }
     * 
     */
    public GetGsignPhoneNoData createGetGsignPhoneNoData() {
        return new GetGsignPhoneNoData();
    }

    /**
     * Create an instance of {@link LogInfoData }
     * 
     */
    public LogInfoData createLogInfoData() {
        return new LogInfoData();
    }

    /**
     * Create an instance of {@link SsoRegisterOtpRequestData }
     * 
     */
    public SsoRegisterOtpRequestData createSsoRegisterOtpRequestData() {
        return new SsoRegisterOtpRequestData();
    }

    /**
     * Create an instance of {@link SsoRegisterOtpResponseData }
     * 
     */
    public SsoRegisterOtpResponseData createSsoRegisterOtpResponseData() {
        return new SsoRegisterOtpResponseData();
    }

    /**
     * Create an instance of {@link MockRequestData }
     * 
     */
    public MockRequestData createMockRequestData() {
        return new MockRequestData();
    }

    /**
     * Create an instance of {@link MockData }
     * 
     */
    public MockData createMockData() {
        return new MockData();
    }

    /**
     * Create an instance of {@link MockSubData }
     * 
     */
    public MockSubData createMockSubData() {
        return new MockSubData();
    }

    /**
     * Create an instance of {@link CheckOtpRequestData }
     * 
     */
    public CheckOtpRequestData createCheckOtpRequestData() {
        return new CheckOtpRequestData();
    }

    /**
     * Create an instance of {@link XypClientData }
     * 
     */
    public XypClientData createXypClientData() {
        return new XypClientData();
    }

    /**
     * Create an instance of {@link WebService }
     * 
     */
    public WebService createWebService() {
        return new WebService();
    }

    /**
     * Create an instance of {@link AuthServiceCheckRequest }
     * 
     */
    public AuthServiceCheckRequest createAuthServiceCheckRequest() {
        return new AuthServiceCheckRequest();
    }

    /**
     * Create an instance of {@link VerifyLogRequestData }
     * 
     */
    public VerifyLogRequestData createVerifyLogRequestData() {
        return new VerifyLogRequestData();
    }

    /**
     * Create an instance of {@link VerifyLogData }
     * 
     */
    public VerifyLogData createVerifyLogData() {
        return new VerifyLogData();
    }

    /**
     * Create an instance of {@link RegisterOTPRequest }
     * 
     */
    public RegisterOTPRequest createRegisterOTPRequest() {
        return new RegisterOTPRequest();
    }

    /**
     * Create an instance of {@link RegisterOTPData }
     * 
     */
    public RegisterOTPData createRegisterOTPData() {
        return new RegisterOTPData();
    }

    /**
     * Create an instance of {@link AuthServiceCheckByCitizenRequest }
     * 
     */
    public AuthServiceCheckByCitizenRequest createAuthServiceCheckByCitizenRequest() {
        return new AuthServiceCheckByCitizenRequest();
    }

    /**
     * Create an instance of {@link AuthServiceRequest }
     * 
     */
    public AuthServiceRequest createAuthServiceRequest() {
        return new AuthServiceRequest();
    }

    /**
     * Create an instance of {@link AuthServiceData }
     * 
     */
    public AuthServiceData createAuthServiceData() {
        return new AuthServiceData();
    }

    /**
     * Create an instance of {@link RegisterOtpByCitizenRequest }
     * 
     */
    public RegisterOtpByCitizenRequest createRegisterOtpByCitizenRequest() {
        return new RegisterOtpByCitizenRequest();
    }

    /**
     * Create an instance of {@link RegisterOtpByCitizenData }
     * 
     */
    public RegisterOtpByCitizenData createRegisterOtpByCitizenData() {
        return new RegisterOtpByCitizenData();
    }

    /**
     * Create an instance of {@link ListOrganizationResponseData }
     * 
     */
    public ListOrganizationResponseData createListOrganizationResponseData() {
        return new ListOrganizationResponseData();
    }

    /**
     * Create an instance of {@link OrganizationData }
     * 
     */
    public OrganizationData createOrganizationData() {
        return new OrganizationData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100001ListAccess }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100001ListAccess }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100001_listAccess")
    public JAXBElement<WS100001ListAccess> createWS100001ListAccess(WS100001ListAccess value) {
        return new JAXBElement<WS100001ListAccess>(_WS100001ListAccess_QNAME, WS100001ListAccess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100001ListAccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100001ListAccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100001_listAccessResponse")
    public JAXBElement<WS100001ListAccessResponse> createWS100001ListAccessResponse(WS100001ListAccessResponse value) {
        return new JAXBElement<WS100001ListAccessResponse>(_WS100001ListAccessResponse_QNAME, WS100001ListAccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100002Mock }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100002Mock }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100002_mock")
    public JAXBElement<WS100002Mock> createWS100002Mock(WS100002Mock value) {
        return new JAXBElement<WS100002Mock>(_WS100002Mock_QNAME, WS100002Mock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100002MockResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100002MockResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100002_mockResponse")
    public JAXBElement<WS100002MockResponse> createWS100002MockResponse(WS100002MockResponse value) {
        return new JAXBElement<WS100002MockResponse>(_WS100002MockResponse_QNAME, WS100002MockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100003GetLog }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100003GetLog }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100003_getLog")
    public JAXBElement<WS100003GetLog> createWS100003GetLog(WS100003GetLog value) {
        return new JAXBElement<WS100003GetLog>(_WS100003GetLog_QNAME, WS100003GetLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100003GetLogResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100003GetLogResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100003_getLogResponse")
    public JAXBElement<WS100003GetLogResponse> createWS100003GetLogResponse(WS100003GetLogResponse value) {
        return new JAXBElement<WS100003GetLogResponse>(_WS100003GetLogResponse_QNAME, WS100003GetLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100005ListOrganization }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100005ListOrganization }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100005_listOrganization")
    public JAXBElement<WS100005ListOrganization> createWS100005ListOrganization(WS100005ListOrganization value) {
        return new JAXBElement<WS100005ListOrganization>(_WS100005ListOrganization_QNAME, WS100005ListOrganization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100005ListOrganizationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100005ListOrganizationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100005_listOrganizationResponse")
    public JAXBElement<WS100005ListOrganizationResponse> createWS100005ListOrganizationResponse(WS100005ListOrganizationResponse value) {
        return new JAXBElement<WS100005ListOrganizationResponse>(_WS100005ListOrganizationResponse_QNAME, WS100005ListOrganizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100006CheckAccess }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100006CheckAccess }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100006_checkAccess")
    public JAXBElement<WS100006CheckAccess> createWS100006CheckAccess(WS100006CheckAccess value) {
        return new JAXBElement<WS100006CheckAccess>(_WS100006CheckAccess_QNAME, WS100006CheckAccess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100006CheckAccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100006CheckAccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100006_checkAccessResponse")
    public JAXBElement<WS100006CheckAccessResponse> createWS100006CheckAccessResponse(WS100006CheckAccessResponse value) {
        return new JAXBElement<WS100006CheckAccessResponse>(_WS100006CheckAccessResponse_QNAME, WS100006CheckAccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100008RegisterOTPRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100008RegisterOTPRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100008_registerOTPRequest")
    public JAXBElement<WS100008RegisterOTPRequest> createWS100008RegisterOTPRequest(WS100008RegisterOTPRequest value) {
        return new JAXBElement<WS100008RegisterOTPRequest>(_WS100008RegisterOTPRequest_QNAME, WS100008RegisterOTPRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100008RegisterOTPRequestResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100008RegisterOTPRequestResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100008_registerOTPRequestResponse")
    public JAXBElement<WS100008RegisterOTPRequestResponse> createWS100008RegisterOTPRequestResponse(WS100008RegisterOTPRequestResponse value) {
        return new JAXBElement<WS100008RegisterOTPRequestResponse>(_WS100008RegisterOTPRequestResponse_QNAME, WS100008RegisterOTPRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100009CheckOtp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100009CheckOtp }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100009_checkOtp")
    public JAXBElement<WS100009CheckOtp> createWS100009CheckOtp(WS100009CheckOtp value) {
        return new JAXBElement<WS100009CheckOtp>(_WS100009CheckOtp_QNAME, WS100009CheckOtp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100009CheckOtpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100009CheckOtpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100009_checkOtpResponse")
    public JAXBElement<WS100009CheckOtpResponse> createWS100009CheckOtpResponse(WS100009CheckOtpResponse value) {
        return new JAXBElement<WS100009CheckOtpResponse>(_WS100009CheckOtpResponse_QNAME, WS100009CheckOtpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100010RegisterOTPByCitizen }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100010RegisterOTPByCitizen }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100010_registerOTPByCitizen")
    public JAXBElement<WS100010RegisterOTPByCitizen> createWS100010RegisterOTPByCitizen(WS100010RegisterOTPByCitizen value) {
        return new JAXBElement<WS100010RegisterOTPByCitizen>(_WS100010RegisterOTPByCitizen_QNAME, WS100010RegisterOTPByCitizen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100010RegisterOTPByCitizenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100010RegisterOTPByCitizenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100010_registerOTPByCitizenResponse")
    public JAXBElement<WS100010RegisterOTPByCitizenResponse> createWS100010RegisterOTPByCitizenResponse(WS100010RegisterOTPByCitizenResponse value) {
        return new JAXBElement<WS100010RegisterOTPByCitizenResponse>(_WS100010RegisterOTPByCitizenResponse_QNAME, WS100010RegisterOTPByCitizenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100011CheckOtpByCitizen }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100011CheckOtpByCitizen }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100011_checkOtpByCitizen")
    public JAXBElement<WS100011CheckOtpByCitizen> createWS100011CheckOtpByCitizen(WS100011CheckOtpByCitizen value) {
        return new JAXBElement<WS100011CheckOtpByCitizen>(_WS100011CheckOtpByCitizen_QNAME, WS100011CheckOtpByCitizen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100011CheckOtpByCitizenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100011CheckOtpByCitizenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100011_checkOtpByCitizenResponse")
    public JAXBElement<WS100011CheckOtpByCitizenResponse> createWS100011CheckOtpByCitizenResponse(WS100011CheckOtpByCitizenResponse value) {
        return new JAXBElement<WS100011CheckOtpByCitizenResponse>(_WS100011CheckOtpByCitizenResponse_QNAME, WS100011CheckOtpByCitizenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100012AuthServiceByOtp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100012AuthServiceByOtp }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100012_authServiceByOtp")
    public JAXBElement<WS100012AuthServiceByOtp> createWS100012AuthServiceByOtp(WS100012AuthServiceByOtp value) {
        return new JAXBElement<WS100012AuthServiceByOtp>(_WS100012AuthServiceByOtp_QNAME, WS100012AuthServiceByOtp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100012AuthServiceByOtpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100012AuthServiceByOtpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100012_authServiceByOtpResponse")
    public JAXBElement<WS100012AuthServiceByOtpResponse> createWS100012AuthServiceByOtpResponse(WS100012AuthServiceByOtpResponse value) {
        return new JAXBElement<WS100012AuthServiceByOtpResponse>(_WS100012AuthServiceByOtpResponse_QNAME, WS100012AuthServiceByOtpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100013AuthServiceCheckByOtp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100013AuthServiceCheckByOtp }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100013_authServiceCheckByOtp")
    public JAXBElement<WS100013AuthServiceCheckByOtp> createWS100013AuthServiceCheckByOtp(WS100013AuthServiceCheckByOtp value) {
        return new JAXBElement<WS100013AuthServiceCheckByOtp>(_WS100013AuthServiceCheckByOtp_QNAME, WS100013AuthServiceCheckByOtp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100013AuthServiceCheckByOtpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100013AuthServiceCheckByOtpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100013_authServiceCheckByOtpResponse")
    public JAXBElement<WS100013AuthServiceCheckByOtpResponse> createWS100013AuthServiceCheckByOtpResponse(WS100013AuthServiceCheckByOtpResponse value) {
        return new JAXBElement<WS100013AuthServiceCheckByOtpResponse>(_WS100013AuthServiceCheckByOtpResponse_QNAME, WS100013AuthServiceCheckByOtpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100014AuthServiceByCitizen }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100014AuthServiceByCitizen }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100014_authServiceByCitizen")
    public JAXBElement<WS100014AuthServiceByCitizen> createWS100014AuthServiceByCitizen(WS100014AuthServiceByCitizen value) {
        return new JAXBElement<WS100014AuthServiceByCitizen>(_WS100014AuthServiceByCitizen_QNAME, WS100014AuthServiceByCitizen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100014AuthServiceByCitizenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100014AuthServiceByCitizenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100014_authServiceByCitizenResponse")
    public JAXBElement<WS100014AuthServiceByCitizenResponse> createWS100014AuthServiceByCitizenResponse(WS100014AuthServiceByCitizenResponse value) {
        return new JAXBElement<WS100014AuthServiceByCitizenResponse>(_WS100014AuthServiceByCitizenResponse_QNAME, WS100014AuthServiceByCitizenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100015AuthServiceCheckByCitizen }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100015AuthServiceCheckByCitizen }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100015_authServiceCheckByCitizen")
    public JAXBElement<WS100015AuthServiceCheckByCitizen> createWS100015AuthServiceCheckByCitizen(WS100015AuthServiceCheckByCitizen value) {
        return new JAXBElement<WS100015AuthServiceCheckByCitizen>(_WS100015AuthServiceCheckByCitizen_QNAME, WS100015AuthServiceCheckByCitizen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100015AuthServiceCheckByCitizenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100015AuthServiceCheckByCitizenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100015_authServiceCheckByCitizenResponse")
    public JAXBElement<WS100015AuthServiceCheckByCitizenResponse> createWS100015AuthServiceCheckByCitizenResponse(WS100015AuthServiceCheckByCitizenResponse value) {
        return new JAXBElement<WS100015AuthServiceCheckByCitizenResponse>(_WS100015AuthServiceCheckByCitizenResponse_QNAME, WS100015AuthServiceCheckByCitizenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100016VerifyLog }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100016VerifyLog }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100016_verifyLog")
    public JAXBElement<WS100016VerifyLog> createWS100016VerifyLog(WS100016VerifyLog value) {
        return new JAXBElement<WS100016VerifyLog>(_WS100016VerifyLog_QNAME, WS100016VerifyLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100016VerifyLogResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100016VerifyLogResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100016_verifyLogResponse")
    public JAXBElement<WS100016VerifyLogResponse> createWS100016VerifyLogResponse(WS100016VerifyLogResponse value) {
        return new JAXBElement<WS100016VerifyLogResponse>(_WS100016VerifyLogResponse_QNAME, WS100016VerifyLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100017LogCheck }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100017LogCheck }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100017_logCheck")
    public JAXBElement<WS100017LogCheck> createWS100017LogCheck(WS100017LogCheck value) {
        return new JAXBElement<WS100017LogCheck>(_WS100017LogCheck_QNAME, WS100017LogCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100017LogCheckResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100017LogCheckResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100017_logCheckResponse")
    public JAXBElement<WS100017LogCheckResponse> createWS100017LogCheckResponse(WS100017LogCheckResponse value) {
        return new JAXBElement<WS100017LogCheckResponse>(_WS100017LogCheckResponse_QNAME, WS100017LogCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100018GetGsignPhoneNo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100018GetGsignPhoneNo }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100018_GetGsignPhoneNo")
    public JAXBElement<WS100018GetGsignPhoneNo> createWS100018GetGsignPhoneNo(WS100018GetGsignPhoneNo value) {
        return new JAXBElement<WS100018GetGsignPhoneNo>(_WS100018GetGsignPhoneNo_QNAME, WS100018GetGsignPhoneNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100018GetGsignPhoneNoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100018GetGsignPhoneNoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100018_GetGsignPhoneNoResponse")
    public JAXBElement<WS100018GetGsignPhoneNoResponse> createWS100018GetGsignPhoneNoResponse(WS100018GetGsignPhoneNoResponse value) {
        return new JAXBElement<WS100018GetGsignPhoneNoResponse>(_WS100018GetGsignPhoneNoResponse_QNAME, WS100018GetGsignPhoneNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100019SsoRegisterOtp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100019SsoRegisterOtp }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100019_SsoRegisterOtp")
    public JAXBElement<WS100019SsoRegisterOtp> createWS100019SsoRegisterOtp(WS100019SsoRegisterOtp value) {
        return new JAXBElement<WS100019SsoRegisterOtp>(_WS100019SsoRegisterOtp_QNAME, WS100019SsoRegisterOtp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100019SsoRegisterOtpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100019SsoRegisterOtpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://meta.xyp.gov.mn/", name = "WS100019_SsoRegisterOtpResponse")
    public JAXBElement<WS100019SsoRegisterOtpResponse> createWS100019SsoRegisterOtpResponse(WS100019SsoRegisterOtpResponse value) {
        return new JAXBElement<WS100019SsoRegisterOtpResponse>(_WS100019SsoRegisterOtpResponse_QNAME, WS100019SsoRegisterOtpResponse.class, null, value);
    }

}
