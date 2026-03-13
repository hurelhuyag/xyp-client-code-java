
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceVehicleOrganizationRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceVehicleOrganizationRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://transport.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orgRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceVehicleOrganizationRequestData", propOrder = {
    "orgRegNum"
})
public class ServiceVehicleOrganizationRequestData
    extends ServiceRequest
{

    protected String orgRegNum;

    /**
     * Gets the value of the orgRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRegNum() {
        return orgRegNum;
    }

    /**
     * Sets the value of the orgRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgRegNum(String value) {
        this.orgRegNum = value;
    }

}
