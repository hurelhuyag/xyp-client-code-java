
package mn.gov.xyp.insurance;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insuranceOrgContributionInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insuranceOrgContributionInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="awardCal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="benCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emdBenSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emdOrgSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emdSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gadaad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mainCal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ndBenSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ndOrgSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ndSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherAddCal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherCal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tuleeCal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unaaCal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="womanCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceOrgContributionInfoDetailData", propOrder = {
    "awardCal",
    "benCount",
    "calSum",
    "emdBenSum",
    "emdOrgSum",
    "emdSum",
    "gadaad",
    "mainCal",
    "ndBenSum",
    "ndOrgSum",
    "ndSum",
    "otherAddCal",
    "otherCal",
    "tuleeCal",
    "unaaCal",
    "womanCount",
    "bClass"
})
public class InsuranceOrgContributionInfoDetailData {

    protected String awardCal;
    protected int benCount;
    protected String calSum;
    protected String emdBenSum;
    protected String emdOrgSum;
    protected String emdSum;
    protected int gadaad;
    protected String mainCal;
    protected String ndBenSum;
    protected String ndOrgSum;
    protected String ndSum;
    protected String otherAddCal;
    protected String otherCal;
    protected String tuleeCal;
    protected String unaaCal;
    protected int womanCount;
    protected String bClass;

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
     * Gets the value of the benCount property.
     * 
     */
    public int getBenCount() {
        return benCount;
    }

    /**
     * Sets the value of the benCount property.
     * 
     */
    public void setBenCount(int value) {
        this.benCount = value;
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
     * Gets the value of the emdBenSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmdBenSum() {
        return emdBenSum;
    }

    /**
     * Sets the value of the emdBenSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmdBenSum(String value) {
        this.emdBenSum = value;
    }

    /**
     * Gets the value of the emdOrgSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmdOrgSum() {
        return emdOrgSum;
    }

    /**
     * Sets the value of the emdOrgSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmdOrgSum(String value) {
        this.emdOrgSum = value;
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
     */
    public int getGadaad() {
        return gadaad;
    }

    /**
     * Sets the value of the gadaad property.
     * 
     */
    public void setGadaad(int value) {
        this.gadaad = value;
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
     * Gets the value of the ndBenSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdBenSum() {
        return ndBenSum;
    }

    /**
     * Sets the value of the ndBenSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdBenSum(String value) {
        this.ndBenSum = value;
    }

    /**
     * Gets the value of the ndOrgSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdOrgSum() {
        return ndOrgSum;
    }

    /**
     * Sets the value of the ndOrgSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdOrgSum(String value) {
        this.ndOrgSum = value;
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
     * Gets the value of the tuleeCal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuleeCal() {
        return tuleeCal;
    }

    /**
     * Sets the value of the tuleeCal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuleeCal(String value) {
        this.tuleeCal = value;
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
     * Gets the value of the womanCount property.
     * 
     */
    public int getWomanCount() {
        return womanCount;
    }

    /**
     * Sets the value of the womanCount property.
     * 
     */
    public void setWomanCount(int value) {
        this.womanCount = value;
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

}
