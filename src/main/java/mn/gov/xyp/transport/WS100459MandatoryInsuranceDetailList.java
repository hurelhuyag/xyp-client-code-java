
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100459_MandatoryInsuranceDetailList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100459_MandatoryInsuranceDetailList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://transport.xyp.gov.mn/}mandatoryInsuranceDetailListRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100459_MandatoryInsuranceDetailList", propOrder = {
    "request"
})
public class WS100459MandatoryInsuranceDetailList {

    protected MandatoryInsuranceDetailListRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryInsuranceDetailListRequestData }
     *     
     */
    public MandatoryInsuranceDetailListRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryInsuranceDetailListRequestData }
     *     
     */
    public void setRequest(MandatoryInsuranceDetailListRequestData value) {
        this.request = value;
    }

}
