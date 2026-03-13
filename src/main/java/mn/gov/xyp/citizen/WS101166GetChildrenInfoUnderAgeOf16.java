
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS101166_GetChildrenInfoUnderAgeOf16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS101166_GetChildrenInfoUnderAgeOf16"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}getChildrenInfoUnderAgeOf16RequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS101166_GetChildrenInfoUnderAgeOf16", propOrder = {
    "request"
})
public class WS101166GetChildrenInfoUnderAgeOf16 {

    protected GetChildrenInfoUnderAgeOf16RequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetChildrenInfoUnderAgeOf16RequestData }
     *     
     */
    public GetChildrenInfoUnderAgeOf16RequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetChildrenInfoUnderAgeOf16RequestData }
     *     
     */
    public void setRequest(GetChildrenInfoUnderAgeOf16RequestData value) {
        this.request = value;
    }

}
