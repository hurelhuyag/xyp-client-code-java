
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMotherAndChildBirthInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMotherAndChildBirthInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="birthAimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthCertifNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthDocTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthSoumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chBirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chBirthHeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="chBirthWeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="chMoChildCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="confirmedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fatherForename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fatherGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fatherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fatherSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherForeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherSurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registryUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="twinTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMotherAndChildBirthInfoDetailData", propOrder = {
    "birthAimagCityName",
    "birthCertifNum",
    "birthDocTypeName",
    "birthSoumDistrictName",
    "birthTypeName",
    "chBirthDate",
    "chBirthHeight",
    "chBirthWeight",
    "chMoChildCount",
    "confirmedDate",
    "confirmedName",
    "createdUserName",
    "decisionNumber",
    "fatherForename",
    "fatherGivenName",
    "fatherRegnum",
    "fatherSurname",
    "fivenName",
    "foreName",
    "motherForeName",
    "motherGivenName",
    "motherRegnum",
    "motherSurName",
    "name",
    "regDate",
    "registerDate",
    "registerName",
    "registryUnitName",
    "regnum",
    "surName",
    "twinTypeName"
})
public class GetMotherAndChildBirthInfoDetailData {

    protected String birthAimagCityName;
    protected String birthCertifNum;
    protected String birthDocTypeName;
    protected String birthSoumDistrictName;
    protected String birthTypeName;
    protected String chBirthDate;
    protected int chBirthHeight;
    protected int chBirthWeight;
    protected int chMoChildCount;
    protected String confirmedDate;
    protected String confirmedName;
    protected String createdUserName;
    protected String decisionNumber;
    protected String fatherForename;
    protected String fatherGivenName;
    protected String fatherRegnum;
    protected String fatherSurname;
    protected String fivenName;
    protected String foreName;
    protected String motherForeName;
    protected String motherGivenName;
    protected String motherRegnum;
    protected String motherSurName;
    protected String name;
    protected String regDate;
    protected String registerDate;
    protected String registerName;
    protected String registryUnitName;
    protected String regnum;
    protected String surName;
    protected String twinTypeName;

    /**
     * Gets the value of the birthAimagCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthAimagCityName() {
        return birthAimagCityName;
    }

    /**
     * Sets the value of the birthAimagCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthAimagCityName(String value) {
        this.birthAimagCityName = value;
    }

    /**
     * Gets the value of the birthCertifNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCertifNum() {
        return birthCertifNum;
    }

    /**
     * Sets the value of the birthCertifNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCertifNum(String value) {
        this.birthCertifNum = value;
    }

    /**
     * Gets the value of the birthDocTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDocTypeName() {
        return birthDocTypeName;
    }

    /**
     * Sets the value of the birthDocTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDocTypeName(String value) {
        this.birthDocTypeName = value;
    }

    /**
     * Gets the value of the birthSoumDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthSoumDistrictName() {
        return birthSoumDistrictName;
    }

    /**
     * Sets the value of the birthSoumDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthSoumDistrictName(String value) {
        this.birthSoumDistrictName = value;
    }

    /**
     * Gets the value of the birthTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthTypeName() {
        return birthTypeName;
    }

    /**
     * Sets the value of the birthTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthTypeName(String value) {
        this.birthTypeName = value;
    }

    /**
     * Gets the value of the chBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChBirthDate() {
        return chBirthDate;
    }

    /**
     * Sets the value of the chBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChBirthDate(String value) {
        this.chBirthDate = value;
    }

    /**
     * Gets the value of the chBirthHeight property.
     * 
     */
    public int getChBirthHeight() {
        return chBirthHeight;
    }

    /**
     * Sets the value of the chBirthHeight property.
     * 
     */
    public void setChBirthHeight(int value) {
        this.chBirthHeight = value;
    }

    /**
     * Gets the value of the chBirthWeight property.
     * 
     */
    public int getChBirthWeight() {
        return chBirthWeight;
    }

    /**
     * Sets the value of the chBirthWeight property.
     * 
     */
    public void setChBirthWeight(int value) {
        this.chBirthWeight = value;
    }

    /**
     * Gets the value of the chMoChildCount property.
     * 
     */
    public int getChMoChildCount() {
        return chMoChildCount;
    }

    /**
     * Sets the value of the chMoChildCount property.
     * 
     */
    public void setChMoChildCount(int value) {
        this.chMoChildCount = value;
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
     * Gets the value of the fatherForename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherForename() {
        return fatherForename;
    }

    /**
     * Sets the value of the fatherForename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherForename(String value) {
        this.fatherForename = value;
    }

    /**
     * Gets the value of the fatherGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherGivenName() {
        return fatherGivenName;
    }

    /**
     * Sets the value of the fatherGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherGivenName(String value) {
        this.fatherGivenName = value;
    }

    /**
     * Gets the value of the fatherRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherRegnum() {
        return fatherRegnum;
    }

    /**
     * Sets the value of the fatherRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherRegnum(String value) {
        this.fatherRegnum = value;
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
     * Gets the value of the fivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFivenName() {
        return fivenName;
    }

    /**
     * Sets the value of the fivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFivenName(String value) {
        this.fivenName = value;
    }

    /**
     * Gets the value of the foreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeName() {
        return foreName;
    }

    /**
     * Sets the value of the foreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeName(String value) {
        this.foreName = value;
    }

    /**
     * Gets the value of the motherForeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherForeName() {
        return motherForeName;
    }

    /**
     * Sets the value of the motherForeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherForeName(String value) {
        this.motherForeName = value;
    }

    /**
     * Gets the value of the motherGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherGivenName() {
        return motherGivenName;
    }

    /**
     * Sets the value of the motherGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherGivenName(String value) {
        this.motherGivenName = value;
    }

    /**
     * Gets the value of the motherRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherRegnum() {
        return motherRegnum;
    }

    /**
     * Sets the value of the motherRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherRegnum(String value) {
        this.motherRegnum = value;
    }

    /**
     * Gets the value of the motherSurName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherSurName() {
        return motherSurName;
    }

    /**
     * Sets the value of the motherSurName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherSurName(String value) {
        this.motherSurName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the registerDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the value of the registerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterDate(String value) {
        this.registerDate = value;
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
     * Gets the value of the surName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Sets the value of the surName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurName(String value) {
        this.surName = value;
    }

    /**
     * Gets the value of the twinTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwinTypeName() {
        return twinTypeName;
    }

    /**
     * Sets the value of the twinTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwinTypeName(String value) {
        this.twinTypeName = value;
    }

}
