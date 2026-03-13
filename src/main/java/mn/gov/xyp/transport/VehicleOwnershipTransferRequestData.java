
package mn.gov.xyp.transport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleOwnershipTransferRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleOwnershipTransferRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://transport.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cabinNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isChangePlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newOwnerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newOwnerRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleOwnershipTransferRequestData", propOrder = {
    "cabinNumber",
    "isChangePlateNumber",
    "newOwnerPhone",
    "newOwnerRegnum",
    "ownerRegnum"
})
public class VehicleOwnershipTransferRequestData
    extends ServiceRequest
{

    protected String cabinNumber;
    protected String isChangePlateNumber;
    protected String newOwnerPhone;
    protected String newOwnerRegnum;
    protected String ownerRegnum;

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
     * Gets the value of the isChangePlateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsChangePlateNumber() {
        return isChangePlateNumber;
    }

    /**
     * Sets the value of the isChangePlateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsChangePlateNumber(String value) {
        this.isChangePlateNumber = value;
    }

    /**
     * Gets the value of the newOwnerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewOwnerPhone() {
        return newOwnerPhone;
    }

    /**
     * Sets the value of the newOwnerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewOwnerPhone(String value) {
        this.newOwnerPhone = value;
    }

    /**
     * Gets the value of the newOwnerRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewOwnerRegnum() {
        return newOwnerRegnum;
    }

    /**
     * Sets the value of the newOwnerRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewOwnerRegnum(String value) {
        this.newOwnerRegnum = value;
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

}
