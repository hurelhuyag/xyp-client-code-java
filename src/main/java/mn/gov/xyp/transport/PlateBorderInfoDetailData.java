
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for plateBorderInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="plateBorderInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdOrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="travelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plateBorderInfoDetailData", propOrder = {
    "createdDate",
    "createdOrgName",
    "fromCountryName",
    "ownerCountryName",
    "passType",
    "travelNumber",
    "vehicleTypeName"
})
public class PlateBorderInfoDetailData {

    protected String createdDate;
    protected String createdOrgName;
    protected String fromCountryName;
    protected String ownerCountryName;
    protected String passType;
    protected String travelNumber;
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
     * Gets the value of the travelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelNumber() {
        return travelNumber;
    }

    /**
     * Sets the value of the travelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelNumber(String value) {
        this.travelNumber = value;
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
