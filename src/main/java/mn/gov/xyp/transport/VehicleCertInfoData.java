
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleCertInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleCertInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="archiveNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="borrowerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="borrowerFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="borrowerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="borrowerRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buildMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buildYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cabinNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="engineCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="engineModelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="engineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fuelTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inspectionExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="markName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modificationAxleCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modificationDoorCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modificationHeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modificationLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modificationMaxLoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modificationOwnWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modificationSeatCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modificationTotalWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modificationVinNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modificationWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purposeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qrcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="steeringTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "vehicleCertInfoData", propOrder = {
    "archiveNo",
    "borrowerAddress",
    "borrowerFamilyName",
    "borrowerName",
    "borrowerRegister",
    "buildMonth",
    "buildYear",
    "cabinNo",
    "classificationName",
    "colorName",
    "countryName",
    "engineCapacity",
    "engineModelName",
    "engineNo",
    "fuelTypeName",
    "importedDate",
    "inspectionExpireDate",
    "markName",
    "modelName",
    "modificationAxleCount",
    "modificationDoorCount",
    "modificationHeight",
    "modificationLength",
    "modificationMaxLoad",
    "modificationOwnWeight",
    "modificationSeatCount",
    "modificationTotalWeight",
    "modificationVinNo",
    "modificationWidth",
    "ownerAddress",
    "ownerFamilyName",
    "ownerName",
    "ownerRegister",
    "plateNumber",
    "purposeName",
    "qrcode",
    "serialNumber",
    "steeringTypeName",
    "vehicleTypeName"
})
public class VehicleCertInfoData {

    protected String archiveNo;
    protected String borrowerAddress;
    protected String borrowerFamilyName;
    protected String borrowerName;
    protected String borrowerRegister;
    protected String buildMonth;
    protected String buildYear;
    protected String cabinNo;
    protected String classificationName;
    protected String colorName;
    protected String countryName;
    protected String engineCapacity;
    protected String engineModelName;
    protected String engineNo;
    protected String fuelTypeName;
    protected String importedDate;
    protected String inspectionExpireDate;
    protected String markName;
    protected String modelName;
    protected String modificationAxleCount;
    protected String modificationDoorCount;
    protected String modificationHeight;
    protected String modificationLength;
    protected String modificationMaxLoad;
    protected String modificationOwnWeight;
    protected String modificationSeatCount;
    protected String modificationTotalWeight;
    protected String modificationVinNo;
    protected String modificationWidth;
    protected String ownerAddress;
    protected String ownerFamilyName;
    protected String ownerName;
    protected String ownerRegister;
    protected String plateNumber;
    protected String purposeName;
    protected String qrcode;
    protected String serialNumber;
    protected String steeringTypeName;
    protected String vehicleTypeName;

    /**
     * Gets the value of the archiveNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveNo() {
        return archiveNo;
    }

    /**
     * Sets the value of the archiveNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveNo(String value) {
        this.archiveNo = value;
    }

    /**
     * Gets the value of the borrowerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowerAddress() {
        return borrowerAddress;
    }

    /**
     * Sets the value of the borrowerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowerAddress(String value) {
        this.borrowerAddress = value;
    }

    /**
     * Gets the value of the borrowerFamilyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowerFamilyName() {
        return borrowerFamilyName;
    }

    /**
     * Sets the value of the borrowerFamilyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowerFamilyName(String value) {
        this.borrowerFamilyName = value;
    }

    /**
     * Gets the value of the borrowerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowerName() {
        return borrowerName;
    }

    /**
     * Sets the value of the borrowerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowerName(String value) {
        this.borrowerName = value;
    }

    /**
     * Gets the value of the borrowerRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowerRegister() {
        return borrowerRegister;
    }

    /**
     * Sets the value of the borrowerRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowerRegister(String value) {
        this.borrowerRegister = value;
    }

    /**
     * Gets the value of the buildMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildMonth() {
        return buildMonth;
    }

    /**
     * Sets the value of the buildMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildMonth(String value) {
        this.buildMonth = value;
    }

    /**
     * Gets the value of the buildYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildYear() {
        return buildYear;
    }

    /**
     * Sets the value of the buildYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildYear(String value) {
        this.buildYear = value;
    }

    /**
     * Gets the value of the cabinNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinNo() {
        return cabinNo;
    }

    /**
     * Sets the value of the cabinNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinNo(String value) {
        this.cabinNo = value;
    }

    /**
     * Gets the value of the classificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationName() {
        return classificationName;
    }

    /**
     * Sets the value of the classificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationName(String value) {
        this.classificationName = value;
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
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the engineCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineCapacity() {
        return engineCapacity;
    }

    /**
     * Sets the value of the engineCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineCapacity(String value) {
        this.engineCapacity = value;
    }

    /**
     * Gets the value of the engineModelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineModelName() {
        return engineModelName;
    }

    /**
     * Sets the value of the engineModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineModelName(String value) {
        this.engineModelName = value;
    }

    /**
     * Gets the value of the engineNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNo() {
        return engineNo;
    }

    /**
     * Sets the value of the engineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNo(String value) {
        this.engineNo = value;
    }

    /**
     * Gets the value of the fuelTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelTypeName() {
        return fuelTypeName;
    }

    /**
     * Sets the value of the fuelTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelTypeName(String value) {
        this.fuelTypeName = value;
    }

    /**
     * Gets the value of the importedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportedDate() {
        return importedDate;
    }

    /**
     * Sets the value of the importedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportedDate(String value) {
        this.importedDate = value;
    }

    /**
     * Gets the value of the inspectionExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionExpireDate() {
        return inspectionExpireDate;
    }

    /**
     * Sets the value of the inspectionExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectionExpireDate(String value) {
        this.inspectionExpireDate = value;
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
     * Gets the value of the modificationAxleCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationAxleCount() {
        return modificationAxleCount;
    }

    /**
     * Sets the value of the modificationAxleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationAxleCount(String value) {
        this.modificationAxleCount = value;
    }

    /**
     * Gets the value of the modificationDoorCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationDoorCount() {
        return modificationDoorCount;
    }

    /**
     * Sets the value of the modificationDoorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationDoorCount(String value) {
        this.modificationDoorCount = value;
    }

    /**
     * Gets the value of the modificationHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationHeight() {
        return modificationHeight;
    }

    /**
     * Sets the value of the modificationHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationHeight(String value) {
        this.modificationHeight = value;
    }

    /**
     * Gets the value of the modificationLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationLength() {
        return modificationLength;
    }

    /**
     * Sets the value of the modificationLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationLength(String value) {
        this.modificationLength = value;
    }

    /**
     * Gets the value of the modificationMaxLoad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationMaxLoad() {
        return modificationMaxLoad;
    }

    /**
     * Sets the value of the modificationMaxLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationMaxLoad(String value) {
        this.modificationMaxLoad = value;
    }

    /**
     * Gets the value of the modificationOwnWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationOwnWeight() {
        return modificationOwnWeight;
    }

    /**
     * Sets the value of the modificationOwnWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationOwnWeight(String value) {
        this.modificationOwnWeight = value;
    }

    /**
     * Gets the value of the modificationSeatCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationSeatCount() {
        return modificationSeatCount;
    }

    /**
     * Sets the value of the modificationSeatCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationSeatCount(String value) {
        this.modificationSeatCount = value;
    }

    /**
     * Gets the value of the modificationTotalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationTotalWeight() {
        return modificationTotalWeight;
    }

    /**
     * Sets the value of the modificationTotalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationTotalWeight(String value) {
        this.modificationTotalWeight = value;
    }

    /**
     * Gets the value of the modificationVinNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationVinNo() {
        return modificationVinNo;
    }

    /**
     * Sets the value of the modificationVinNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationVinNo(String value) {
        this.modificationVinNo = value;
    }

    /**
     * Gets the value of the modificationWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationWidth() {
        return modificationWidth;
    }

    /**
     * Sets the value of the modificationWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationWidth(String value) {
        this.modificationWidth = value;
    }

    /**
     * Gets the value of the ownerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerAddress() {
        return ownerAddress;
    }

    /**
     * Sets the value of the ownerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerAddress(String value) {
        this.ownerAddress = value;
    }

    /**
     * Gets the value of the ownerFamilyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerFamilyName() {
        return ownerFamilyName;
    }

    /**
     * Sets the value of the ownerFamilyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerFamilyName(String value) {
        this.ownerFamilyName = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the ownerRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerRegister() {
        return ownerRegister;
    }

    /**
     * Sets the value of the ownerRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerRegister(String value) {
        this.ownerRegister = value;
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
     * Gets the value of the qrcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrcode() {
        return qrcode;
    }

    /**
     * Sets the value of the qrcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrcode(String value) {
        this.qrcode = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the steeringTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSteeringTypeName() {
        return steeringTypeName;
    }

    /**
     * Sets the value of the steeringTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSteeringTypeName(String value) {
        this.steeringTypeName = value;
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
