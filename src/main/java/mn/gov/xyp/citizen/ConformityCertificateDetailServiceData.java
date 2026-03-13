
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conformityCertificateDetailServiceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conformityCertificateDetailServiceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificateCreateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erpBranchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="financeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qrcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonForWritingCertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referTohiroliinGerchilgeeniiTurulIcon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referTohiroliinGerchilgeeniiTurulId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referTohiroliinGerchilgeeniiTurulName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conformityCertificateDetailServiceData", propOrder = {
    "branchName",
    "certificateCreateDate",
    "certificationUrl",
    "code",
    "erpBranchId",
    "financeNumber",
    "id",
    "qrcode",
    "reasonForWritingCertificate",
    "referTohiroliinGerchilgeeniiTurulIcon",
    "referTohiroliinGerchilgeeniiTurulId",
    "referTohiroliinGerchilgeeniiTurulName",
    "userName",
    "validDate",
    "validDay",
    "cDate",
    "cUserId"
})
public class ConformityCertificateDetailServiceData {

    protected String branchName;
    protected String certificateCreateDate;
    protected String certificationUrl;
    protected String code;
    protected String erpBranchId;
    protected String financeNumber;
    protected String id;
    protected String qrcode;
    protected String reasonForWritingCertificate;
    protected String referTohiroliinGerchilgeeniiTurulIcon;
    protected String referTohiroliinGerchilgeeniiTurulId;
    protected String referTohiroliinGerchilgeeniiTurulName;
    protected String userName;
    protected String validDate;
    protected String validDay;
    protected String cDate;
    protected String cUserId;

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the certificateCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateCreateDate() {
        return certificateCreateDate;
    }

    /**
     * Sets the value of the certificateCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateCreateDate(String value) {
        this.certificateCreateDate = value;
    }

    /**
     * Gets the value of the certificationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationUrl() {
        return certificationUrl;
    }

    /**
     * Sets the value of the certificationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationUrl(String value) {
        this.certificationUrl = value;
    }

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
     * Gets the value of the financeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceNumber() {
        return financeNumber;
    }

    /**
     * Sets the value of the financeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceNumber(String value) {
        this.financeNumber = value;
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
     * Gets the value of the qrcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrcode() {
        return qrcode;
    }

    /**
     * Sets the value of the qrcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrcode(String value) {
        this.qrcode = value;
    }

    /**
     * Gets the value of the reasonForWritingCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForWritingCertificate() {
        return reasonForWritingCertificate;
    }

    /**
     * Sets the value of the reasonForWritingCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForWritingCertificate(String value) {
        this.reasonForWritingCertificate = value;
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
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the validDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDate(String value) {
        this.validDate = value;
    }

    /**
     * Gets the value of the validDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDay() {
        return validDay;
    }

    /**
     * Sets the value of the validDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDay(String value) {
        this.validDay = value;
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
     * Gets the value of the cUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUserId() {
        return cUserId;
    }

    /**
     * Sets the value of the cUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUserId(String value) {
        this.cUserId = value;
    }

}
