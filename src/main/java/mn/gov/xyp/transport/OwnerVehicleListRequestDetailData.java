
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ownerVehicleListRequestDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ownerVehicleListRequestDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buildYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cabinNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="engineCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ezemshigch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fuelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inspExpired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inspStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isLimited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="markName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownWeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ownerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="plateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ownerVehicleListRequestDetailData", propOrder = {
    "buildYear",
    "cabinNumber",
    "className",
    "colorName",
    "engineCapacity",
    "ezemshigch",
    "fuelName",
    "importDate",
    "inspExpired",
    "inspStatus",
    "isLimited",
    "markName",
    "modelName",
    "ownWeight",
    "ownerId",
    "plateNumber",
    "vehicleId"
})
public class OwnerVehicleListRequestDetailData {

    protected int buildYear;
    protected String cabinNumber;
    protected String className;
    protected String colorName;
    protected int engineCapacity;
    protected String ezemshigch;
    protected String fuelName;
    protected String importDate;
    protected String inspExpired;
    protected String inspStatus;
    protected String isLimited;
    protected String markName;
    protected String modelName;
    protected int ownWeight;
    protected int ownerId;
    protected String plateNumber;
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
     * Gets the value of the cabinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinNumber() {
        return cabinNumber;
    }

    /**
     * Sets the value of the cabinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinNumber(String value) {
        this.cabinNumber = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the colorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * Sets the value of the colorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorName(String value) {
        this.colorName = value;
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
     * Gets the value of the ezemshigch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEzemshigch() {
        return ezemshigch;
    }

    /**
     * Sets the value of the ezemshigch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEzemshigch(String value) {
        this.ezemshigch = value;
    }

    /**
     * Gets the value of the fuelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelName() {
        return fuelName;
    }

    /**
     * Sets the value of the fuelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelName(String value) {
        this.fuelName = value;
    }

    /**
     * Gets the value of the importDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportDate() {
        return importDate;
    }

    /**
     * Sets the value of the importDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportDate(String value) {
        this.importDate = value;
    }

    /**
     * Gets the value of the inspExpired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspExpired() {
        return inspExpired;
    }

    /**
     * Sets the value of the inspExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspExpired(String value) {
        this.inspExpired = value;
    }

    /**
     * Gets the value of the inspStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspStatus() {
        return inspStatus;
    }

    /**
     * Sets the value of the inspStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspStatus(String value) {
        this.inspStatus = value;
    }

    /**
     * Gets the value of the isLimited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLimited() {
        return isLimited;
    }

    /**
     * Sets the value of the isLimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLimited(String value) {
        this.isLimited = value;
    }

    /**
     * Gets the value of the markName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkName() {
        return markName;
    }

    /**
     * Sets the value of the markName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkName(String value) {
        this.markName = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the ownWeight property.
     * 
     */
    public int getOwnWeight() {
        return ownWeight;
    }

    /**
     * Sets the value of the ownWeight property.
     * 
     */
    public void setOwnWeight(int value) {
        this.ownWeight = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     */
    public int getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     */
    public void setOwnerId(int value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the plateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * Sets the value of the plateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateNumber(String value) {
        this.plateNumber = value;
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
