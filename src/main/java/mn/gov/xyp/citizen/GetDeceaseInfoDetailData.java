
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDeceaseInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDeceaseInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="confirmedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmedUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deceaseAimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deceaseCauseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deceaseCauseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deceaseCertifNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deceaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deceaseFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deceasePlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deceaseSoumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="judgeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registryUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resideAimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resideSoumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "getDeceaseInfoDetailData", propOrder = {
    "confirmedDate",
    "confirmedUserName",
    "createdUserName",
    "deceaseAimagCityName",
    "deceaseCauseCode",
    "deceaseCauseName",
    "deceaseCertifNum",
    "deceaseDate",
    "deceaseFact",
    "deceasePlaceName",
    "deceaseSoumDistrictName",
    "decisionNumber",
    "forename",
    "givenName",
    "judgeNumber",
    "regDate",
    "registryUnitName",
    "regnum",
    "resideAimagCityName",
    "resideSoumDistrictName",
    "specialNote",
    "surname",
    "wfmStatusName"
})
public class GetDeceaseInfoDetailData {

    protected String confirmedDate;
    protected String confirmedUserName;
    protected String createdUserName;
    protected String deceaseAimagCityName;
    protected String deceaseCauseCode;
    protected String deceaseCauseName;
    protected String deceaseCertifNum;
    protected String deceaseDate;
    protected String deceaseFact;
    protected String deceasePlaceName;
    protected String deceaseSoumDistrictName;
    protected String decisionNumber;
    protected String forename;
    protected String givenName;
    protected String judgeNumber;
    protected String regDate;
    protected String registryUnitName;
    protected String regnum;
    protected String resideAimagCityName;
    protected String resideSoumDistrictName;
    protected String specialNote;
    protected String surname;
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
     * Gets the value of the confirmedUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmedUserName() {
        return confirmedUserName;
    }

    /**
     * Sets the value of the confirmedUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmedUserName(String value) {
        this.confirmedUserName = value;
    }

    /**
     * Gets the value of the createdUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedUserName() {
        return createdUserName;
    }

    /**
     * Sets the value of the createdUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedUserName(String value) {
        this.createdUserName = value;
    }

    /**
     * Gets the value of the deceaseAimagCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseAimagCityName() {
        return deceaseAimagCityName;
    }

    /**
     * Sets the value of the deceaseAimagCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseAimagCityName(String value) {
        this.deceaseAimagCityName = value;
    }

    /**
     * Gets the value of the deceaseCauseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseCauseCode() {
        return deceaseCauseCode;
    }

    /**
     * Sets the value of the deceaseCauseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseCauseCode(String value) {
        this.deceaseCauseCode = value;
    }

    /**
     * Gets the value of the deceaseCauseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseCauseName() {
        return deceaseCauseName;
    }

    /**
     * Sets the value of the deceaseCauseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseCauseName(String value) {
        this.deceaseCauseName = value;
    }

    /**
     * Gets the value of the deceaseCertifNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseCertifNum() {
        return deceaseCertifNum;
    }

    /**
     * Sets the value of the deceaseCertifNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseCertifNum(String value) {
        this.deceaseCertifNum = value;
    }

    /**
     * Gets the value of the deceaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseDate() {
        return deceaseDate;
    }

    /**
     * Sets the value of the deceaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseDate(String value) {
        this.deceaseDate = value;
    }

    /**
     * Gets the value of the deceaseFact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseFact() {
        return deceaseFact;
    }

    /**
     * Sets the value of the deceaseFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseFact(String value) {
        this.deceaseFact = value;
    }

    /**
     * Gets the value of the deceasePlaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceasePlaceName() {
        return deceasePlaceName;
    }

    /**
     * Sets the value of the deceasePlaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceasePlaceName(String value) {
        this.deceasePlaceName = value;
    }

    /**
     * Gets the value of the deceaseSoumDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseSoumDistrictName() {
        return deceaseSoumDistrictName;
    }

    /**
     * Sets the value of the deceaseSoumDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseSoumDistrictName(String value) {
        this.deceaseSoumDistrictName = value;
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
     * Gets the value of the judgeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJudgeNumber() {
        return judgeNumber;
    }

    /**
     * Sets the value of the judgeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJudgeNumber(String value) {
        this.judgeNumber = value;
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
     * Gets the value of the resideAimagCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResideAimagCityName() {
        return resideAimagCityName;
    }

    /**
     * Sets the value of the resideAimagCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResideAimagCityName(String value) {
        this.resideAimagCityName = value;
    }

    /**
     * Gets the value of the resideSoumDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResideSoumDistrictName() {
        return resideSoumDistrictName;
    }

    /**
     * Sets the value of the resideSoumDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResideSoumDistrictName(String value) {
        this.resideSoumDistrictName = value;
    }

    /**
     * Gets the value of the specialNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialNote() {
        return specialNote;
    }

    /**
     * Sets the value of the specialNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialNote(String value) {
        this.specialNote = value;
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
