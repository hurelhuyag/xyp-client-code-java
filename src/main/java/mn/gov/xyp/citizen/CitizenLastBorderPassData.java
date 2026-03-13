
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenLastBorderPassData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenLastBorderPassData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkpointName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenNameCyr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isBack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isDead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isDeadType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isDriver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isEmployee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportExpires" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="portName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regsisterNumCyr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stayDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surnameCyr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="travelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="travelPurposeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trusteeBirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trusteeCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trusteeCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trusteeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trusteeGender" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="trusteeGenderText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trusteeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trusteeParentTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="trusteeParentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trusteePassportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trusteeRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenLastBorderPassData", propOrder = {
    "birthDate",
    "checkpointName",
    "countryCode",
    "countryName",
    "fromCountryCode",
    "fromCountryName",
    "gender",
    "givenName",
    "givenNameCyr",
    "hasChild",
    "id",
    "identityType",
    "isBack",
    "isDead",
    "isDeadType",
    "isDriver",
    "isEmployee",
    "passDate",
    "passDateTime",
    "passDirection",
    "passportExpires",
    "passportNum",
    "passportType",
    "portName",
    "registerNum",
    "regsisterNumCyr",
    "sexName",
    "stayDuration",
    "surname",
    "surnameCyr",
    "toCountryCode",
    "toCountryName",
    "transportTypeName",
    "travelNumber",
    "travelPurposeName",
    "trusteeBirthDate",
    "trusteeCountryCode",
    "trusteeCountryName",
    "trusteeFirstName",
    "trusteeGender",
    "trusteeGenderText",
    "trusteeLastName",
    "trusteeParentTypeId",
    "trusteeParentTypeName",
    "trusteePassportNum",
    "trusteeRegnum"
})
public class CitizenLastBorderPassData {

    protected String birthDate;
    protected String checkpointName;
    protected String countryCode;
    protected String countryName;
    protected String fromCountryCode;
    protected String fromCountryName;
    protected int gender;
    protected String givenName;
    protected String givenNameCyr;
    protected String hasChild;
    protected String id;
    protected String identityType;
    protected String isBack;
    protected String isDead;
    protected String isDeadType;
    protected String isDriver;
    protected String isEmployee;
    protected String passDate;
    protected String passDateTime;
    protected String passDirection;
    protected String passportExpires;
    protected String passportNum;
    protected String passportType;
    protected String portName;
    protected String registerNum;
    protected String regsisterNumCyr;
    protected String sexName;
    protected String stayDuration;
    protected String surname;
    protected String surnameCyr;
    protected String toCountryCode;
    protected String toCountryName;
    protected String transportTypeName;
    protected String travelNumber;
    protected String travelPurposeName;
    protected String trusteeBirthDate;
    protected String trusteeCountryCode;
    protected String trusteeCountryName;
    protected String trusteeFirstName;
    protected int trusteeGender;
    protected String trusteeGenderText;
    protected String trusteeLastName;
    protected int trusteeParentTypeId;
    protected String trusteeParentTypeName;
    protected String trusteePassportNum;
    protected String trusteeRegnum;

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
     * Gets the value of the checkpointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckpointName() {
        return checkpointName;
    }

    /**
     * Sets the value of the checkpointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckpointName(String value) {
        this.checkpointName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the fromCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCountryCode() {
        return fromCountryCode;
    }

    /**
     * Sets the value of the fromCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCountryCode(String value) {
        this.fromCountryCode = value;
    }

    /**
     * Gets the value of the fromCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCountryName() {
        return fromCountryName;
    }

    /**
     * Sets the value of the fromCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCountryName(String value) {
        this.fromCountryName = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     */
    public int getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     */
    public void setGender(int value) {
        this.gender = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the givenNameCyr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenNameCyr() {
        return givenNameCyr;
    }

    /**
     * Sets the value of the givenNameCyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenNameCyr(String value) {
        this.givenNameCyr = value;
    }

    /**
     * Gets the value of the hasChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasChild() {
        return hasChild;
    }

    /**
     * Sets the value of the hasChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasChild(String value) {
        this.hasChild = value;
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
     * Gets the value of the identityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * Sets the value of the identityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityType(String value) {
        this.identityType = value;
    }

    /**
     * Gets the value of the isBack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBack() {
        return isBack;
    }

    /**
     * Sets the value of the isBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBack(String value) {
        this.isBack = value;
    }

    /**
     * Gets the value of the isDead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDead() {
        return isDead;
    }

    /**
     * Sets the value of the isDead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDead(String value) {
        this.isDead = value;
    }

    /**
     * Gets the value of the isDeadType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDeadType() {
        return isDeadType;
    }

    /**
     * Sets the value of the isDeadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDeadType(String value) {
        this.isDeadType = value;
    }

    /**
     * Gets the value of the isDriver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDriver() {
        return isDriver;
    }

    /**
     * Sets the value of the isDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDriver(String value) {
        this.isDriver = value;
    }

    /**
     * Gets the value of the isEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsEmployee() {
        return isEmployee;
    }

    /**
     * Sets the value of the isEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsEmployee(String value) {
        this.isEmployee = value;
    }

    /**
     * Gets the value of the passDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassDate() {
        return passDate;
    }

    /**
     * Sets the value of the passDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassDate(String value) {
        this.passDate = value;
    }

    /**
     * Gets the value of the passDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassDateTime() {
        return passDateTime;
    }

    /**
     * Sets the value of the passDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassDateTime(String value) {
        this.passDateTime = value;
    }

    /**
     * Gets the value of the passDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassDirection() {
        return passDirection;
    }

    /**
     * Sets the value of the passDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassDirection(String value) {
        this.passDirection = value;
    }

    /**
     * Gets the value of the passportExpires property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportExpires() {
        return passportExpires;
    }

    /**
     * Sets the value of the passportExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportExpires(String value) {
        this.passportExpires = value;
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
     * Gets the value of the passportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportType() {
        return passportType;
    }

    /**
     * Sets the value of the passportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportType(String value) {
        this.passportType = value;
    }

    /**
     * Gets the value of the portName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortName() {
        return portName;
    }

    /**
     * Sets the value of the portName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortName(String value) {
        this.portName = value;
    }

    /**
     * Gets the value of the registerNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterNum() {
        return registerNum;
    }

    /**
     * Sets the value of the registerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterNum(String value) {
        this.registerNum = value;
    }

    /**
     * Gets the value of the regsisterNumCyr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegsisterNumCyr() {
        return regsisterNumCyr;
    }

    /**
     * Sets the value of the regsisterNumCyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegsisterNumCyr(String value) {
        this.regsisterNumCyr = value;
    }

    /**
     * Gets the value of the sexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexName() {
        return sexName;
    }

    /**
     * Sets the value of the sexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexName(String value) {
        this.sexName = value;
    }

    /**
     * Gets the value of the stayDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStayDuration() {
        return stayDuration;
    }

    /**
     * Sets the value of the stayDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStayDuration(String value) {
        this.stayDuration = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the surnameCyr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameCyr() {
        return surnameCyr;
    }

    /**
     * Sets the value of the surnameCyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameCyr(String value) {
        this.surnameCyr = value;
    }

    /**
     * Gets the value of the toCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountryCode() {
        return toCountryCode;
    }

    /**
     * Sets the value of the toCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountryCode(String value) {
        this.toCountryCode = value;
    }

    /**
     * Gets the value of the toCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountryName() {
        return toCountryName;
    }

    /**
     * Sets the value of the toCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountryName(String value) {
        this.toCountryName = value;
    }

    /**
     * Gets the value of the transportTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportTypeName() {
        return transportTypeName;
    }

    /**
     * Sets the value of the transportTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportTypeName(String value) {
        this.transportTypeName = value;
    }

    /**
     * Gets the value of the travelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelNumber() {
        return travelNumber;
    }

    /**
     * Sets the value of the travelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelNumber(String value) {
        this.travelNumber = value;
    }

    /**
     * Gets the value of the travelPurposeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelPurposeName() {
        return travelPurposeName;
    }

    /**
     * Sets the value of the travelPurposeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelPurposeName(String value) {
        this.travelPurposeName = value;
    }

    /**
     * Gets the value of the trusteeBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrusteeBirthDate() {
        return trusteeBirthDate;
    }

    /**
     * Sets the value of the trusteeBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrusteeBirthDate(String value) {
        this.trusteeBirthDate = value;
    }

    /**
     * Gets the value of the trusteeCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrusteeCountryCode() {
        return trusteeCountryCode;
    }

    /**
     * Sets the value of the trusteeCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrusteeCountryCode(String value) {
        this.trusteeCountryCode = value;
    }

    /**
     * Gets the value of the trusteeCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrusteeCountryName() {
        return trusteeCountryName;
    }

    /**
     * Sets the value of the trusteeCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrusteeCountryName(String value) {
        this.trusteeCountryName = value;
    }

    /**
     * Gets the value of the trusteeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrusteeFirstName() {
        return trusteeFirstName;
    }

    /**
     * Sets the value of the trusteeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrusteeFirstName(String value) {
        this.trusteeFirstName = value;
    }

    /**
     * Gets the value of the trusteeGender property.
     * 
     */
    public int getTrusteeGender() {
        return trusteeGender;
    }

    /**
     * Sets the value of the trusteeGender property.
     * 
     */
    public void setTrusteeGender(int value) {
        this.trusteeGender = value;
    }

    /**
     * Gets the value of the trusteeGenderText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrusteeGenderText() {
        return trusteeGenderText;
    }

    /**
     * Sets the value of the trusteeGenderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrusteeGenderText(String value) {
        this.trusteeGenderText = value;
    }

    /**
     * Gets the value of the trusteeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrusteeLastName() {
        return trusteeLastName;
    }

    /**
     * Sets the value of the trusteeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrusteeLastName(String value) {
        this.trusteeLastName = value;
    }

    /**
     * Gets the value of the trusteeParentTypeId property.
     * 
     */
    public int getTrusteeParentTypeId() {
        return trusteeParentTypeId;
    }

    /**
     * Sets the value of the trusteeParentTypeId property.
     * 
     */
    public void setTrusteeParentTypeId(int value) {
        this.trusteeParentTypeId = value;
    }

    /**
     * Gets the value of the trusteeParentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrusteeParentTypeName() {
        return trusteeParentTypeName;
    }

    /**
     * Sets the value of the trusteeParentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrusteeParentTypeName(String value) {
        this.trusteeParentTypeName = value;
    }

    /**
     * Gets the value of the trusteePassportNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrusteePassportNum() {
        return trusteePassportNum;
    }

    /**
     * Sets the value of the trusteePassportNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrusteePassportNum(String value) {
        this.trusteePassportNum = value;
    }

    /**
     * Gets the value of the trusteeRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrusteeRegnum() {
        return trusteeRegnum;
    }

    /**
     * Sets the value of the trusteeRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrusteeRegnum(String value) {
        this.trusteeRegnum = value;
    }

}
