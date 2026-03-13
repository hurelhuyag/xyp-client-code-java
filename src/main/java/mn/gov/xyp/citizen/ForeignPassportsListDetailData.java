
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foreignPassportsListDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foreignPassportsListDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givennameENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportPhoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registeredNum" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="regnumENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnumMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surNameMn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foreignPassportsListDetailData", propOrder = {
    "expiryDate",
    "extendDate",
    "givennameENG",
    "issuedDate",
    "passportNum",
    "passportPhoto",
    "passportStatus",
    "registeredNum",
    "regnumENG",
    "regnumMN",
    "surNameMn"
})
public class ForeignPassportsListDetailData {

    protected String expiryDate;
    protected String extendDate;
    protected String givennameENG;
    protected String issuedDate;
    protected String passportNum;
    protected String passportPhoto;
    protected String passportStatus;
    protected long registeredNum;
    protected String regnumENG;
    protected String regnumMN;
    protected String surNameMn;

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the extendDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendDate() {
        return extendDate;
    }

    /**
     * Sets the value of the extendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendDate(String value) {
        this.extendDate = value;
    }

    /**
     * Gets the value of the givennameENG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivennameENG() {
        return givennameENG;
    }

    /**
     * Sets the value of the givennameENG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivennameENG(String value) {
        this.givennameENG = value;
    }

    /**
     * Gets the value of the issuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedDate() {
        return issuedDate;
    }

    /**
     * Sets the value of the issuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedDate(String value) {
        this.issuedDate = value;
    }

    /**
     * Gets the value of the passportNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNum() {
        return passportNum;
    }

    /**
     * Sets the value of the passportNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNum(String value) {
        this.passportNum = value;
    }

    /**
     * Gets the value of the passportPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportPhoto() {
        return passportPhoto;
    }

    /**
     * Sets the value of the passportPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportPhoto(String value) {
        this.passportPhoto = value;
    }

    /**
     * Gets the value of the passportStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportStatus() {
        return passportStatus;
    }

    /**
     * Sets the value of the passportStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportStatus(String value) {
        this.passportStatus = value;
    }

    /**
     * Gets the value of the registeredNum property.
     * 
     */
    public long getRegisteredNum() {
        return registeredNum;
    }

    /**
     * Sets the value of the registeredNum property.
     * 
     */
    public void setRegisteredNum(long value) {
        this.registeredNum = value;
    }

    /**
     * Gets the value of the regnumENG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnumENG() {
        return regnumENG;
    }

    /**
     * Sets the value of the regnumENG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnumENG(String value) {
        this.regnumENG = value;
    }

    /**
     * Gets the value of the regnumMN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnumMN() {
        return regnumMN;
    }

    /**
     * Sets the value of the regnumMN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnumMN(String value) {
        this.regnumMN = value;
    }

    /**
     * Gets the value of the surNameMn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurNameMn() {
        return surNameMn;
    }

    /**
     * Sets the value of the surNameMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurNameMn(String value) {
        this.surNameMn = value;
    }

}
