
package mn.gov.xyp.transport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transportCompanyListResponseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transportCompanyListResponseData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyNameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faxNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isLicenseImport" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isLicenseProduce" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isLicenseSell" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isLicenseService" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isLicenseTransport" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isSecured" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="licenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="registrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sasCompanyId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transportCompanyListResponseData", propOrder = {
    "companyName",
    "companyNameEng",
    "description",
    "email",
    "faxNumber",
    "id",
    "isLicenseImport",
    "isLicenseProduce",
    "isLicenseSell",
    "isLicenseService",
    "isLicenseTransport",
    "isSecured",
    "licenseNumber",
    "phoneNumber",
    "registrationNumber",
    "regnum",
    "sasCompanyId"
})
public class TransportCompanyListResponseData {

    protected String companyName;
    protected String companyNameEng;
    protected String description;
    protected String email;
    protected int faxNumber;
    protected int id;
    protected int isLicenseImport;
    protected int isLicenseProduce;
    protected int isLicenseSell;
    protected int isLicenseService;
    protected int isLicenseTransport;
    protected int isSecured;
    protected String licenseNumber;
    protected int phoneNumber;
    protected String registrationNumber;
    protected String regnum;
    protected int sasCompanyId;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyNameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNameEng() {
        return companyNameEng;
    }

    /**
     * Sets the value of the companyNameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNameEng(String value) {
        this.companyNameEng = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     */
    public int getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     */
    public void setFaxNumber(int value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the isLicenseImport property.
     * 
     */
    public int getIsLicenseImport() {
        return isLicenseImport;
    }

    /**
     * Sets the value of the isLicenseImport property.
     * 
     */
    public void setIsLicenseImport(int value) {
        this.isLicenseImport = value;
    }

    /**
     * Gets the value of the isLicenseProduce property.
     * 
     */
    public int getIsLicenseProduce() {
        return isLicenseProduce;
    }

    /**
     * Sets the value of the isLicenseProduce property.
     * 
     */
    public void setIsLicenseProduce(int value) {
        this.isLicenseProduce = value;
    }

    /**
     * Gets the value of the isLicenseSell property.
     * 
     */
    public int getIsLicenseSell() {
        return isLicenseSell;
    }

    /**
     * Sets the value of the isLicenseSell property.
     * 
     */
    public void setIsLicenseSell(int value) {
        this.isLicenseSell = value;
    }

    /**
     * Gets the value of the isLicenseService property.
     * 
     */
    public int getIsLicenseService() {
        return isLicenseService;
    }

    /**
     * Sets the value of the isLicenseService property.
     * 
     */
    public void setIsLicenseService(int value) {
        this.isLicenseService = value;
    }

    /**
     * Gets the value of the isLicenseTransport property.
     * 
     */
    public int getIsLicenseTransport() {
        return isLicenseTransport;
    }

    /**
     * Sets the value of the isLicenseTransport property.
     * 
     */
    public void setIsLicenseTransport(int value) {
        this.isLicenseTransport = value;
    }

    /**
     * Gets the value of the isSecured property.
     * 
     */
    public int getIsSecured() {
        return isSecured;
    }

    /**
     * Sets the value of the isSecured property.
     * 
     */
    public void setIsSecured(int value) {
        this.isSecured = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     */
    public void setPhoneNumber(int value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the regnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnum(String value) {
        this.regnum = value;
    }

    /**
     * Gets the value of the sasCompanyId property.
     * 
     */
    public int getSasCompanyId() {
        return sasCompanyId;
    }

    /**
     * Sets the value of the sasCompanyId property.
     * 
     */
    public void setSasCompanyId(int value) {
        this.sasCompanyId = value;
    }

}
