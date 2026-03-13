
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for umnsVehicleDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="umnsVehicleDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buildYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="engineCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isOwner" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ownerRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purposeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="purposeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "umnsVehicleDetailData", propOrder = {
    "buildYear",
    "engineCapacity",
    "isOwner",
    "ownerRegnum",
    "purposeId",
    "purposeName",
    "vehicleId"
})
public class UmnsVehicleDetailData {

    protected int buildYear;
    protected int engineCapacity;
    protected int isOwner;
    protected String ownerRegnum;
    protected int purposeId;
    protected String purposeName;
    protected int vehicleId;

    /**
     * Gets the value of the buildYear property.
     * 
     */
    public int getBuildYear() {
        return buildYear;
    }

    /**
     * Sets the value of the buildYear property.
     * 
     */
    public void setBuildYear(int value) {
        this.buildYear = value;
    }

    /**
     * Gets the value of the engineCapacity property.
     * 
     */
    public int getEngineCapacity() {
        return engineCapacity;
    }

    /**
     * Sets the value of the engineCapacity property.
     * 
     */
    public void setEngineCapacity(int value) {
        this.engineCapacity = value;
    }

    /**
     * Gets the value of the isOwner property.
     * 
     */
    public int getIsOwner() {
        return isOwner;
    }

    /**
     * Sets the value of the isOwner property.
     * 
     */
    public void setIsOwner(int value) {
        this.isOwner = value;
    }

    /**
     * Gets the value of the ownerRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerRegnum() {
        return ownerRegnum;
    }

    /**
     * Sets the value of the ownerRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerRegnum(String value) {
        this.ownerRegnum = value;
    }

    /**
     * Gets the value of the purposeId property.
     * 
     */
    public int getPurposeId() {
        return purposeId;
    }

    /**
     * Sets the value of the purposeId property.
     * 
     */
    public void setPurposeId(int value) {
        this.purposeId = value;
    }

    /**
     * Gets the value of the purposeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeName() {
        return purposeName;
    }

    /**
     * Sets the value of the purposeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeName(String value) {
        this.purposeName = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     */
    public int getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     */
    public void setVehicleId(int value) {
        this.vehicleId = value;
    }

}
