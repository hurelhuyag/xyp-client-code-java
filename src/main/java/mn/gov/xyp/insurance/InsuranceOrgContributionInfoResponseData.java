
package mn.gov.xyp.insurance;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insuranceOrgContributionInfoResponseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insuranceOrgContributionInfoResponseData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aimagId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bagId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="info" type="{http://insurance.xyp.gov.mn/}insuranceOrgContributionInfoDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="orgAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgEZClassID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgEZClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgHariutslaga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgHariutslagaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgUmch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgUmchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sumId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceOrgContributionInfoResponseData", propOrder = {
    "aimagId",
    "aimagName",
    "bagId",
    "bagName",
    "info",
    "orgAddress",
    "orgEZClassID",
    "orgEZClassName",
    "orgHariutslaga",
    "orgHariutslagaID",
    "orgId",
    "orgMail",
    "orgName",
    "orgPhone",
    "orgRegnum",
    "orgUmch",
    "orgUmchID",
    "sumId",
    "sumName"
})
public class InsuranceOrgContributionInfoResponseData {

    protected String aimagId;
    protected String aimagName;
    protected String bagId;
    protected String bagName;
    @XmlElement(nillable = true)
    protected List<InsuranceOrgContributionInfoDetailData> info;
    protected String orgAddress;
    protected String orgEZClassID;
    protected String orgEZClassName;
    protected String orgHariutslaga;
    protected String orgHariutslagaID;
    protected String orgId;
    protected String orgMail;
    protected String orgName;
    protected String orgPhone;
    protected String orgRegnum;
    protected String orgUmch;
    protected String orgUmchID;
    protected String sumId;
    protected String sumName;

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
     * Gets the value of the bagId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagId() {
        return bagId;
    }

    /**
     * Sets the value of the bagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagId(String value) {
        this.bagId = value;
    }

    /**
     * Gets the value of the bagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagName() {
        return bagName;
    }

    /**
     * Sets the value of the bagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagName(String value) {
        this.bagName = value;
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
     * {@link InsuranceOrgContributionInfoDetailData }
     * 
     * 
     */
    public List<InsuranceOrgContributionInfoDetailData> getInfo() {
        if (info == null) {
            info = new ArrayList<InsuranceOrgContributionInfoDetailData>();
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
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgId(String value) {
        this.orgId = value;
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
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
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
     * Gets the value of the orgRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRegnum() {
        return orgRegnum;
    }

    /**
     * Sets the value of the orgRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgRegnum(String value) {
        this.orgRegnum = value;
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

    /**
     * Gets the value of the sumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumId() {
        return sumId;
    }

    /**
     * Sets the value of the sumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumId(String value) {
        this.sumId = value;
    }

    /**
     * Gets the value of the sumName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumName() {
        return sumName;
    }

    /**
     * Sets the value of the sumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumName(String value) {
        this.sumName = value;
    }

}
