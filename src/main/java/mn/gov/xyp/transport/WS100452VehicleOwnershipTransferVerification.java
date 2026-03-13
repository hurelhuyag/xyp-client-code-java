
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100452_VehicleOwnershipTransferVerification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100452_VehicleOwnershipTransferVerification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://transport.xyp.gov.mn/}vehicleOwnershipTransferVerificationRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100452_VehicleOwnershipTransferVerification", propOrder = {
    "request"
})
public class WS100452VehicleOwnershipTransferVerification {

    protected VehicleOwnershipTransferVerificationRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleOwnershipTransferVerificationRequestData }
     *     
     */
    public VehicleOwnershipTransferVerificationRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleOwnershipTransferVerificationRequestData }
     *     
     */
    public void setRequest(VehicleOwnershipTransferVerificationRequestData value) {
        this.request = value;
    }

}
