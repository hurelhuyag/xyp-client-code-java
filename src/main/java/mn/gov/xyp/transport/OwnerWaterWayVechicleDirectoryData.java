
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ownerWaterWayVechicleDirectoryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ownerWaterWayVechicleDirectoryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="determination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diamonds" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="engineCapacity" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="engineDesign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="engineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entryYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="industrializedCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="largeBodyMaterial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="longs" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="manufacturedYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="register" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeofSteam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wide" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ownerWaterWayVechicleDirectoryData", propOrder = {
    "category",
    "certifiedDate",
    "determination",
    "diamonds",
    "engineCapacity",
    "engineDesign",
    "engineNumber",
    "entryYear",
    "firstname",
    "givenname",
    "industrializedCountry",
    "largeBodyMaterial",
    "lastname",
    "longs",
    "manufacturedYear",
    "mark",
    "numberOfSeats",
    "register",
    "typeofSteam",
    "wide"
})
public class OwnerWaterWayVechicleDirectoryData {

    protected String category;
    protected String certifiedDate;
    protected String determination;
    protected int diamonds;
    protected double engineCapacity;
    protected String engineDesign;
    protected String engineNumber;
    protected int entryYear;
    protected String firstname;
    protected String givenname;
    protected String industrializedCountry;
    protected String largeBodyMaterial;
    protected String lastname;
    protected double longs;
    protected int manufacturedYear;
    protected String mark;
    protected int numberOfSeats;
    protected String register;
    protected String typeofSteam;
    protected double wide;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the certifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertifiedDate() {
        return certifiedDate;
    }

    /**
     * Sets the value of the certifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertifiedDate(String value) {
        this.certifiedDate = value;
    }

    /**
     * Gets the value of the determination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetermination() {
        return determination;
    }

    /**
     * Sets the value of the determination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetermination(String value) {
        this.determination = value;
    }

    /**
     * Gets the value of the diamonds property.
     * 
     */
    public int getDiamonds() {
        return diamonds;
    }

    /**
     * Sets the value of the diamonds property.
     * 
     */
    public void setDiamonds(int value) {
        this.diamonds = value;
    }

    /**
     * Gets the value of the engineCapacity property.
     * 
     */
    public double getEngineCapacity() {
        return engineCapacity;
    }

    /**
     * Sets the value of the engineCapacity property.
     * 
     */
    public void setEngineCapacity(double value) {
        this.engineCapacity = value;
    }

    /**
     * Gets the value of the engineDesign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineDesign() {
        return engineDesign;
    }

    /**
     * Sets the value of the engineDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineDesign(String value) {
        this.engineDesign = value;
    }

    /**
     * Gets the value of the engineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /**
     * Sets the value of the engineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNumber(String value) {
        this.engineNumber = value;
    }

    /**
     * Gets the value of the entryYear property.
     * 
     */
    public int getEntryYear() {
        return entryYear;
    }

    /**
     * Sets the value of the entryYear property.
     * 
     */
    public void setEntryYear(int value) {
        this.entryYear = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the givenname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenname() {
        return givenname;
    }

    /**
     * Sets the value of the givenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenname(String value) {
        this.givenname = value;
    }

    /**
     * Gets the value of the industrializedCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustrializedCountry() {
        return industrializedCountry;
    }

    /**
     * Sets the value of the industrializedCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustrializedCountry(String value) {
        this.industrializedCountry = value;
    }

    /**
     * Gets the value of the largeBodyMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargeBodyMaterial() {
        return largeBodyMaterial;
    }

    /**
     * Sets the value of the largeBodyMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargeBodyMaterial(String value) {
        this.largeBodyMaterial = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the longs property.
     * 
     */
    public double getLongs() {
        return longs;
    }

    /**
     * Sets the value of the longs property.
     * 
     */
    public void setLongs(double value) {
        this.longs = value;
    }

    /**
     * Gets the value of the manufacturedYear property.
     * 
     */
    public int getManufacturedYear() {
        return manufacturedYear;
    }

    /**
     * Sets the value of the manufacturedYear property.
     * 
     */
    public void setManufacturedYear(int value) {
        this.manufacturedYear = value;
    }

    /**
     * Gets the value of the mark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMark() {
        return mark;
    }

    /**
     * Sets the value of the mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMark(String value) {
        this.mark = value;
    }

    /**
     * Gets the value of the numberOfSeats property.
     * 
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * Sets the value of the numberOfSeats property.
     * 
     */
    public void setNumberOfSeats(int value) {
        this.numberOfSeats = value;
    }

    /**
     * Gets the value of the register property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegister(String value) {
        this.register = value;
    }

    /**
     * Gets the value of the typeofSteam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeofSteam() {
        return typeofSteam;
    }

    /**
     * Sets the value of the typeofSteam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeofSteam(String value) {
        this.typeofSteam = value;
    }

    /**
     * Gets the value of the wide property.
     * 
     */
    public double getWide() {
        return wide;
    }

    /**
     * Sets the value of the wide property.
     * 
     */
    public void setWide(double value) {
        this.wide = value;
    }

}
