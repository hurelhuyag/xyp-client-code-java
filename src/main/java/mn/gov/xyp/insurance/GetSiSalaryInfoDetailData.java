
package mn.gov.xyp.insurance;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSiSalaryInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSiSalaryInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="benClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="benShim" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="domName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPayed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="occCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgNdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgRegisterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shim" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSiSalaryInfoDetailData", propOrder = {
    "benClass",
    "benShim",
    "domName",
    "isPayed",
    "month",
    "occCode",
    "orgName",
    "orgNdId",
    "orgRegisterId",
    "salary",
    "shim",
    "year"
})
public class GetSiSalaryInfoDetailData {

    protected String benClass;
    protected Double benShim;
    protected String domName;
    protected String isPayed;
    protected int month;
    protected String occCode;
    protected String orgName;
    protected String orgNdId;
    protected String orgRegisterId;
    protected Double salary;
    protected Double shim;
    protected int year;

    /**
     * Gets the value of the benClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenClass() {
        return benClass;
    }

    /**
     * Sets the value of the benClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenClass(String value) {
        this.benClass = value;
    }

    /**
     * Gets the value of the benShim property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBenShim() {
        return benShim;
    }

    /**
     * Sets the value of the benShim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBenShim(Double value) {
        this.benShim = value;
    }

    /**
     * Gets the value of the domName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomName() {
        return domName;
    }

    /**
     * Sets the value of the domName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomName(String value) {
        this.domName = value;
    }

    /**
     * Gets the value of the isPayed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPayed() {
        return isPayed;
    }

    /**
     * Sets the value of the isPayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPayed(String value) {
        this.isPayed = value;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Gets the value of the occCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccCode() {
        return occCode;
    }

    /**
     * Sets the value of the occCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccCode(String value) {
        this.occCode = value;
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
     * Gets the value of the orgNdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgNdId() {
        return orgNdId;
    }

    /**
     * Sets the value of the orgNdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgNdId(String value) {
        this.orgNdId = value;
    }

    /**
     * Gets the value of the orgRegisterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRegisterId() {
        return orgRegisterId;
    }

    /**
     * Sets the value of the orgRegisterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgRegisterId(String value) {
        this.orgRegisterId = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalary(Double value) {
        this.salary = value;
    }

    /**
     * Gets the value of the shim property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShim() {
        return shim;
    }

    /**
     * Sets the value of the shim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShim(Double value) {
        this.shim = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
