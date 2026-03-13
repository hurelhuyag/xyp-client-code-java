
package mn.gov.xyp.insurance;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enterprisesOrgContributionInfoResponseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enterprisesOrgContributionInfoResponseData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aimagId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="info" type="{http://insurance.xyp.gov.mn/}enterprisesOrgContributionInfoDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="orgAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgEZClassID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgEZClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgHariutslaga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgHariutslagaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgUmch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgUmchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enterprisesOrgContributionInfoResponseData", propOrder = {
    "aimagId",
    "aimagName",
    "info",
    "orgAddress",
    "orgEZClassID",
    "orgEZClassName",
    "orgHariutslaga",
    "orgHariutslagaID",
    "orgMail",
    "orgPhone",
    "orgUmch",
    "orgUmchID"
})
public class EnterprisesOrgContributionInfoResponseData {

    protected String aimagId;
    protected String aimagName;
    @XmlElement(nillable = true)
    protected List<EnterprisesOrgContributionInfoDetailData> info;
    protected String orgAddress;
    protected String orgEZClassID;
    protected String orgEZClassName;
    protected String orgHariutslaga;
    protected String orgHariutslagaID;
    protected String orgMail;
    protected String orgPhone;
    protected String orgUmch;
    protected String orgUmchID;

    /**
     * Gets the value of the aimagId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagId() {
        return aimagId;
    }

    /**
     * Sets the value of the aimagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagId(String value) {
        this.aimagId = value;
    }

    /**
     * Gets the value of the aimagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagName() {
        return aimagName;
    }

    /**
     * Sets the value of the aimagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagName(String value) {
        this.aimagName = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the info property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnterprisesOrgContributionInfoDetailData }
     * 
     * 
     */
    public List<EnterprisesOrgContributionInfoDetailData> getInfo() {
        if (info == null) {
            info = new ArrayList<EnterprisesOrgContributionInfoDetailData>();
        }
        return this.info;
    }

    /**
     * Gets the value of the orgAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgAddress() {
        return orgAddress;
    }

    /**
     * Sets the value of the orgAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgAddress(String value) {
        this.orgAddress = value;
    }

    /**
     * Gets the value of the orgEZClassID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgEZClassID() {
        return orgEZClassID;
    }

    /**
     * Sets the value of the orgEZClassID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgEZClassID(String value) {
        this.orgEZClassID = value;
    }

    /**
     * Gets the value of the orgEZClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgEZClassName() {
        return orgEZClassName;
    }

    /**
     * Sets the value of the orgEZClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgEZClassName(String value) {
        this.orgEZClassName = value;
    }

    /**
     * Gets the value of the orgHariutslaga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgHariutslaga() {
        return orgHariutslaga;
    }

    /**
     * Sets the value of the orgHariutslaga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgHariutslaga(String value) {
        this.orgHariutslaga = value;
    }

    /**
     * Gets the value of the orgHariutslagaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgHariutslagaID() {
        return orgHariutslagaID;
    }

    /**
     * Sets the value of the orgHariutslagaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgHariutslagaID(String value) {
        this.orgHariutslagaID = value;
    }

    /**
     * Gets the value of the orgMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgMail() {
        return orgMail;
    }

    /**
     * Sets the value of the orgMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgMail(String value) {
        this.orgMail = value;
    }

    /**
     * Gets the value of the orgPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPhone() {
        return orgPhone;
    }

    /**
     * Sets the value of the orgPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgPhone(String value) {
        this.orgPhone = value;
    }

    /**
     * Gets the value of the orgUmch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUmch() {
        return orgUmch;
    }

    /**
     * Sets the value of the orgUmch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUmch(String value) {
        this.orgUmch = value;
    }

    /**
     * Gets the value of the orgUmchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUmchID() {
        return orgUmchID;
    }

    /**
     * Sets the value of the orgUmchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUmchID(String value) {
        this.orgUmchID = value;
    }

}
