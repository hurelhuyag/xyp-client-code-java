package mn.gov.xyp.mocks;

import jakarta.jws.WebService;
import mn.gov.xyp.insurance.*;

@WebService(
    serviceName = "InsuranceServiceService",
    portName = "InsuranceServicePort",
    targetNamespace = "http://insurance.xyp.gov.mn/",
    endpointInterface = "mn.gov.xyp.insurance.InsuranceService"
)
public class InsuranceServiceMock implements InsuranceService {
    
    @Override
    public ServiceResponse ws100504ConfirmAppUser(ServiceConfirmAppUserRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100522CheckHouseHoldSC(CheckMotherTimeRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100592GetInvoiceByNumber(GetInvoiceByNumberRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100596GetInsuranceL(GetInsuranceLRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100550PregnancyChildbirthCertList(WorkHistoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100516GetInsuredForLastThreeMonthInfo(WorkHistoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100535FindOrganizationForMedicalCert(FindOrganizationRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100555GetBankList(WorkHistoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100590CitizenAccountInformationRetrievalService(CitizenAccountInformationRetrievalServiceRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100551PregnancyBenefitsApply(PregnancyBenefitsApplyRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100505CreateAppUser(ServiceCreateAppUserRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100552UnemploymentBenefitsList(WorkHistoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100506FindAppUser(ServiceFindAppUserRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100510GetSiWorkerAccountInfo(WorkHistoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100523GetCampVoucherOfElderInfo(CheckMotherTimeRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100595SetInvoicePayment(SetInvoicePaymentRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100567LostCaregiverPensionDocumentInfo(CheckIsInsuredRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100549DisabilityBenefitsApply(DisabilityBenefitsApplyRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100589ListOfInvestmentRequests(ListOfInvestmentRequestsRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100509GetSalaryFoundByIndutyInfo(SalaryFoundByOccupationRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100527GetPaymentInfo(PaymentRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100545MedicalCertCheck(MedicalCertCheckRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100578DisabledHumanEnglishInfo(DisabledHumanInfoEnglishRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100521CheckHouseHoldFood(CheckMotherTimeRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100594GetInsuranceProducts() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100520CheckHouseHoldChild(CheckMotherTimeRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100566DisabilityPensionDocumentInfo(CheckIsInsuredRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100503GetCheckMotherTimeInfo(CheckMotherTimeRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100533InsuredListLast3MonthByDate(WorkHistoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100525GetOrganizationDeptInfo(ServiceOrganizationDeptRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100546DisabilityMedicalCertEdit(DisabilityMedicalCertEditRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100554UnemploymentBenefitsCount(WorkHistoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100560RefundHalfAccountList(WorkHistoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100534OrganizationInfo(ServiceOrganizationDeptRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100538DisabilityMedicalCertInfo(DisabilityMedicalCertRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100559RefundHalfBankList(WorkHistoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100543RetirementListInfo(CheckPensionDateRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100524GetDisabledPersonSupplyInfo(CheckMotherTimeRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100586OrgHasDebt(OrgHasDebtRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100511GetEmployerInfo(EmployerRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100579PensionFiveYearsAverageChange(PensionFiveYearsAverageChangeRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100529GetSalaryFeeList(GetSalaryFeeRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100562RefundHalfUpdateAccount(RefundHalfAccountRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100575FarmersVoluntaryInfo(FarmersVoluntaryInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100528PaymentLog(PaymentLogRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100536CheckMotherEmployed(CheckIsInsuredRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100582EnterprisesOrgContributionInfo(EnterprisesOrgContributionInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100553UnemploymentBenefitsApply(UnemploymentBenefitsApplyRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100558OrgInfoForStatistic(OrgInfoForStatisticRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100565GetCitizenSalaryInfoEng(InsuranceCitizenEngRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100580PensionFiveYearsAverageCheckStatus(PensionFiveYearsAverageCheckStatusRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100569DisabilityPensionDocumentEngInfo(CheckIsInsuredEngRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100542SocialInsuranceInfo(InsuranceRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100537PregnancyChildbirthInfo(PregnancyChildbirthInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100576InsuranceInfoByOrgService(InsuranceInfoByOrgRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100597InvestmentFinancialInstrument(InvestmentFinancialInstrumentRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100584GetTotalWorkMonth(GetTotalWorkMonthRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100507GetInsureeWorkHistoryInfo(WorkHistoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100501GetCitizenSalaryInfo(InsuranceCitizenRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100588SendInvestmentRequest(SendInvestmentRequestRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100585GetOrgBenNumBy36Month(GetOrgBenNumBy36MonthRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100556GetHealthInsuranceFee(CheckIsInsuredRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100573OrgDebtWithTransacInfo(ServiceOrganizationDeptRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100518GetPensionInformationData(CheckMotherTimeRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100502GetCitizenPensionInquiry(InsuranceCitizenRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100531CheckPensionDate(CheckPensionDateRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100598InvestmentCommercialBanks(InvestmentCommercialBanksRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100512CheckIsInsuredInfo(CheckIsInsuredRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100532CitizenLossOfAbilityToWorkInfo(CheckPensionDateRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100564PensionDocumentInfo(CheckIsInsuredRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100526ReportLog(ReportLogRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100563FuneralAllowanceInfo(WorkHistoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100539PregnancyChildbirthCertInvalid(MedicalCertInvalidRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100513FindOrganizationInfo(FindOrganizationRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100572GetPensionInfo(CheckIsInsuredRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100517CheckMotherTimeAllInfo(CheckMotherTimeAllRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100583GetMonetizedIncomeInfo(GetMonetizedIncomeInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100514GetEmployerNumWithDeptInfo(GetEmployerNumWithDeptRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100540DisabilityMedicalCertInvalid(MedicalCertInvalidRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100593GetBankAccount(GetBankAccountsRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100557CitizenInsuranceInfoForStatistic(CitizenInsuranceInfoForStatRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100515ForeignEmployerInfo(GetEmployerNumWithDeptRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100508GetSalaryFoundByOccupationInfo(SalaryFoundByOccupationRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100561RefundHalfCreateAccount(RefundHalfAccountRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100581InsuranceOrgContributionInfo(InsuranceOrgContributionInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100574DisabledHumanInfo(DisabledHumanInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100530OrganizationEmployeeInfo(OrganizationEmployeeRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100544GetInsuredForLastThreeMonthOccupationInfo(WorkHistoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100547PregnancyChildbirthEdit(PregnancyChildbirthEditRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100591InformationOnTheBudgetService(InformationOnTheBudgetServiceRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100587CheckInsuredEngInfo(CheckInsuredEngInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100571UMNSInsuranceInfo(InsuranceRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100541HealthInsuranceInfo(InsuranceRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100519CheckChildMoney(CheckMotherTimeRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100577GetSiSalaryInfo(GetSiSalaryInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100568PensionDocumentEngInfo(CheckIsInsuredEngRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100548DisabilityMedicalCertList(WorkHistoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100570LostCaregiverPensionDocumentEngInfo(CheckIsInsuredEngRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }
}
