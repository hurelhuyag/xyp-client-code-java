
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS101164_GetAwardInformationForMotherAndChild complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS101164_GetAwardInformationForMotherAndChild"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}getAwardInformationForMotherAndChildRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS101164_GetAwardInformationForMotherAndChild", propOrder = {
    "request"
})
public class WS101164GetAwardInformationForMotherAndChild {

    protected GetAwardInformationForMotherAndChildRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetAwardInformationForMotherAndChildRequestData }
     *     
     */
    public GetAwardInformationForMotherAndChildRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAwardInformationForMotherAndChildRequestData }
     *     
     */
    public void setRequest(GetAwardInformationForMotherAndChildRequestData value) {
        this.request = value;
    }

}
