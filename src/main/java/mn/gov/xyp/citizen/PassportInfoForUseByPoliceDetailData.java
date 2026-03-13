
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passportInfoForUseByPoliceDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passportInfoForUseByPoliceDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="confirmedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invalideCauseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invalidePassDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invalideUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isInvalid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issuedOrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issuedPlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="journalNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registryUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceTypeNameMon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="takePassportCauseNameMon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wfmStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passportInfoForUseByPoliceDetailData", propOrder = {
    "confirmedDate",
    "confirmedName",
    "expiryDate",
    "givenName",
    "invalideCauseName",
    "invalidePassDate",
    "invalideUserName",
    "isInvalid",
    "issuedDate",
    "issuedOrgName",
    "issuedPlaceName",
    "journalNum",
    "passportNum",
    "passportTypeCode",
    "regDate",
    "registerName",
    "registryUnitName",
    "regnum",
    "serviceTypeNameMon",
    "surname",
    "takePassportCauseNameMon",
    "wfmStatusName"
})
public class PassportInfoForUseByPoliceDetailData {

    protected String confirmedDate;
    protected String confirmedName;
    protected String expiryDate;
    protected String givenName;
    protected String invalideCauseName;
    protected String invalidePassDate;
    protected String invalideUserName;
    protected String isInvalid;
    protected String issuedDate;
    protected String issuedOrgName;
    protected String issuedPlaceName;
    protected String journalNum;
    protected String passportNum;
    protected String passportTypeCode;
    protected String regDate;
    protected String registerName;
    protected String registryUnitName;
    protected String regnum;
    protected String serviceTypeNameMon;
    protected String surname;
    protected String takePassportCauseNameMon;
    protected String wfmStatusName;

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
     * Gets the value of the confirmedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmedName() {
        return confirmedName;
    }

    /**
     * Sets the value of the confirmedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmedName(String value) {
        this.confirmedName = value;
    }

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
     * Gets the value of the invalideCauseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalideCauseName() {
        return invalideCauseName;
    }

    /**
     * Sets the value of the invalideCauseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalideCauseName(String value) {
        this.invalideCauseName = value;
    }

    /**
     * Gets the value of the invalidePassDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalidePassDate() {
        return invalidePassDate;
    }

    /**
     * Sets the value of the invalidePassDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalidePassDate(String value) {
        this.invalidePassDate = value;
    }

    /**
     * Gets the value of the invalideUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalideUserName() {
        return invalideUserName;
    }

    /**
     * Sets the value of the invalideUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalideUserName(String value) {
        this.invalideUserName = value;
    }

    /**
     * Gets the value of the isInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsInvalid() {
        return isInvalid;
    }

    /**
     * Sets the value of the isInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsInvalid(String value) {
        this.isInvalid = value;
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
     * Gets the value of the issuedOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedOrgName() {
        return issuedOrgName;
    }

    /**
     * Sets the value of the issuedOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedOrgName(String value) {
        this.issuedOrgName = value;
    }

    /**
     * Gets the value of the issuedPlaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedPlaceName() {
        return issuedPlaceName;
    }

    /**
     * Sets the value of the issuedPlaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedPlaceName(String value) {
        this.issuedPlaceName = value;
    }

    /**
     * Gets the value of the journalNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalNum() {
        return journalNum;
    }

    /**
     * Sets the value of the journalNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalNum(String value) {
        this.journalNum = value;
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
     * Gets the value of the passportTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportTypeCode() {
        return passportTypeCode;
    }

    /**
     * Sets the value of the passportTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportTypeCode(String value) {
        this.passportTypeCode = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDate(String value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the registerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterName() {
        return registerName;
    }

    /**
     * Sets the value of the registerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterName(String value) {
        this.registerName = value;
    }

    /**
     * Gets the value of the registryUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryUnitName() {
        return registryUnitName;
    }

    /**
     * Sets the value of the registryUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryUnitName(String value) {
        this.registryUnitName = value;
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
     * Gets the value of the serviceTypeNameMon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTypeNameMon() {
        return serviceTypeNameMon;
    }

    /**
     * Sets the value of the serviceTypeNameMon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTypeNameMon(String value) {
        this.serviceTypeNameMon = value;
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
     * Gets the value of the takePassportCauseNameMon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTakePassportCauseNameMon() {
        return takePassportCauseNameMon;
    }

    /**
     * Sets the value of the takePassportCauseNameMon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTakePassportCauseNameMon(String value) {
        this.takePassportCauseNameMon = value;
    }

    /**
     * Gets the value of the wfmStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWfmStatusName() {
        return wfmStatusName;
    }

    /**
     * Sets the value of the wfmStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWfmStatusName(String value) {
        this.wfmStatusName = value;
    }

}
