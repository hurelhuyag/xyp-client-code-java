
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trainBorderInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trainBorderInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="created_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created_org_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="from_country_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="from_country_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="owner_country_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="owner_country_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pass_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="to_country_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="to_country_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="travel_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicle_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainBorderInfoDetailData", propOrder = {
    "createdDate",
    "createdOrgName",
    "fromCountryCode",
    "fromCountryName",
    "ownerCountryCode",
    "ownerCountryName",
    "passType",
    "toCountryCode",
    "toCountryName",
    "travelNo",
    "vehicleTypeName"
})
public class TrainBorderInfoDetailData {

    @XmlElement(name = "created_date")
    protected String createdDate;
    @XmlElement(name = "created_org_name")
    protected String createdOrgName;
    @XmlElement(name = "from_country_code")
    protected String fromCountryCode;
    @XmlElement(name = "from_country_name")
    protected String fromCountryName;
    @XmlElement(name = "owner_country_code")
    protected String ownerCountryCode;
    @XmlElement(name = "owner_country_name")
    protected String ownerCountryName;
    @XmlElement(name = "pass_type")
    protected String passType;
    @XmlElement(name = "to_country_code")
    protected String toCountryCode;
    @XmlElement(name = "to_country_name")
    protected String toCountryName;
    @XmlElement(name = "travel_no")
    protected String travelNo;
    @XmlElement(name = "vehicle_type_name")
    protected String vehicleTypeName;

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the createdOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedOrgName() {
        return createdOrgName;
    }

    /**
     * Sets the value of the createdOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedOrgName(String value) {
        this.createdOrgName = value;
    }

    /**
     * Gets the value of the fromCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCountryCode() {
        return fromCountryCode;
    }

    /**
     * Sets the value of the fromCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCountryCode(String value) {
        this.fromCountryCode = value;
    }

    /**
     * Gets the value of the fromCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCountryName() {
        return fromCountryName;
    }

    /**
     * Sets the value of the fromCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCountryName(String value) {
        this.fromCountryName = value;
    }

    /**
     * Gets the value of the ownerCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCountryCode() {
        return ownerCountryCode;
    }

    /**
     * Sets the value of the ownerCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCountryCode(String value) {
        this.ownerCountryCode = value;
    }

    /**
     * Gets the value of the ownerCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCountryName() {
        return ownerCountryName;
    }

    /**
     * Sets the value of the ownerCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCountryName(String value) {
        this.ownerCountryName = value;
    }

    /**
     * Gets the value of the passType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassType() {
        return passType;
    }

    /**
     * Sets the value of the passType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassType(String value) {
        this.passType = value;
    }

    /**
     * Gets the value of the toCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountryCode() {
        return toCountryCode;
    }

    /**
     * Sets the value of the toCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountryCode(String value) {
        this.toCountryCode = value;
    }

    /**
     * Gets the value of the toCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountryName() {
        return toCountryName;
    }

    /**
     * Sets the value of the toCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountryName(String value) {
        this.toCountryName = value;
    }

    /**
     * Gets the value of the travelNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelNo() {
        return travelNo;
    }

    /**
     * Sets the value of the travelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelNo(String value) {
        this.travelNo = value;
    }

    /**
     * Gets the value of the vehicleTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleTypeName() {
        return vehicleTypeName;
    }

    /**
     * Sets the value of the vehicleTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleTypeName(String value) {
        this.vehicleTypeName = value;
    }

}
