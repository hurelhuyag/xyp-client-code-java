
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMarriageInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMarriageInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="confirmedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmedUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husForename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husGivenname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marriageTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marriedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mrgCertifNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registryUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wfmStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wiForename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wiGivenname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "getMarriageInfoDetailData", propOrder = {
    "confirmedDate",
    "confirmedUserName",
    "decisionNumber",
    "husForename",
    "husGivenname",
    "husRegnum",
    "husSurname",
    "marriageTypeName",
    "marriedDate",
    "mrgCertifNum",
    "regDate",
    "registerName",
    "registryUnitName",
    "wfmStatusName",
    "wiForename",
    "wiGivenname",
    "wiRegnum",
    "wiSurname"
})
public class GetMarriageInfoDetailData {

    protected String confirmedDate;
    protected String confirmedUserName;
    protected String decisionNumber;
    protected String husForename;
    protected String husGivenname;
    protected String husRegnum;
    protected String husSurname;
    protected String marriageTypeName;
    protected String marriedDate;
    protected String mrgCertifNum;
    protected String regDate;
    protected String registerName;
    protected String registryUnitName;
    protected String wfmStatusName;
    protected String wiForename;
    protected String wiGivenname;
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
     * Gets the value of the husGivenname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusGivenname() {
        return husGivenname;
    }

    /**
     * Sets the value of the husGivenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusGivenname(String value) {
        this.husGivenname = value;
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
     * Gets the value of the marriageTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageTypeName() {
        return marriageTypeName;
    }

    /**
     * Sets the value of the marriageTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageTypeName(String value) {
        this.marriageTypeName = value;
    }

    /**
     * Gets the value of the marriedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriedDate() {
        return marriedDate;
    }

    /**
     * Sets the value of the marriedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriedDate(String value) {
        this.marriedDate = value;
    }

    /**
     * Gets the value of the mrgCertifNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrgCertifNum() {
        return mrgCertifNum;
    }

    /**
     * Sets the value of the mrgCertifNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrgCertifNum(String value) {
        this.mrgCertifNum = value;
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
     * Gets the value of the wiGivenname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiGivenname() {
        return wiGivenname;
    }

    /**
     * Sets the value of the wiGivenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiGivenname(String value) {
        this.wiGivenname = value;
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
