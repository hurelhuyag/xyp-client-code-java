
package mn.gov.xyp.meta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100015_authServiceCheckByCitizen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100015_authServiceCheckByCitizen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://meta.xyp.gov.mn/}authServiceCheckByCitizenRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100015_authServiceCheckByCitizen", propOrder = {
    "request"
})
public class WS100015AuthServiceCheckByCitizen {

    protected AuthServiceCheckByCitizenRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link AuthServiceCheckByCitizenRequest }
     *     
     */
    public AuthServiceCheckByCitizenRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthServiceCheckByCitizenRequest }
     *     
     */
    public void setRequest(AuthServiceCheckByCitizenRequest value) {
        this.request = value;
    }

}
