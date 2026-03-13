
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transferPlateNumberOwnerRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transferPlateNumberOwnerRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://transport.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="changePlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferPlateNumberOwnerRequestData", propOrder = {
    "changePlateNumber",
    "fromOwnerId",
    "toOwnerId",
    "vehicleId"
})
public class TransferPlateNumberOwnerRequestData
    extends ServiceRequest
{

    protected String changePlateNumber;
    protected String fromOwnerId;
    protected String toOwnerId;
    protected String vehicleId;

    /**
     * Gets the value of the changePlateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangePlateNumber() {
        return changePlateNumber;
    }

    /**
     * Sets the value of the changePlateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangePlateNumber(String value) {
        this.changePlateNumber = value;
    }

    /**
     * Gets the value of the fromOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromOwnerId() {
        return fromOwnerId;
    }

    /**
     * Sets the value of the fromOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromOwnerId(String value) {
        this.fromOwnerId = value;
    }

    /**
     * Gets the value of the toOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToOwnerId() {
        return toOwnerId;
    }

    /**
     * Sets the value of the toOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToOwnerId(String value) {
        this.toOwnerId = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleId(String value) {
        this.vehicleId = value;
    }

}
