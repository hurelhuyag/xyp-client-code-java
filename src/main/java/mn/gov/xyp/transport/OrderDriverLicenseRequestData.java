
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderDriverLicenseRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderDriverLicenseRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://transport.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="civilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactFName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deliveryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deliveryType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eyeColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hairColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="licenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="licensePeriod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="phoneNum1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNum2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="signImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderDriverLicenseRequestData", propOrder = {
    "civilId",
    "contactFName",
    "contactLName",
    "deliveryAddress",
    "deliveryType",
    "email",
    "eyeColor",
    "hairColor",
    "height",
    "invoiceDate",
    "licenseNumber",
    "licensePeriod",
    "phoneNum1",
    "phoneNum2",
    "reason",
    "reasonId",
    "regnum",
    "requestId",
    "requestType",
    "signImage",
    "statusText",
    "weight"
})
public class OrderDriverLicenseRequestData
    extends ServiceRequest
{

    protected String civilId;
    protected String contactFName;
    protected String contactLName;
    protected String deliveryAddress;
    protected int deliveryType;
    protected String email;
    protected String eyeColor;
    protected String hairColor;
    protected int height;
    protected String invoiceDate;
    protected String licenseNumber;
    protected int licensePeriod;
    protected String phoneNum1;
    protected String phoneNum2;
    protected String reason;
    protected int reasonId;
    protected String regnum;
    protected String requestId;
    protected String requestType;
    protected String signImage;
    protected String statusText;
    protected int weight;

    /**
     * Gets the value of the civilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilId() {
        return civilId;
    }

    /**
     * Sets the value of the civilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilId(String value) {
        this.civilId = value;
    }

    /**
     * Gets the value of the contactFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFName() {
        return contactFName;
    }

    /**
     * Sets the value of the contactFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFName(String value) {
        this.contactFName = value;
    }

    /**
     * Gets the value of the contactLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLName() {
        return contactLName;
    }

    /**
     * Sets the value of the contactLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLName(String value) {
        this.contactLName = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryAddress(String value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     */
    public int getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     */
    public void setDeliveryType(int value) {
        this.deliveryType = value;
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
     * Gets the value of the eyeColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEyeColor() {
        return eyeColor;
    }

    /**
     * Sets the value of the eyeColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEyeColor(String value) {
        this.eyeColor = value;
    }

    /**
     * Gets the value of the hairColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHairColor() {
        return hairColor;
    }

    /**
     * Sets the value of the hairColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHairColor(String value) {
        this.hairColor = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
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
     * Gets the value of the licensePeriod property.
     * 
     */
    public int getLicensePeriod() {
        return licensePeriod;
    }

    /**
     * Sets the value of the licensePeriod property.
     * 
     */
    public void setLicensePeriod(int value) {
        this.licensePeriod = value;
    }

    /**
     * Gets the value of the phoneNum1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNum1() {
        return phoneNum1;
    }

    /**
     * Sets the value of the phoneNum1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNum1(String value) {
        this.phoneNum1 = value;
    }

    /**
     * Gets the value of the phoneNum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNum2() {
        return phoneNum2;
    }

    /**
     * Sets the value of the phoneNum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNum2(String value) {
        this.phoneNum2 = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the reasonId property.
     * 
     */
    public int getReasonId() {
        return reasonId;
    }

    /**
     * Sets the value of the reasonId property.
     * 
     */
    public void setReasonId(int value) {
        this.reasonId = value;
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
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the signImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignImage() {
        return signImage;
    }

    /**
     * Sets the value of the signImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignImage(String value) {
        this.signImage = value;
    }

    /**
     * Gets the value of the statusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * Sets the value of the statusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusText(String value) {
        this.statusText = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(int value) {
        this.weight = value;
    }

}
