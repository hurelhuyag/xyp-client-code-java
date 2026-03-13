
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAvailableNumberListRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAvailableNumberListRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://transport.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provinceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableNumberListRequestData", propOrder = {
    "plateNumber",
    "provinceId"
})
public class GetAvailableNumberListRequestData
    extends ServiceRequest
{

    protected String plateNumber;
    protected String provinceId;

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
     * Gets the value of the provinceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * Sets the value of the provinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceId(String value) {
        this.provinceId = value;
    }

}
