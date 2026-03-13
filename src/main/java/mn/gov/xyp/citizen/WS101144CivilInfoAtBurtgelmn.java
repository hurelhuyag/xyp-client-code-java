
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS101144_CivilInfoAtBurtgelmn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS101144_CivilInfoAtBurtgelmn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}civilInfoAtBurtgelmnRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS101144_CivilInfoAtBurtgelmn", propOrder = {
    "request"
})
public class WS101144CivilInfoAtBurtgelmn {

    protected CivilInfoAtBurtgelmnRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CivilInfoAtBurtgelmnRequestData }
     *     
     */
    public CivilInfoAtBurtgelmnRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CivilInfoAtBurtgelmnRequestData }
     *     
     */
    public void setRequest(CivilInfoAtBurtgelmnRequestData value) {
        this.request = value;
    }

}
