
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNameAndSurnameChangedInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNameAndSurnameChangedInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="changeNameCauseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="changeNameCauseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="changeNameCertifNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="civilId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="confirmedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmedUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="greatedUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newForename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registryUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "getNameAndSurnameChangedInfoDetailData", propOrder = {
    "changeNameCauseCode",
    "changeNameCauseName",
    "changeNameCertifNum",
    "civilId",
    "confirmedDate",
    "confirmedUsername",
    "decisionNumber",
    "forename",
    "givenName",
    "greatedUserName",
    "newForename",
    "newGivenName",
    "newSurname",
    "regDate",
    "registerName",
    "registryUnitName",
    "regnum",
    "surname",
    "wfmStatusName"
})
public class GetNameAndSurnameChangedInfoDetailData {

    protected String changeNameCauseCode;
    protected String changeNameCauseName;
    protected String changeNameCertifNum;
    protected long civilId;
    protected String confirmedDate;
    protected String confirmedUsername;
    protected String decisionNumber;
    protected String forename;
    protected String givenName;
    protected String greatedUserName;
    protected String newForename;
    protected String newGivenName;
    protected String newSurname;
    protected String regDate;
    protected String registerName;
    protected String registryUnitName;
    protected String regnum;
    protected String surname;
    protected String wfmStatusName;

    /**
     * Gets the value of the changeNameCauseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeNameCauseCode() {
        return changeNameCauseCode;
    }

    /**
     * Sets the value of the changeNameCauseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeNameCauseCode(String value) {
        this.changeNameCauseCode = value;
    }

    /**
     * Gets the value of the changeNameCauseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeNameCauseName() {
        return changeNameCauseName;
    }

    /**
     * Sets the value of the changeNameCauseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeNameCauseName(String value) {
        this.changeNameCauseName = value;
    }

    /**
     * Gets the value of the changeNameCertifNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeNameCertifNum() {
        return changeNameCertifNum;
    }

    /**
     * Sets the value of the changeNameCertifNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeNameCertifNum(String value) {
        this.changeNameCertifNum = value;
    }

    /**
     * Gets the value of the civilId property.
     * 
     */
    public long getCivilId() {
        return civilId;
    }

    /**
     * Sets the value of the civilId property.
     * 
     */
    public void setCivilId(long value) {
        this.civilId = value;
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
     * Gets the value of the confirmedUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmedUsername() {
        return confirmedUsername;
    }

    /**
     * Sets the value of the confirmedUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmedUsername(String value) {
        this.confirmedUsername = value;
    }

    /**
     * Gets the value of the decisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionNumber() {
        return decisionNumber;
    }

    /**
     * Sets the value of the decisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionNumber(String value) {
        this.decisionNumber = value;
    }

    /**
     * Gets the value of the forename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForename() {
        return forename;
    }

    /**
     * Sets the value of the forename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForename(String value) {
        this.forename = value;
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
     * Gets the value of the greatedUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreatedUserName() {
        return greatedUserName;
    }

    /**
     * Sets the value of the greatedUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreatedUserName(String value) {
        this.greatedUserName = value;
    }

    /**
     * Gets the value of the newForename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewForename() {
        return newForename;
    }

    /**
     * Sets the value of the newForename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewForename(String value) {
        this.newForename = value;
    }

    /**
     * Gets the value of the newGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewGivenName() {
        return newGivenName;
    }

    /**
     * Sets the value of the newGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewGivenName(String value) {
        this.newGivenName = value;
    }

    /**
     * Gets the value of the newSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSurname() {
        return newSurname;
    }

    /**
     * Sets the value of the newSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSurname(String value) {
        this.newSurname = value;
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
