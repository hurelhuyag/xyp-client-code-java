
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAdoptionInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAdoptionInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adopFaGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adopFaRegisterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adopFaSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adopMoGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adopMoRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adopMoSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adoptionCertifNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmedDepartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmedUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionAimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionSoumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newFaGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newFaRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newFaSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newForename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newMoGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newMoRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newMoSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldForename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "getAdoptionInfoDetailData", propOrder = {
    "adopFaGivenName",
    "adopFaRegisterNum",
    "adopFaSurname",
    "adopMoGivenName",
    "adopMoRegnum",
    "adopMoSurname",
    "adoptionCertifNum",
    "confirmedDate",
    "confirmedDepartmentName",
    "confirmedUsername",
    "createdUsername",
    "decisionAimagCityName",
    "decisionDate",
    "decisionNum",
    "decisionNumber",
    "decisionSoumDistrictName",
    "forename",
    "givenName",
    "newFaGivenName",
    "newFaRegnum",
    "newFaSurname",
    "newForename",
    "newGivenName",
    "newMoGivenName",
    "newMoRegnum",
    "newMoSurname",
    "newSurname",
    "oldForename",
    "oldGivenName",
    "oldSurname",
    "regDate",
    "registryUnitName",
    "regnum",
    "surname",
    "wfmStatusName"
})
public class GetAdoptionInfoDetailData {

    protected String adopFaGivenName;
    protected String adopFaRegisterNum;
    protected String adopFaSurname;
    protected String adopMoGivenName;
    protected String adopMoRegnum;
    protected String adopMoSurname;
    protected String adoptionCertifNum;
    protected String confirmedDate;
    protected String confirmedDepartmentName;
    protected String confirmedUsername;
    protected String createdUsername;
    protected String decisionAimagCityName;
    protected String decisionDate;
    protected String decisionNum;
    protected String decisionNumber;
    protected String decisionSoumDistrictName;
    protected String forename;
    protected String givenName;
    protected String newFaGivenName;
    protected String newFaRegnum;
    protected String newFaSurname;
    protected String newForename;
    protected String newGivenName;
    protected String newMoGivenName;
    protected String newMoRegnum;
    protected String newMoSurname;
    protected String newSurname;
    protected String oldForename;
    protected String oldGivenName;
    protected String oldSurname;
    protected String regDate;
    protected String registryUnitName;
    protected String regnum;
    protected String surname;
    protected String wfmStatusName;

    /**
     * Gets the value of the adopFaGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdopFaGivenName() {
        return adopFaGivenName;
    }

    /**
     * Sets the value of the adopFaGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdopFaGivenName(String value) {
        this.adopFaGivenName = value;
    }

    /**
     * Gets the value of the adopFaRegisterNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdopFaRegisterNum() {
        return adopFaRegisterNum;
    }

    /**
     * Sets the value of the adopFaRegisterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdopFaRegisterNum(String value) {
        this.adopFaRegisterNum = value;
    }

    /**
     * Gets the value of the adopFaSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdopFaSurname() {
        return adopFaSurname;
    }

    /**
     * Sets the value of the adopFaSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdopFaSurname(String value) {
        this.adopFaSurname = value;
    }

    /**
     * Gets the value of the adopMoGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdopMoGivenName() {
        return adopMoGivenName;
    }

    /**
     * Sets the value of the adopMoGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdopMoGivenName(String value) {
        this.adopMoGivenName = value;
    }

    /**
     * Gets the value of the adopMoRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdopMoRegnum() {
        return adopMoRegnum;
    }

    /**
     * Sets the value of the adopMoRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdopMoRegnum(String value) {
        this.adopMoRegnum = value;
    }

    /**
     * Gets the value of the adopMoSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdopMoSurname() {
        return adopMoSurname;
    }

    /**
     * Sets the value of the adopMoSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdopMoSurname(String value) {
        this.adopMoSurname = value;
    }

    /**
     * Gets the value of the adoptionCertifNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdoptionCertifNum() {
        return adoptionCertifNum;
    }

    /**
     * Sets the value of the adoptionCertifNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdoptionCertifNum(String value) {
        this.adoptionCertifNum = value;
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
     * Gets the value of the confirmedDepartmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmedDepartmentName() {
        return confirmedDepartmentName;
    }

    /**
     * Sets the value of the confirmedDepartmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmedDepartmentName(String value) {
        this.confirmedDepartmentName = value;
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
     * Gets the value of the createdUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedUsername() {
        return createdUsername;
    }

    /**
     * Sets the value of the createdUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedUsername(String value) {
        this.createdUsername = value;
    }

    /**
     * Gets the value of the decisionAimagCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionAimagCityName() {
        return decisionAimagCityName;
    }

    /**
     * Sets the value of the decisionAimagCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionAimagCityName(String value) {
        this.decisionAimagCityName = value;
    }

    /**
     * Gets the value of the decisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionDate(String value) {
        this.decisionDate = value;
    }

    /**
     * Gets the value of the decisionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionNum() {
        return decisionNum;
    }

    /**
     * Sets the value of the decisionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionNum(String value) {
        this.decisionNum = value;
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
     * Gets the value of the decisionSoumDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionSoumDistrictName() {
        return decisionSoumDistrictName;
    }

    /**
     * Sets the value of the decisionSoumDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionSoumDistrictName(String value) {
        this.decisionSoumDistrictName = value;
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
     * Gets the value of the newFaGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFaGivenName() {
        return newFaGivenName;
    }

    /**
     * Sets the value of the newFaGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFaGivenName(String value) {
        this.newFaGivenName = value;
    }

    /**
     * Gets the value of the newFaRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFaRegnum() {
        return newFaRegnum;
    }

    /**
     * Sets the value of the newFaRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFaRegnum(String value) {
        this.newFaRegnum = value;
    }

    /**
     * Gets the value of the newFaSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFaSurname() {
        return newFaSurname;
    }

    /**
     * Sets the value of the newFaSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFaSurname(String value) {
        this.newFaSurname = value;
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
     * Gets the value of the newMoGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMoGivenName() {
        return newMoGivenName;
    }

    /**
     * Sets the value of the newMoGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMoGivenName(String value) {
        this.newMoGivenName = value;
    }

    /**
     * Gets the value of the newMoRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMoRegnum() {
        return newMoRegnum;
    }

    /**
     * Sets the value of the newMoRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMoRegnum(String value) {
        this.newMoRegnum = value;
    }

    /**
     * Gets the value of the newMoSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMoSurname() {
        return newMoSurname;
    }

    /**
     * Sets the value of the newMoSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMoSurname(String value) {
        this.newMoSurname = value;
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
     * Gets the value of the oldForename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldForename() {
        return oldForename;
    }

    /**
     * Sets the value of the oldForename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldForename(String value) {
        this.oldForename = value;
    }

    /**
     * Gets the value of the oldGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldGivenName() {
        return oldGivenName;
    }

    /**
     * Sets the value of the oldGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldGivenName(String value) {
        this.oldGivenName = value;
    }

    /**
     * Gets the value of the oldSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSurname() {
        return oldSurname;
    }

    /**
     * Sets the value of the oldSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSurname(String value) {
        this.oldSurname = value;
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
