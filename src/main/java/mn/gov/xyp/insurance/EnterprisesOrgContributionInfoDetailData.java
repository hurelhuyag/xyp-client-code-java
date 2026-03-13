
package mn.gov.xyp.insurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enterprisesOrgContributionInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enterprisesOrgContributionInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="awardCal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emdSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gadaad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genderCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mainCal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ndSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="occID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="occName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherAddCal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherCal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unaaCal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enterprisesOrgContributionInfoDetailData", propOrder = {
    "age",
    "awardCal",
    "calSum",
    "emdSum",
    "gadaad",
    "gender",
    "genderCount",
    "mainCal",
    "ndSum",
    "occID",
    "occName",
    "otherAddCal",
    "otherCal",
    "reportMonth",
    "reportYear",
    "unaaCal",
    "bClass",
    "bClassName"
})
public class EnterprisesOrgContributionInfoDetailData {

    protected int age;
    protected String awardCal;
    protected String calSum;
    protected String emdSum;
    protected String gadaad;
    protected String gender;
    protected String genderCount;
    protected String mainCal;
    protected String ndSum;
    protected String occID;
    protected String occName;
    protected String otherAddCal;
    protected String otherCal;
    protected String reportMonth;
    protected String reportYear;
    protected String unaaCal;
    protected String bClass;
    protected String bClassName;

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the awardCal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardCal() {
        return awardCal;
    }

    /**
     * Sets the value of the awardCal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardCal(String value) {
        this.awardCal = value;
    }

    /**
     * Gets the value of the calSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalSum() {
        return calSum;
    }

    /**
     * Sets the value of the calSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalSum(String value) {
        this.calSum = value;
    }

    /**
     * Gets the value of the emdSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmdSum() {
        return emdSum;
    }

    /**
     * Sets the value of the emdSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmdSum(String value) {
        this.emdSum = value;
    }

    /**
     * Gets the value of the gadaad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGadaad() {
        return gadaad;
    }

    /**
     * Sets the value of the gadaad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGadaad(String value) {
        this.gadaad = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the genderCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCount() {
        return genderCount;
    }

    /**
     * Sets the value of the genderCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCount(String value) {
        this.genderCount = value;
    }

    /**
     * Gets the value of the mainCal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainCal() {
        return mainCal;
    }

    /**
     * Sets the value of the mainCal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainCal(String value) {
        this.mainCal = value;
    }

    /**
     * Gets the value of the ndSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdSum() {
        return ndSum;
    }

    /**
     * Sets the value of the ndSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdSum(String value) {
        this.ndSum = value;
    }

    /**
     * Gets the value of the occID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccID() {
        return occID;
    }

    /**
     * Sets the value of the occID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccID(String value) {
        this.occID = value;
    }

    /**
     * Gets the value of the occName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccName() {
        return occName;
    }

    /**
     * Sets the value of the occName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccName(String value) {
        this.occName = value;
    }

    /**
     * Gets the value of the otherAddCal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAddCal() {
        return otherAddCal;
    }

    /**
     * Sets the value of the otherAddCal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAddCal(String value) {
        this.otherAddCal = value;
    }

    /**
     * Gets the value of the otherCal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCal() {
        return otherCal;
    }

    /**
     * Sets the value of the otherCal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCal(String value) {
        this.otherCal = value;
    }

    /**
     * Gets the value of the reportMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportMonth() {
        return reportMonth;
    }

    /**
     * Sets the value of the reportMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportMonth(String value) {
        this.reportMonth = value;
    }

    /**
     * Gets the value of the reportYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportYear() {
        return reportYear;
    }

    /**
     * Sets the value of the reportYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportYear(String value) {
        this.reportYear = value;
    }

    /**
     * Gets the value of the unaaCal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnaaCal() {
        return unaaCal;
    }

    /**
     * Sets the value of the unaaCal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnaaCal(String value) {
        this.unaaCal = value;
    }

    /**
     * Gets the value of the bClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBClass() {
        return bClass;
    }

    /**
     * Sets the value of the bClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBClass(String value) {
        this.bClass = value;
    }

    /**
     * Gets the value of the bClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBClassName() {
        return bClassName;
    }

    /**
     * Sets the value of the bClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBClassName(String value) {
        this.bClassName = value;
    }

}
