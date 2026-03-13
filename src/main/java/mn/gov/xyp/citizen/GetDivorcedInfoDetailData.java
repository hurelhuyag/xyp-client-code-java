
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDivorcedInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDivorcedInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="confirmedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmedUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionAimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionSoumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divorceCauseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divorceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divorcedCertifNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divorcedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husForename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registryUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wfmStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wiForename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wiGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wiRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wiSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDivorcedInfoDetailData", propOrder = {
    "confirmedDate",
    "confirmedUserName",
    "decisionAimagCityName",
    "decisionDate",
    "decisionNum",
    "decisionOrg",
    "decisionSoumDistrictName",
    "divorceCauseName",
    "divorceTypeCode",
    "divorcedCertifNum",
    "divorcedDate",
    "husForename",
    "husGivenName",
    "husRegnum",
    "husSurname",
    "regDate",
    "registerName",
    "registryUnitName",
    "wfmStatusName",
    "wiForename",
    "wiGivenName",
    "wiRegnum",
    "wiSurname"
})
public class GetDivorcedInfoDetailData {

    protected String confirmedDate;
    protected String confirmedUserName;
    protected String decisionAimagCityName;
    protected String decisionDate;
    protected String decisionNum;
    protected String decisionOrg;
    protected String decisionSoumDistrictName;
    protected String divorceCauseName;
    protected String divorceTypeCode;
    protected String divorcedCertifNum;
    protected String divorcedDate;
    protected String husForename;
    protected String husGivenName;
    protected String husRegnum;
    protected String husSurname;
    protected String regDate;
    protected String registerName;
    protected String registryUnitName;
    protected String wfmStatusName;
    protected String wiForename;
    protected String wiGivenName;
    protected String wiRegnum;
    protected String wiSurname;

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
     * Gets the value of the decisionOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionOrg() {
        return decisionOrg;
    }

    /**
     * Sets the value of the decisionOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionOrg(String value) {
        this.decisionOrg = value;
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
     * Gets the value of the divorceCauseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivorceCauseName() {
        return divorceCauseName;
    }

    /**
     * Sets the value of the divorceCauseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivorceCauseName(String value) {
        this.divorceCauseName = value;
    }

    /**
     * Gets the value of the divorceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivorceTypeCode() {
        return divorceTypeCode;
    }

    /**
     * Sets the value of the divorceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivorceTypeCode(String value) {
        this.divorceTypeCode = value;
    }

    /**
     * Gets the value of the divorcedCertifNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivorcedCertifNum() {
        return divorcedCertifNum;
    }

    /**
     * Sets the value of the divorcedCertifNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivorcedCertifNum(String value) {
        this.divorcedCertifNum = value;
    }

    /**
     * Gets the value of the divorcedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivorcedDate() {
        return divorcedDate;
    }

    /**
     * Sets the value of the divorcedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivorcedDate(String value) {
        this.divorcedDate = value;
    }

    /**
     * Gets the value of the husForename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusForename() {
        return husForename;
    }

    /**
     * Sets the value of the husForename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusForename(String value) {
        this.husForename = value;
    }

    /**
     * Gets the value of the husGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusGivenName() {
        return husGivenName;
    }

    /**
     * Sets the value of the husGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusGivenName(String value) {
        this.husGivenName = value;
    }

    /**
     * Gets the value of the husRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusRegnum() {
        return husRegnum;
    }

    /**
     * Sets the value of the husRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusRegnum(String value) {
        this.husRegnum = value;
    }

    /**
     * Gets the value of the husSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusSurname() {
        return husSurname;
    }

    /**
     * Sets the value of the husSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusSurname(String value) {
        this.husSurname = value;
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

    /**
     * Gets the value of the wiForename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiForename() {
        return wiForename;
    }

    /**
     * Sets the value of the wiForename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiForename(String value) {
        this.wiForename = value;
    }

    /**
     * Gets the value of the wiGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiGivenName() {
        return wiGivenName;
    }

    /**
     * Sets the value of the wiGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiGivenName(String value) {
        this.wiGivenName = value;
    }

    /**
     * Gets the value of the wiRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiRegnum() {
        return wiRegnum;
    }

    /**
     * Sets the value of the wiRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiRegnum(String value) {
        this.wiRegnum = value;
    }

    /**
     * Gets the value of the wiSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiSurname() {
        return wiSurname;
    }

    /**
     * Sets the value of the wiSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiSurname(String value) {
        this.wiSurname = value;
    }

}
