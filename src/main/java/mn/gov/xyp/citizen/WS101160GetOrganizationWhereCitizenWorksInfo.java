
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS101160_GetOrganizationWhereCitizenWorksInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS101160_GetOrganizationWhereCitizenWorksInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}getOrganizationWhereCitizenWorksInfoRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS101160_GetOrganizationWhereCitizenWorksInfo", propOrder = {
    "request"
})
public class WS101160GetOrganizationWhereCitizenWorksInfo {

    protected GetOrganizationWhereCitizenWorksInfoRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetOrganizationWhereCitizenWorksInfoRequestData }
     *     
     */
    public GetOrganizationWhereCitizenWorksInfoRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrganizationWhereCitizenWorksInfoRequestData }
     *     
     */
    public void setRequest(GetOrganizationWhereCitizenWorksInfoRequestData value) {
        this.request = value;
    }

}
