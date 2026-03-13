
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPassData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPassData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deceaseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divorceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fatherGivenname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fatherRegisterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fatherRegisteredNum" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="fatherSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foreignNameStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genderENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genderMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givennameENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givennameMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givennameStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idcardPhoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherGivenname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherRegisterEdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherRegisterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationalityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportPhoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registeredNum" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="regnumENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnumMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surnameENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surnameMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surnameStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="twinStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPassData", propOrder = {
    "birthDate",
    "deceaseStatus",
    "divorceStatus",
    "fatherGivenname",
    "fatherRegisterNum",
    "fatherRegisteredNum",
    "fatherSurname",
    "foreignNameStatus",
    "genderENG",
    "genderMN",
    "givennameENG",
    "givennameMN",
    "givennameStatus",
    "idcardPhoto",
    "motherGivenname",
    "motherRegisterEdNum",
    "motherRegisterNum",
    "motherSurname",
    "nationalityStatus",
    "origin",
    "passportPhoto",
    "passportStatus",
    "registerStatus",
    "registeredNum",
    "regnumENG",
    "regnumMN",
    "surnameENG",
    "surnameMN",
    "surnameStatus",
    "twinStatus"
})
public class GetPassData {

    protected String birthDate;
    protected String deceaseStatus;
    protected String divorceStatus;
    protected String fatherGivenname;
    protected String fatherRegisterNum;
    protected long fatherRegisteredNum;
    protected String fatherSurname;
    protected String foreignNameStatus;
    protected String genderENG;
    protected String genderMN;
    protected String givennameENG;
    protected String givennameMN;
    protected String givennameStatus;
    protected String idcardPhoto;
    protected String motherGivenname;
    protected String motherRegisterEdNum;
    protected String motherRegisterNum;
    protected String motherSurname;
    protected String nationalityStatus;
    protected String origin;
    protected String passportPhoto;
    protected String passportStatus;
    protected String registerStatus;
    protected long registeredNum;
    protected String regnumENG;
    protected String regnumMN;
    protected String surnameENG;
    protected String surnameMN;
    protected String surnameStatus;
    protected String twinStatus;

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
     * Gets the value of the deceaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseStatus() {
        return deceaseStatus;
    }

    /**
     * Sets the value of the deceaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseStatus(String value) {
        this.deceaseStatus = value;
    }

    /**
     * Gets the value of the divorceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivorceStatus() {
        return divorceStatus;
    }

    /**
     * Sets the value of the divorceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivorceStatus(String value) {
        this.divorceStatus = value;
    }

    /**
     * Gets the value of the fatherGivenname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherGivenname() {
        return fatherGivenname;
    }

    /**
     * Sets the value of the fatherGivenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherGivenname(String value) {
        this.fatherGivenname = value;
    }

    /**
     * Gets the value of the fatherRegisterNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherRegisterNum() {
        return fatherRegisterNum;
    }

    /**
     * Sets the value of the fatherRegisterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherRegisterNum(String value) {
        this.fatherRegisterNum = value;
    }

    /**
     * Gets the value of the fatherRegisteredNum property.
     * 
     */
    public long getFatherRegisteredNum() {
        return fatherRegisteredNum;
    }

    /**
     * Sets the value of the fatherRegisteredNum property.
     * 
     */
    public void setFatherRegisteredNum(long value) {
        this.fatherRegisteredNum = value;
    }

    /**
     * Gets the value of the fatherSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherSurname() {
        return fatherSurname;
    }

    /**
     * Sets the value of the fatherSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherSurname(String value) {
        this.fatherSurname = value;
    }

    /**
     * Gets the value of the foreignNameStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignNameStatus() {
        return foreignNameStatus;
    }

    /**
     * Sets the value of the foreignNameStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignNameStatus(String value) {
        this.foreignNameStatus = value;
    }

    /**
     * Gets the value of the genderENG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderENG() {
        return genderENG;
    }

    /**
     * Sets the value of the genderENG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderENG(String value) {
        this.genderENG = value;
    }

    /**
     * Gets the value of the genderMN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderMN() {
        return genderMN;
    }

    /**
     * Sets the value of the genderMN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderMN(String value) {
        this.genderMN = value;
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
     * Gets the value of the givennameMN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivennameMN() {
        return givennameMN;
    }

    /**
     * Sets the value of the givennameMN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivennameMN(String value) {
        this.givennameMN = value;
    }

    /**
     * Gets the value of the givennameStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivennameStatus() {
        return givennameStatus;
    }

    /**
     * Sets the value of the givennameStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivennameStatus(String value) {
        this.givennameStatus = value;
    }

    /**
     * Gets the value of the idcardPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardPhoto() {
        return idcardPhoto;
    }

    /**
     * Sets the value of the idcardPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardPhoto(String value) {
        this.idcardPhoto = value;
    }

    /**
     * Gets the value of the motherGivenname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherGivenname() {
        return motherGivenname;
    }

    /**
     * Sets the value of the motherGivenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherGivenname(String value) {
        this.motherGivenname = value;
    }

    /**
     * Gets the value of the motherRegisterEdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherRegisterEdNum() {
        return motherRegisterEdNum;
    }

    /**
     * Sets the value of the motherRegisterEdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherRegisterEdNum(String value) {
        this.motherRegisterEdNum = value;
    }

    /**
     * Gets the value of the motherRegisterNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherRegisterNum() {
        return motherRegisterNum;
    }

    /**
     * Sets the value of the motherRegisterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherRegisterNum(String value) {
        this.motherRegisterNum = value;
    }

    /**
     * Gets the value of the motherSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherSurname() {
        return motherSurname;
    }

    /**
     * Sets the value of the motherSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherSurname(String value) {
        this.motherSurname = value;
    }

    /**
     * Gets the value of the nationalityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityStatus() {
        return nationalityStatus;
    }

    /**
     * Sets the value of the nationalityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityStatus(String value) {
        this.nationalityStatus = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
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
     * Gets the value of the registerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterStatus() {
        return registerStatus;
    }

    /**
     * Sets the value of the registerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterStatus(String value) {
        this.registerStatus = value;
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
     * Gets the value of the surnameENG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameENG() {
        return surnameENG;
    }

    /**
     * Sets the value of the surnameENG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameENG(String value) {
        this.surnameENG = value;
    }

    /**
     * Gets the value of the surnameMN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameMN() {
        return surnameMN;
    }

    /**
     * Sets the value of the surnameMN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameMN(String value) {
        this.surnameMN = value;
    }

    /**
     * Gets the value of the surnameStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameStatus() {
        return surnameStatus;
    }

    /**
     * Sets the value of the surnameStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameStatus(String value) {
        this.surnameStatus = value;
    }

    /**
     * Gets the value of the twinStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwinStatus() {
        return twinStatus;
    }

    /**
     * Sets the value of the twinStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwinStatus(String value) {
        this.twinStatus = value;
    }

}
