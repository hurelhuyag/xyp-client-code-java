
package mn.gov.xyp.insurance;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="auth" type="{http://insurance.xyp.gov.mn/}authorizationData" minOccurs="0"/&gt;
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
    ServiceConfirmAppUserRequestData.class,
    CheckMotherTimeRequestData.class,
    GetInvoiceByNumberRequestData.class,
    GetInsuranceLRequestData.class,
    WorkHistoryRequestData.class,
    FindOrganizationRequest.class,
    CitizenAccountInformationRetrievalServiceRequestData.class,
    PregnancyBenefitsApplyRequestData.class,
    ServiceCreateAppUserRequestData.class,
    ServiceFindAppUserRequestData.class,
    SetInvoicePaymentRequestData.class,
    CheckIsInsuredRequestData.class,
    DisabilityBenefitsApplyRequestData.class,
    ListOfInvestmentRequestsRequestData.class,
    SalaryFoundByOccupationRequestData.class,
    PaymentRequestData.class,
    MedicalCertCheckRequestData.class,
    DisabledHumanInfoEnglishRequestData.class,
    ServiceOrganizationDeptRequestData.class,
    DisabilityMedicalCertEditRequestData.class,
    DisabilityMedicalCertRequestData.class,
    CheckPensionDateRequest.class,
    OrgHasDebtRequestData.class,
    EmployerRequestData.class,
    PensionFiveYearsAverageChangeRequestData.class,
    GetSalaryFeeRequestData.class,
    RefundHalfAccountRequestData.class,
    PaymentLogRequestData.class,
    FarmersVoluntaryInfoRequestData.class,
    EnterprisesOrgContributionInfoRequestData.class,
    UnemploymentBenefitsApplyRequestData.class,
    OrgInfoForStatisticRequestData.class,
    InsuranceCitizenEngRequestData.class,
    PensionFiveYearsAverageCheckStatusRequestData.class,
    CheckIsInsuredEngRequestData.class,
    InsuranceRequestData.class,
    PregnancyChildbirthInfoRequestData.class,
    InsuranceInfoByOrgRequestData.class,
    InvestmentFinancialInstrumentRequestData.class,
    GetTotalWorkMonthRequestData.class,
    InsuranceCitizenRequestData.class,
    SendInvestmentRequestRequestData.class,
    GetOrgBenNumBy36MonthRequestData.class,
    InvestmentCommercialBanksRequestData.class,
    ReportLogRequestData.class,
    MedicalCertInvalidRequestData.class,
    CheckMotherTimeAllRequestData.class,
    GetMonetizedIncomeInfoRequestData.class,
    GetEmployerNumWithDeptRequest.class,
    GetBankAccountsRequestData.class,
    CitizenInsuranceInfoForStatRequestData.class,
    InsuranceOrgContributionInfoRequestData.class,
    DisabledHumanInfoRequestData.class,
    OrganizationEmployeeRequestData.class,
    PregnancyChildbirthEditRequestData.class,
    InformationOnTheBudgetServiceRequestData.class,
    CheckInsuredEngInfoRequestData.class,
    GetSiSalaryInfoRequestData.class
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
