
package mn.gov.xyp.citizen;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conformityCertificateListDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conformityCertificateListDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erpBranchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erpBranchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileList" type="{http://citizen.xyp.gov.mn/}conformityCertificateListFileList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromAddressSoumCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productList" type="{http://citizen.xyp.gov.mn/}conformityCertificateListProductList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="qrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referSpecialPermitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referSpecialPermitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referTohiroliinGerchilgeeniiTurulIcon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referTohiroliinGerchilgeeniiTurulId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referTohiroliinGerchilgeeniiTurulName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialPermitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialPermitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toAddressSoumCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toCountryNameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toCountryNameMn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viaAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viaCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viaCountryNameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viaCountryNameMn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viaFactoryCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viaFactoryCountryNameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viaFactoryCountryNameMn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webUserFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webUserImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webUserLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webUserPassportAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webUserRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cDateBadge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conformityCertificateListDetailData", propOrder = {
    "code",
    "erpBranchId",
    "erpBranchName",
    "fileList",
    "fromAddress",
    "fromAddressSoumCode",
    "fromEmailAddress",
    "fromName",
    "fromPhone",
    "fromRegister",
    "id",
    "invoiceDate",
    "invoiceNumber",
    "isOrg",
    "productList",
    "qrCode",
    "referSpecialPermitId",
    "referSpecialPermitName",
    "referTohiroliinGerchilgeeniiTurulIcon",
    "referTohiroliinGerchilgeeniiTurulId",
    "referTohiroliinGerchilgeeniiTurulName",
    "specialPermitDate",
    "specialPermitNumber",
    "status",
    "statusName",
    "toAddress",
    "toAddressSoumCode",
    "toCountryNameEng",
    "toCountryNameMn",
    "toEmailAddress",
    "toName",
    "toPhone",
    "viaAddress",
    "viaCountry",
    "viaCountryNameEng",
    "viaCountryNameMn",
    "viaFactoryCountry",
    "viaFactoryCountryNameEng",
    "viaFactoryCountryNameMn",
    "viaName",
    "webUserFirstname",
    "webUserId",
    "webUserImage",
    "webUserLastname",
    "webUserPassportAddress",
    "webUserRegnum",
    "cDate",
    "cDateBadge",
    "mDate"
})
public class ConformityCertificateListDetailData {

    protected String code;
    protected String erpBranchId;
    protected String erpBranchName;
    @XmlElement(nillable = true)
    protected List<ConformityCertificateListFileList> fileList;
    protected String fromAddress;
    protected String fromAddressSoumCode;
    protected String fromEmailAddress;
    protected String fromName;
    protected String fromPhone;
    protected String fromRegister;
    protected String id;
    protected String invoiceDate;
    protected String invoiceNumber;
    protected String isOrg;
    @XmlElement(nillable = true)
    protected List<ConformityCertificateListProductList> productList;
    protected String qrCode;
    protected String referSpecialPermitId;
    protected String referSpecialPermitName;
    protected String referTohiroliinGerchilgeeniiTurulIcon;
    protected String referTohiroliinGerchilgeeniiTurulId;
    protected String referTohiroliinGerchilgeeniiTurulName;
    protected String specialPermitDate;
    protected String specialPermitNumber;
    protected String status;
    protected String statusName;
    protected String toAddress;
    protected String toAddressSoumCode;
    protected String toCountryNameEng;
    protected String toCountryNameMn;
    protected String toEmailAddress;
    protected String toName;
    protected String toPhone;
    protected String viaAddress;
    protected String viaCountry;
    protected String viaCountryNameEng;
    protected String viaCountryNameMn;
    protected String viaFactoryCountry;
    protected String viaFactoryCountryNameEng;
    protected String viaFactoryCountryNameMn;
    protected String viaName;
    protected String webUserFirstname;
    protected String webUserId;
    protected String webUserImage;
    protected String webUserLastname;
    protected String webUserPassportAddress;
    protected String webUserRegnum;
    protected String cDate;
    protected String cDateBadge;
    protected String mDate;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the erpBranchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErpBranchId() {
        return erpBranchId;
    }

    /**
     * Sets the value of the erpBranchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErpBranchId(String value) {
        this.erpBranchId = value;
    }

    /**
     * Gets the value of the erpBranchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErpBranchName() {
        return erpBranchName;
    }

    /**
     * Sets the value of the erpBranchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErpBranchName(String value) {
        this.erpBranchName = value;
    }

    /**
     * Gets the value of the fileList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformityCertificateListFileList }
     * 
     * 
     */
    public List<ConformityCertificateListFileList> getFileList() {
        if (fileList == null) {
            fileList = new ArrayList<ConformityCertificateListFileList>();
        }
        return this.fileList;
    }

    /**
     * Gets the value of the fromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * Sets the value of the fromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAddress(String value) {
        this.fromAddress = value;
    }

    /**
     * Gets the value of the fromAddressSoumCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAddressSoumCode() {
        return fromAddressSoumCode;
    }

    /**
     * Sets the value of the fromAddressSoumCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAddressSoumCode(String value) {
        this.fromAddressSoumCode = value;
    }

    /**
     * Gets the value of the fromEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromEmailAddress() {
        return fromEmailAddress;
    }

    /**
     * Sets the value of the fromEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromEmailAddress(String value) {
        this.fromEmailAddress = value;
    }

    /**
     * Gets the value of the fromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Sets the value of the fromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Gets the value of the fromPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPhone() {
        return fromPhone;
    }

    /**
     * Sets the value of the fromPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPhone(String value) {
        this.fromPhone = value;
    }

    /**
     * Gets the value of the fromRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromRegister() {
        return fromRegister;
    }

    /**
     * Sets the value of the fromRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromRegister(String value) {
        this.fromRegister = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the isOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOrg() {
        return isOrg;
    }

    /**
     * Sets the value of the isOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOrg(String value) {
        this.isOrg = value;
    }

    /**
     * Gets the value of the productList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformityCertificateListProductList }
     * 
     * 
     */
    public List<ConformityCertificateListProductList> getProductList() {
        if (productList == null) {
            productList = new ArrayList<ConformityCertificateListProductList>();
        }
        return this.productList;
    }

    /**
     * Gets the value of the qrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrCode() {
        return qrCode;
    }

    /**
     * Sets the value of the qrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrCode(String value) {
        this.qrCode = value;
    }

    /**
     * Gets the value of the referSpecialPermitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferSpecialPermitId() {
        return referSpecialPermitId;
    }

    /**
     * Sets the value of the referSpecialPermitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferSpecialPermitId(String value) {
        this.referSpecialPermitId = value;
    }

    /**
     * Gets the value of the referSpecialPermitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferSpecialPermitName() {
        return referSpecialPermitName;
    }

    /**
     * Sets the value of the referSpecialPermitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferSpecialPermitName(String value) {
        this.referSpecialPermitName = value;
    }

    /**
     * Gets the value of the referTohiroliinGerchilgeeniiTurulIcon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferTohiroliinGerchilgeeniiTurulIcon() {
        return referTohiroliinGerchilgeeniiTurulIcon;
    }

    /**
     * Sets the value of the referTohiroliinGerchilgeeniiTurulIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferTohiroliinGerchilgeeniiTurulIcon(String value) {
        this.referTohiroliinGerchilgeeniiTurulIcon = value;
    }

    /**
     * Gets the value of the referTohiroliinGerchilgeeniiTurulId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferTohiroliinGerchilgeeniiTurulId() {
        return referTohiroliinGerchilgeeniiTurulId;
    }

    /**
     * Sets the value of the referTohiroliinGerchilgeeniiTurulId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferTohiroliinGerchilgeeniiTurulId(String value) {
        this.referTohiroliinGerchilgeeniiTurulId = value;
    }

    /**
     * Gets the value of the referTohiroliinGerchilgeeniiTurulName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferTohiroliinGerchilgeeniiTurulName() {
        return referTohiroliinGerchilgeeniiTurulName;
    }

    /**
     * Sets the value of the referTohiroliinGerchilgeeniiTurulName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferTohiroliinGerchilgeeniiTurulName(String value) {
        this.referTohiroliinGerchilgeeniiTurulName = value;
    }

    /**
     * Gets the value of the specialPermitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialPermitDate() {
        return specialPermitDate;
    }

    /**
     * Sets the value of the specialPermitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialPermitDate(String value) {
        this.specialPermitDate = value;
    }

    /**
     * Gets the value of the specialPermitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialPermitNumber() {
        return specialPermitNumber;
    }

    /**
     * Sets the value of the specialPermitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialPermitNumber(String value) {
        this.specialPermitNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

    /**
     * Gets the value of the toAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAddress() {
        return toAddress;
    }

    /**
     * Sets the value of the toAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAddress(String value) {
        this.toAddress = value;
    }

    /**
     * Gets the value of the toAddressSoumCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAddressSoumCode() {
        return toAddressSoumCode;
    }

    /**
     * Sets the value of the toAddressSoumCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAddressSoumCode(String value) {
        this.toAddressSoumCode = value;
    }

    /**
     * Gets the value of the toCountryNameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountryNameEng() {
        return toCountryNameEng;
    }

    /**
     * Sets the value of the toCountryNameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountryNameEng(String value) {
        this.toCountryNameEng = value;
    }

    /**
     * Gets the value of the toCountryNameMn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountryNameMn() {
        return toCountryNameMn;
    }

    /**
     * Sets the value of the toCountryNameMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountryNameMn(String value) {
        this.toCountryNameMn = value;
    }

    /**
     * Gets the value of the toEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToEmailAddress() {
        return toEmailAddress;
    }

    /**
     * Sets the value of the toEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToEmailAddress(String value) {
        this.toEmailAddress = value;
    }

    /**
     * Gets the value of the toName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToName() {
        return toName;
    }

    /**
     * Sets the value of the toName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToName(String value) {
        this.toName = value;
    }

    /**
     * Gets the value of the toPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToPhone() {
        return toPhone;
    }

    /**
     * Sets the value of the toPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToPhone(String value) {
        this.toPhone = value;
    }

    /**
     * Gets the value of the viaAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaAddress() {
        return viaAddress;
    }

    /**
     * Sets the value of the viaAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaAddress(String value) {
        this.viaAddress = value;
    }

    /**
     * Gets the value of the viaCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaCountry() {
        return viaCountry;
    }

    /**
     * Sets the value of the viaCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaCountry(String value) {
        this.viaCountry = value;
    }

    /**
     * Gets the value of the viaCountryNameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaCountryNameEng() {
        return viaCountryNameEng;
    }

    /**
     * Sets the value of the viaCountryNameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaCountryNameEng(String value) {
        this.viaCountryNameEng = value;
    }

    /**
     * Gets the value of the viaCountryNameMn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaCountryNameMn() {
        return viaCountryNameMn;
    }

    /**
     * Sets the value of the viaCountryNameMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaCountryNameMn(String value) {
        this.viaCountryNameMn = value;
    }

    /**
     * Gets the value of the viaFactoryCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaFactoryCountry() {
        return viaFactoryCountry;
    }

    /**
     * Sets the value of the viaFactoryCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaFactoryCountry(String value) {
        this.viaFactoryCountry = value;
    }

    /**
     * Gets the value of the viaFactoryCountryNameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaFactoryCountryNameEng() {
        return viaFactoryCountryNameEng;
    }

    /**
     * Sets the value of the viaFactoryCountryNameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaFactoryCountryNameEng(String value) {
        this.viaFactoryCountryNameEng = value;
    }

    /**
     * Gets the value of the viaFactoryCountryNameMn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaFactoryCountryNameMn() {
        return viaFactoryCountryNameMn;
    }

    /**
     * Sets the value of the viaFactoryCountryNameMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaFactoryCountryNameMn(String value) {
        this.viaFactoryCountryNameMn = value;
    }

    /**
     * Gets the value of the viaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaName() {
        return viaName;
    }

    /**
     * Sets the value of the viaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaName(String value) {
        this.viaName = value;
    }

    /**
     * Gets the value of the webUserFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUserFirstname() {
        return webUserFirstname;
    }

    /**
     * Sets the value of the webUserFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUserFirstname(String value) {
        this.webUserFirstname = value;
    }

    /**
     * Gets the value of the webUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUserId() {
        return webUserId;
    }

    /**
     * Sets the value of the webUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUserId(String value) {
        this.webUserId = value;
    }

    /**
     * Gets the value of the webUserImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUserImage() {
        return webUserImage;
    }

    /**
     * Sets the value of the webUserImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUserImage(String value) {
        this.webUserImage = value;
    }

    /**
     * Gets the value of the webUserLastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUserLastname() {
        return webUserLastname;
    }

    /**
     * Sets the value of the webUserLastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUserLastname(String value) {
        this.webUserLastname = value;
    }

    /**
     * Gets the value of the webUserPassportAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUserPassportAddress() {
        return webUserPassportAddress;
    }

    /**
     * Sets the value of the webUserPassportAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUserPassportAddress(String value) {
        this.webUserPassportAddress = value;
    }

    /**
     * Gets the value of the webUserRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUserRegnum() {
        return webUserRegnum;
    }

    /**
     * Sets the value of the webUserRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUserRegnum(String value) {
        this.webUserRegnum = value;
    }

    /**
     * Gets the value of the cDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDate() {
        return cDate;
    }

    /**
     * Sets the value of the cDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDate(String value) {
        this.cDate = value;
    }

    /**
     * Gets the value of the cDateBadge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDateBadge() {
        return cDateBadge;
    }

    /**
     * Sets the value of the cDateBadge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDateBadge(String value) {
        this.cDateBadge = value;
    }

    /**
     * Gets the value of the mDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDate() {
        return mDate;
    }

    /**
     * Sets the value of the mDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDate(String value) {
        this.mDate = value;
    }

}
