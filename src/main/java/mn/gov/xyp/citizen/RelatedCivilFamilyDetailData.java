
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for relatedCivilFamilyDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="relatedCivilFamilyDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="civilStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="civilSystemId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fatherCivilSystemId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherCivilSystemId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="registeredNum" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relevanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedCivilFamilyDetailData", propOrder = {
    "civilStatusName",
    "civilSystemId",
    "fatherCivilSystemId",
    "givenName",
    "motherCivilSystemId",
    "registeredNum",
    "regnum",
    "relevanceStatus",
    "surName"
})
public class RelatedCivilFamilyDetailData {

    protected String civilStatusName;
    protected int civilSystemId;
    protected int fatherCivilSystemId;
    protected String givenName;
    protected int motherCivilSystemId;
    protected long registeredNum;
    protected String regnum;
    protected String relevanceStatus;
    protected String surName;

    /**
     * Gets the value of the civilStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilStatusName() {
        return civilStatusName;
    }

    /**
     * Sets the value of the civilStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilStatusName(String value) {
        this.civilStatusName = value;
    }

    /**
     * Gets the value of the civilSystemId property.
     * 
     */
    public int getCivilSystemId() {
        return civilSystemId;
    }

    /**
     * Sets the value of the civilSystemId property.
     * 
     */
    public void setCivilSystemId(int value) {
        this.civilSystemId = value;
    }

    /**
     * Gets the value of the fatherCivilSystemId property.
     * 
     */
    public int getFatherCivilSystemId() {
        return fatherCivilSystemId;
    }

    /**
     * Sets the value of the fatherCivilSystemId property.
     * 
     */
    public void setFatherCivilSystemId(int value) {
        this.fatherCivilSystemId = value;
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
     * Gets the value of the motherCivilSystemId property.
     * 
     */
    public int getMotherCivilSystemId() {
        return motherCivilSystemId;
    }

    /**
     * Sets the value of the motherCivilSystemId property.
     * 
     */
    public void setMotherCivilSystemId(int value) {
        this.motherCivilSystemId = value;
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
     * Gets the value of the relevanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelevanceStatus() {
        return relevanceStatus;
    }

    /**
     * Sets the value of the relevanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelevanceStatus(String value) {
        this.relevanceStatus = value;
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

}
