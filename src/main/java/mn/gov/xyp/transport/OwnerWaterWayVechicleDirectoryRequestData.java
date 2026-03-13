
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ownerWaterWayVechicleDirectoryRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ownerWaterWayVechicleDirectoryRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://transport.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ownerWaterWayVechicleDirectoryRequestData", propOrder = {
    "countryNumber"
})
public class OwnerWaterWayVechicleDirectoryRequestData
    extends ServiceRequest
{

    protected String countryNumber;

    /**
     * Gets the value of the countryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryNumber() {
        return countryNumber;
    }

    /**
     * Sets the value of the countryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryNumber(String value) {
        this.countryNumber = value;
    }

}
