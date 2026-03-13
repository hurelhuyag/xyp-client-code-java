
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for svcMarriageRestoresDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="svcMarriageRestoresDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husForename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husNationalityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husRegisteredNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marriedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wiForename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wiGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wiNationalityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wiRegisteredNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wiRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wiStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "svcMarriageRestoresDetailData", propOrder = {
    "decisionDate",
    "decisionNum",
    "decisionOrg",
    "husForename",
    "husGivenName",
    "husNationalityName",
    "husRegisteredNum",
    "husRegnum",
    "husStatus",
    "husSurname",
    "marriedDate",
    "regCity",
    "regDate",
    "regDistrict",
    "regId",
    "wiForename",
    "wiGivenName",
    "wiNationalityName",
    "wiRegisteredNum",
    "wiRegnum",
    "wiStatus",
    "wiSurname"
})
public class SvcMarriageRestoresDetailData {

    protected String decisionDate;
    protected String decisionNum;
    protected String decisionOrg;
    protected String husForename;
    protected String husGivenName;
    protected String husNationalityName;
    protected String husRegisteredNum;
    protected String husRegnum;
    protected String husStatus;
    protected String husSurname;
    protected String marriedDate;
    protected String regCity;
    protected String regDate;
    protected String regDistrict;
    protected String regId;
    protected String wiForename;
    protected String wiGivenName;
    protected String wiNationalityName;
    protected String wiRegisteredNum;
    protected String wiRegnum;
    protected String wiStatus;
    protected String wiSurname;

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
     * Gets the value of the husNationalityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusNationalityName() {
        return husNationalityName;
    }

    /**
     * Sets the value of the husNationalityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusNationalityName(String value) {
        this.husNationalityName = value;
    }

    /**
     * Gets the value of the husRegisteredNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusRegisteredNum() {
        return husRegisteredNum;
    }

    /**
     * Sets the value of the husRegisteredNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusRegisteredNum(String value) {
        this.husRegisteredNum = value;
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
     * Gets the value of the husStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusStatus() {
        return husStatus;
    }

    /**
     * Sets the value of the husStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusStatus(String value) {
        this.husStatus = value;
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
     * Gets the value of the regCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegCity() {
        return regCity;
    }

    /**
     * Sets the value of the regCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegCity(String value) {
        this.regCity = value;
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
     * Gets the value of the regDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDistrict() {
        return regDistrict;
    }

    /**
     * Sets the value of the regDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDistrict(String value) {
        this.regDistrict = value;
    }

    /**
     * Gets the value of the regId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegId() {
        return regId;
    }

    /**
     * Sets the value of the regId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegId(String value) {
        this.regId = value;
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
     * Gets the value of the wiNationalityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiNationalityName() {
        return wiNationalityName;
    }

    /**
     * Sets the value of the wiNationalityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiNationalityName(String value) {
        this.wiNationalityName = value;
    }

    /**
     * Gets the value of the wiRegisteredNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiRegisteredNum() {
        return wiRegisteredNum;
    }

    /**
     * Sets the value of the wiRegisteredNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiRegisteredNum(String value) {
        this.wiRegisteredNum = value;
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
     * Gets the value of the wiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiStatus() {
        return wiStatus;
    }

    /**
     * Sets the value of the wiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiStatus(String value) {
        this.wiStatus = value;
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
