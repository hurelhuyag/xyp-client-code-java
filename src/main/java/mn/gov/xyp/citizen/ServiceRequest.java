
package mn.gov.xyp.citizen;

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
 *         &lt;element name="auth" type="{http://citizen.xyp.gov.mn/}authorizationData" minOccurs="0"/&gt;
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
    GetPassportInfoRequestData.class,
    CitizenRequestData.class,
    ForeignPassportsListRequestData.class,
    CitizenEducationRequestData.class,
    CitizenStatisticRequestData.class,
    GetIDCardInfoRequestData.class,
    ServiceInsertBirthInfoRequestData.class,
    BorderBanRequestData.class,
    GetTegCivilInfoRequestData.class,
    ServiceCitizenBorderPassRequestData.class,
    CitizenGraduateSchoolRequestData.class,
    GraduatedVocationalStudentInfoRequestData.class,
    ServiceGenerateRegisterNumberRequestData.class,
    GetDictionaryRequestData.class,
    GetNameAndSurnameChangedInfoRequestData.class,
    InsertCitizenArchivesOrderRequestData.class,
    GetElectionLocationRequestData.class,
    CivilInfoAtBurtgelmnRequestData.class,
    GetAwardInformationForMotherAndChildRequestData.class,
    ServiceCitizenLookUpAddressRequestData.class,
    CitizenFoulDataRequest.class,
    GetPassportPhotoRequestData.class,
    GetOrganizationWhereCitizenWorksInfoRequestData.class,
    ServiceInsertForeignCitizenInHotelRequestData.class,
    CitizenListOfSubmitAnApplicationRequestData.class,
    ServiceCitizenDeceaseInfoRequestData.class,
    CivilServiceEmployeeInfoRequestData.class,
    PassportInvalidInfoRequestData.class,
    CovidPCRRequestData.class,
    ChildrenInfoByParentRequestData.class,
    ExtendTermOfGrantedNameUpdateRequestData.class,
    GetParentInfoRequestData.class,
    ActiveVocationalStudentInfoRequestData.class,
    PassportInfoForUseByPoliceRequestData.class,
    GetAdoptionInfoRequestData.class,
    CitizenCriminalLiabilityRequestData.class,
    ServiceAddressStreetInfoRequestData.class,
    GetChildrenInfoUnderAgeOf16RequestData.class,
    GraduateInfoByYearRequestData.class,
    GetFireArmRequestData.class,
    CheckIdCardServiceRequestData.class,
    GetTopicsRequestData.class,
    GetMotherAndChildBirthInfoRequestData.class,
    CitizenDenationalizationRequestData.class,
    WeaponBorderAuthorizationRequestData.class,
    ChildRequestData.class,
    ServiceSoumDistrictInfoRequestData.class,
    GetPassportInfoDetailRequestData.class,
    ServiceCheckCitizenAddressInfoRequestData.class,
    LegalEntityNameValidityServiceRequestData.class,
    GetPassportIssuedRequestData.class,
    GetDissolvedLegalEntityInfoRequestData.class,
    GetDeceaseInfoRequestData.class,
    ListOfDeregisteredCitizensRequestData.class,
    Covid19InternationalCertRequestData.class,
    ServiceCitizenLookUpInfoRequestData.class,
    CitizenCriminalLiabilityEngRequestData.class,
    GetMigrationInfoRequestData.class,
    ServiceCheckCitizenRegnumRequestData.class,
    ServiceChildrenInfoRequestData.class,
    PassportValidityCheckerRequestData.class,
    BirthInfoParentRegnumRequestData.class,
    GetMarriageInfoRequestData.class,
    CitizenNewDiplomaInfoRequestData.class,
    ExtendTermOfGrantedNameRequsetData.class,
    GetTopicScopeRequestData.class,
    ServiceCitizenBirthInfoRequestData.class,
    CitizenshipRenunciationRecordRequestData.class,
    ListOfRegisteredCitizensRequestData.class,
    GetCitizenBelowSubsistenceLevelInfoRequestData.class,
    SvcMarriageRestoresRequestData.class,
    GenProfTrainingPackageCertRequestData.class,
    InsertNotaryRequestData.class,
    CitizenInfoLogByDateRequestData.class,
    CitizenArrivedLimitedDateRequestData.class,
    ServiceBagKhorooInfoRequestData.class,
    ServiceBorderPassInfoRequestData.class,
    ConformityCertificateListRequestData.class,
    GetFiliationInfoRequestData.class,
    GetDivorcedInfoRequestData.class,
    AffiliationRegistrationInfoRequestData.class,
    GetStampReferenceRequestData.class,
    ChildrenInfoByMotherRequestData.class,
    ListOfCivilTitlesRequestData.class,
    UdRegnumForeignCitizenInfoRequest.class,
    ServicePassortInfoRequestData.class,
    ConformityCertificateDetailServiceRequestData.class,
    RegistrationBasicRequest.class,
    GetRegnumChangedInfoRequestData.class,
    ServiceAddressApartmentInfoRequestData.class,
    CitizenSubmitAnApplicationRequestData.class,
    CitizenReleasedInfoRequestData.class,
    Covid19VaccineCertificateRequest.class,
    CheckCitizenInfoRequestData.class,
    InternalTroopsDescriptionRequestData.class
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
