
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS101153_ExtendTermOfGrantedNameUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS101153_ExtendTermOfGrantedNameUpdate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}extendTermOfGrantedNameUpdateRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS101153_ExtendTermOfGrantedNameUpdate", propOrder = {
    "request"
})
public class WS101153ExtendTermOfGrantedNameUpdate {

    protected ExtendTermOfGrantedNameUpdateRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendTermOfGrantedNameUpdateRequestData }
     *     
     */
    public ExtendTermOfGrantedNameUpdateRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendTermOfGrantedNameUpdateRequestData }
     *     
     */
    public void setRequest(ExtendTermOfGrantedNameUpdateRequestData value) {
        this.request = value;
    }

}
