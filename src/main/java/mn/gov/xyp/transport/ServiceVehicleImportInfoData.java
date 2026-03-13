
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceVehicleImportInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceVehicleImportInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://transport.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="impExpDclrNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehModelNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceVehicleImportInfoData", propOrder = {
    "impExpDclrNo",
    "vehModelNo"
})
public class ServiceVehicleImportInfoData
    extends ServiceRequest
{

    protected String impExpDclrNo;
    protected String vehModelNo;

    /**
     * Gets the value of the impExpDclrNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpExpDclrNo() {
        return impExpDclrNo;
    }

    /**
     * Sets the value of the impExpDclrNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpExpDclrNo(String value) {
        this.impExpDclrNo = value;
    }

    /**
     * Gets the value of the vehModelNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehModelNo() {
        return vehModelNo;
    }

    /**
     * Sets the value of the vehModelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehModelNo(String value) {
        this.vehModelNo = value;
    }

}
