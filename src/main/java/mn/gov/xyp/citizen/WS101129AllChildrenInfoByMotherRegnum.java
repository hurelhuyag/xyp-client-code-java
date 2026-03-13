
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS101129_allChildrenInfoByMotherRegnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS101129_allChildrenInfoByMotherRegnum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}allChildrenInfoByMotherRequestData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS101129_allChildrenInfoByMotherRegnum", propOrder = {
    "request"
})
public class WS101129AllChildrenInfoByMotherRegnum {

    protected AllChildrenInfoByMotherRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link AllChildrenInfoByMotherRequestData }
     *     
     */
    public AllChildrenInfoByMotherRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllChildrenInfoByMotherRequestData }
     *     
     */
    public void setRequest(AllChildrenInfoByMotherRequestData value) {
        this.request = value;
    }

}
