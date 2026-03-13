
package mn.gov.xyp.insurance;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100578_disabledHumanEnglishInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100578_disabledHumanEnglishInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://insurance.xyp.gov.mn/}disabledHumanInfoEnglishRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100578_disabledHumanEnglishInfo", propOrder = {
    "request"
})
public class WS100578DisabledHumanEnglishInfo {

    protected DisabledHumanInfoEnglishRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link DisabledHumanInfoEnglishRequestData }
     *     
     */
    public DisabledHumanInfoEnglishRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabledHumanInfoEnglishRequestData }
     *     
     */
    public void setRequest(DisabledHumanInfoEnglishRequestData value) {
        this.request = value;
    }

}
