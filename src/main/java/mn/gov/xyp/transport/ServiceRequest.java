
package mn.gov.xyp.transport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth" type="{http://transport.xyp.gov.mn/}authorizationData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceRequest", propOrder = {
    "auth"
})
@XmlSeeAlso({
    VehiclePlateNumberReserveRequestData.class,
    GetECDataRequestData.class,
    CheckBorderPermitVehicleRequestData.class,
    CitizenPenaltyListRequestData.class,
    GetImportExportRequestData.class,
    RegnumRequestData.class,
    MandatoryInsuranceCaseListRequestData.class,
    VehicleLegalEntityInfoRequestData.class,
    TrainBorderInfoRequestData.class,
    GetBusDispatcherListRequestData.class,
    OrderDriverLicenseRequestData.class,
    VehicleRequestData.class,
    TransportRequestData.class,
    ServiceVehicleOrganizationRequestData.class,
    ServiceVehicleImportInfoData.class,
    VerifyPaymentInfoRequestData.class,
    GetSavedNumberListRequestData.class,
    OrgRegnumRequestData.class,
    BorderRegisteredPassengersInfoRequestData.class,
    SavePlateNumberRequestData.class,
    GetBusLocationRequestData.class,
    VehicleOwnershipTransferVerificationRequestData.class,
    OwnerRequestData.class,
    FreightTransportTrainDocListRequestData.class,
    VehicleTaxInfoServiceRequestData.class,
    ServiceVehiclePenaltyInfoRequestData.class,
    VehicleBorderInfoRequestData.class,
    ServiceDriverLicenseInfoData.class,
    VehicleLimitedRequestData.class,
    OwnerWaterWayVechicleDirectoryRequestData.class,
    VehicleListRequestData.class,
    TransportCompanyListRequestData.class,
    PayInvoiceRequest.class,
    TollInvoiceDetailsRequestData.class,
    TransportCompanyCreateWorkerRequestData.class,
    VehicleBorderPassRequestData.class,
    BorderRegisteredTransportInfoRequestData.class,
    CheckVehicleOwnerRegistrationRequestData.class,
    MandatoryInsuranceShortListRequestData.class,
    FreightTransportTrainDocDetailRequestData.class,
    CheckPassengerRequestData.class,
    RegisterPlateNumberOwnerRequestData.class,
    VehicleInspectionByPlateNoRequestData.class,
    ProductListRequestData.class,
    GetAvailableNumberListRequestData.class,
    SasCompanyInfoListRequestData.class,
    MandatoryInsuranceDetailListRequestData.class,
    PoliceECLicenseCheckerRequestData.class,
    GetBusDirectionListRequestData.class,
    TransportCompanyRouteListRequestData.class,
    CheckECLIcenseFromKioskRequestData.class,
    TransportCheckGPSPaymentRequestData.class,
    TransportCompanyVehiclesListRequestData.class,
    PlateNumberAffiliationRequestData.class,
    TransportCompanyEmployeeListRequestData.class,
    SpecialDriverRequestData.class,
    EcLicenseCancelRequestData.class,
    VehicleAndDriverBorderReportRequestData.class,
    ServiceUpdatePenaltyPaymentRequestData.class,
    PlateBorderInfoRequestData.class,
    GetInternationalDriverInfoRequestData.class,
    OwnerVehicleListRequestData.class,
    VehicleInspectionRequestData.class,
    EcLicenseCreatorRequestData.class,
    NumberSaveAvailabilityRequestData.class,
    VehicleCertRequestData.class,
    PermittedVehiclesListRequestData.class,
    InternationalDriverLicenseRequestData.class,
    VehicleOwnershipTransferRequestData.class,
    TransferPlateNumberOwnerRequestData.class,
    EcLicenseCheckerRequestData.class,
    GetReservedNumberListRequestData.class,
    GetFineInfoUsingFineNumberRequestData.class
})
public class ServiceRequest {

    protected AuthorizationData auth;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationData }
     *     
     */
    public AuthorizationData getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationData }
     *     
     */
    public void setAuth(AuthorizationData value) {
        this.auth = value;
    }

}
