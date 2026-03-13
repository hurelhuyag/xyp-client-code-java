
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getIDCardInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getIDCardInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressLines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateOfExpiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="familyNameMn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forenameMn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenNameMn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givennameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issuerAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnumEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surnameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surnameMn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tolov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIDCardInfoDetailData", propOrder = {
    "addressLines",
    "birthDate",
    "confirmedDate",
    "createdDate",
    "dateOfExpiry",
    "dateOfIssue",
    "familyNameMn",
    "forenameMn",
    "givenNameMn",
    "givennameEn",
    "issuerAuthority",
    "newRegistrationNumber",
    "placeOfBirth",
    "regnum",
    "regnumEng",
    "surnameEn",
    "surnameMn",
    "tolov"
})
public class GetIDCardInfoDetailData {

    protected String addressLines;
    protected String birthDate;
    protected String confirmedDate;
    protected String createdDate;
    protected String dateOfExpiry;
    protected String dateOfIssue;
    protected String familyNameMn;
    protected String forenameMn;
    protected String givenNameMn;
    protected String givennameEn;
    protected String issuerAuthority;
    protected long newRegistrationNumber;
    protected String placeOfBirth;
    protected String regnum;
    protected String regnumEng;
    protected String surnameEn;
    protected String surnameMn;
    protected String tolov;

    /**
     * Gets the value of the addressLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLines() {
        return addressLines;
    }

    /**
     * Sets the value of the addressLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLines(String value) {
        this.addressLines = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the confirmedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmedDate() {
        return confirmedDate;
    }

    /**
     * Sets the value of the confirmedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmedDate(String value) {
        this.confirmedDate = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the dateOfExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    /**
     * Sets the value of the dateOfExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfExpiry(String value) {
        this.dateOfExpiry = value;
    }

    /**
     * Gets the value of the dateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * Sets the value of the dateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfIssue(String value) {
        this.dateOfIssue = value;
    }

    /**
     * Gets the value of the familyNameMn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyNameMn() {
        return familyNameMn;
    }

    /**
     * Sets the value of the familyNameMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyNameMn(String value) {
        this.familyNameMn = value;
    }

    /**
     * Gets the value of the forenameMn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForenameMn() {
        return forenameMn;
    }

    /**
     * Sets the value of the forenameMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForenameMn(String value) {
        this.forenameMn = value;
    }

    /**
     * Gets the value of the givenNameMn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenNameMn() {
        return givenNameMn;
    }

    /**
     * Sets the value of the givenNameMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenNameMn(String value) {
        this.givenNameMn = value;
    }

    /**
     * Gets the value of the givennameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivennameEn() {
        return givennameEn;
    }

    /**
     * Sets the value of the givennameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivennameEn(String value) {
        this.givennameEn = value;
    }

    /**
     * Gets the value of the issuerAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerAuthority() {
        return issuerAuthority;
    }

    /**
     * Sets the value of the issuerAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerAuthority(String value) {
        this.issuerAuthority = value;
    }

    /**
     * Gets the value of the newRegistrationNumber property.
     * 
     */
    public long getNewRegistrationNumber() {
        return newRegistrationNumber;
    }

    /**
     * Sets the value of the newRegistrationNumber property.
     * 
     */
    public void setNewRegistrationNumber(long value) {
        this.newRegistrationNumber = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
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
     * Gets the value of the regnumEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnumEng() {
        return regnumEng;
    }

    /**
     * Sets the value of the regnumEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnumEng(String value) {
        this.regnumEng = value;
    }

    /**
     * Gets the value of the surnameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameEn() {
        return surnameEn;
    }

    /**
     * Sets the value of the surnameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameEn(String value) {
        this.surnameEn = value;
    }

    /**
     * Gets the value of the surnameMn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameMn() {
        return surnameMn;
    }

    /**
     * Sets the value of the surnameMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameMn(String value) {
        this.surnameMn = value;
    }

    /**
     * Gets the value of the tolov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTolov() {
        return tolov;
    }

    /**
     * Sets the value of the tolov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTolov(String value) {
        this.tolov = value;
    }

}
