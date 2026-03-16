package mn.gov.xyp.mocks;

import jakarta.annotation.Resource;
import jakarta.jws.WebService;
import jakarta.xml.ws.WebServiceContext;
import mn.gov.xyp.transport.*;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

@WebService(
    serviceName = "TransportServiceService",
    portName = "TransportServicePort",
    targetNamespace = "http://transport.xyp.gov.mn/",
    endpointInterface = "mn.gov.xyp.transport.TransportService"
)
public class TransportServiceMock implements TransportService {

    @Resource
    WebServiceContext context;

    @Override
    public ServiceResponse ws100489VehiclePlateNumberReserve(VehiclePlateNumberReserveRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100404GetECDataInfo(GetECDataRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100479CheckBorderPermitVehicle(CheckBorderPermitVehicleRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100422GetCitizenPenaltyList(CitizenPenaltyListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100414GetImportExportItemList(GetImportExportRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100441UmnsVehicleInfo(RegnumRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100461MandatoryInsuranceCaseStatementList(MandatoryInsuranceCaseListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100445DriverLicenseOrderedLog() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100436VehicleLegalEntityInfo(VehicleLegalEntityInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100471TrainBorderInfo(TrainBorderInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100474GetBusDispatcherList(GetBusDispatcherListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100444OrderDriverLicense(OrderDriverLicenseRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100406GetCitizenVehicleList(VehicleRequestData request) {
        var error = MockHelper.verifyRequest(context);
        if (error != null) {
            var r = new ServiceResponse();
            r.setRequest(request);
            r.setRequestId("1");
            r.setResultCode(606);
            r.setResultMessage(error);
            return r;
        }

        var response = new CitizenVehicleInfoData();

        var v = new VehicleDataOneFourZero();
        v.setArchiveFirstNumber("АБВГД12345678");
        v.setArchiveNumber("АВБГД12345678");
        v.setAxleCount(0);
        v.setBuildYear(2017);
        v.setCabinNumber("ZVW301234567");
        v.setCapacity(1797.0f);
        v.setCertificateNumber("АА1234567");
        v.setClassName("B");
        v.setColorName("Сувдан цагаан");
        v.setCountryName("Япон");
        v.setDeclarationNum(null);
        v.setFueltype("Бензин - Цахилгаан");
        v.setHeight(1490.0f);
        var holderAddress = new AddressData();
        holderAddress.setApartment(null);
        holderAddress.setDoor(null);
        holderAddress.setSoum("Сүхбаатар");
        holderAddress.setState("Улаанбаатар");
        holderAddress.setStreet(null);
        holderAddress.setTown(null);
        v.setHolderAddress(holderAddress);
        v.setHolderCountry("Монгол Улс");
        v.setHolderDevisionUnitName(null);
        v.setHolderFirstname("БАЛДАНГОМБО");
        v.setHolderHandphone(null);
        v.setHolderHomephone(null);
        v.setHolderId("776510");
        v.setHolderLastname("Севетер");
        v.setHolderRegnum("АА00101229");
        v.setHolderType("Хувь хүн");
        v.setHolderWorkphone(null);
        v.setImportDate(MockHelper.generateDate(2017, 4, 4));
        v.setInspAmount(null);
        v.setInspVat(null);
        v.setIntent(null);
        v.setLength(4480.0f);
        v.setManCount(5);
        v.setMarkName("Toyota");
        v.setMass(1350.0f);
        v.setModelName("Prius");
        v.setModificaceName("XW30");
        v.setMotorNumber(null);
        v.setOwnerApartmentNo(null);
        v.setOwnerCellPhone(null);
        v.setOwnerCountry(null);
        v.setOwnerDevisionUnitName(null);
        v.setOwnerDistrict(null);
        v.setOwnerDoorNo(null);
        v.setOwnerFirstName(null);
        v.setOwnerHomePhone(null);
        v.setOwnerLastName(null);
        v.setOwnerMicroDistrictName(null);
        v.setOwnerProvince(null);
        v.setOwnerRegnum(null);
        v.setOwnerStreet(null);
        v.setOwnerTypeName(null);
        v.setOwnerWorkPhone(null);
        v.setPlateNumber("0001УАА");
        v.setPurposeId("1");
        v.setPurposeName("Суудал");
        v.setRfidTag(null);
        v.setStartDate(MockHelper.generateDate(2017, 6, 17));
        v.setTransmission(null);
        v.setType("Олон зориулалттай");
        v.setTypeId(0);
        v.setVehicleId("123456");
        v.setWeight(0.0f);
        v.setWheelPosition("Баруун");
        v.setWidth(1745.0f);
        response.getList().add(v);

        var r = new ServiceResponse();
        r.setRequest(request);
        r.setRequestId("1");
        r.setResultCode(0);
        r.setResultMessage("OK");
        r.setResponse(response);
        return r;
    }

    @Override
    public ServiceResponse ws100412GetTransportInfo(TransportRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100411VehicleImportInfo(ServiceVehicleImportInfoData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100420GetOrganizationVehicleList(ServiceVehicleOrganizationRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100429TransportConclutionResponseInfo(GetECDataRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100451VerifyPaymentInfo(VerifyPaymentInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100421GetPreOwnedVehicle(VehicleRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100481GetSavedNumberList(GetSavedNumberListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100493ReportTotalPassenger(ReportTotalTripRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100437VehicleLegalEntityTotal(OrgRegnumRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100476BorderRegisteredPassengers(BorderRegisteredPassengersInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100438GetPreOwnedOrgVehicleTotal(OrgRegnumRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100402GetVehicleOwnerHistoryList(VehicleRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100488SavePlateNumber(SavePlateNumberRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100435GetPreOwnedVehicleWithOrgRegnum(VehicleLegalEntityInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100475GetBusLocation(GetBusLocationRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100452VehicleOwnershipTransferVerification(VehicleOwnershipTransferVerificationRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100416GetOwnerInfo(OwnerRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100467FreightTransportTrainDocumentList(FreightTransportTrainDocListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws101401VehicleTaxInfoService(VehicleTaxInfoServiceRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100470VehicleBorderInfo(VehicleBorderInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100403GetVehiclePenaltyList(ServiceVehiclePenaltyInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100430TransportConflictInfo(GetECDataRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100454GetDriverInfoWithRegisterAndLicense(ServiceDriverLicenseInfoData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100407GetDriverLicenseInfo(ServiceDriverLicenseInfoData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100418VehicleLimitedInfo(VehicleLimitedRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100447TechnicalReviewDirectory(OwnerWaterWayVechicleDirectoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100415VehicleInfoList(VehicleListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100462TransportCompanyList(TransportCompanyListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100440PayInvoice(PayInvoiceRequest request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100455TollInvoiceDetails(TollInvoiceDetailsRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100466TransportCompanyCreateWorker(TransportCompanyCreateWorkerRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100423BorderRegisteredTransportInfo(VehicleBorderPassRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100460MandatoryInsuranceCaseList(MandatoryInsuranceCaseListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100477BorderRegisteredTransport(BorderRegisteredTransportInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100419VehicleBorderPass(VehicleBorderPassRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100486CheckVehicleOwnerRegistration(CheckVehicleOwnerRegistrationRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100458MandatoryInsuranceShortList(MandatoryInsuranceShortListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100468FreightTransportTrainDocumentDetail(FreightTransportTrainDocDetailRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100442DriverLicenseExpireSoonLog() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100478CheckPassenger(CheckPassengerRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100490RegisterPlateNumberOwner(RegisterPlateNumberOwnerRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100432GetVehicleInspectionDataByPlateNo(VehicleInspectionByPlateNoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100499ProductList(ProductListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100410IsVehicleCheck(VehicleRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100424BorderRegisteredPassengerInfo(VehicleBorderPassRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100483GetAvailableNumberList(GetAvailableNumberListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100469SasCompanyInfoList(SasCompanyInfoListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100439UnpaidInvoiceInfo(CitizenPenaltyListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100427TransportOrganizationCarsInfo(ServiceVehicleOrganizationRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100459MandatoryInsuranceDetailList(MandatoryInsuranceDetailListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100497PoliceECLicenseChecker(PoliceECLicenseCheckerRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100401GetVehicleInfo(VehicleRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100473GetBusDirectionList(GetBusDirectionListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100448DrivingRightsDirectory(CitizenPenaltyListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100465TransportCompanyRouteList(TransportCompanyRouteListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100446OwnerWaterWayVechicleDirectory(OwnerWaterWayVechicleDirectoryRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100434CheckECLIcenseFromKiosk(CheckECLIcenseFromKioskRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100428TransportCheckGPSPayment(TransportCheckGPSPaymentRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100463TransportCompanyVehiclesList(TransportCompanyVehiclesListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100485PlateNumberAffiliation(PlateNumberAffiliationRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100464TransportCompanyEmployeeList(TransportCompanyEmployeeListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100417SpecialDriverInfo(SpecialDriverRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100405GetVehicleTaxInfo(VehicleRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100498ECLicenseCancel(EcLicenseCancelRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100480VehicleAndDriverBorderReport(VehicleAndDriverBorderReportRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100408UpdatePenaltyPayment(ServiceUpdatePenaltyPaymentRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100472PlateBorderInfo(PlateBorderInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100457GetInternationalDriverInfo(GetInternationalDriverInfoRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100487OwnerVehicleList(OwnerVehicleListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100409GetVehicleInspectionInfo(VehicleInspectionRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100495ECLicenseCreator(EcLicenseCreatorRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100453VehicleBorrowCheck(VehicleBorrowCheckRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100484NumberSaveAvailability(NumberSaveAvailabilityRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100449VehicleCertificate(VehicleCertRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100425GetImportExportItemExpandList(GetImportExportRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100431PermittedVehiclesList(PermittedVehiclesListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100413GetInternationalDriverLicenseInfo(InternationalDriverLicenseRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100450VehicleOwnershipTransfer(VehicleOwnershipTransferRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100433UnlicensedVehiclesList(PermittedVehiclesListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100443DriverLicenseExpiredLog() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100491TransferPlateNumberOwner(TransferPlateNumberOwnerRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100496ECLicenseChecker(EcLicenseCheckerRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100426TransportGetOrganizationInfo(ServiceVehicleOrganizationRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100482GetReservedNumberList(GetReservedNumberListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100456GetFineInfoUsingFineNumber(GetFineInfoUsingFineNumberRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100492ReportTotalTrip(ReportTotalTripRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ServiceResponse ws100494UnpaidInvoiceInfoByPlateNo(CitizenPenaltyListRequestData request) {
        throw new UnsupportedOperationException("not supported");
    }
}
