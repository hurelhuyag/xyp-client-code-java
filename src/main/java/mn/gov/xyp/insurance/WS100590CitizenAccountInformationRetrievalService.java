
package mn.gov.xyp.insurance;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100590_CitizenAccountInformationRetrievalService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100590_CitizenAccountInformationRetrievalService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://insurance.xyp.gov.mn/}citizenAccountInformationRetrievalServiceRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100590_CitizenAccountInformationRetrievalService", propOrder = {
    "request"
})
public class WS100590CitizenAccountInformationRetrievalService {

    protected CitizenAccountInformationRetrievalServiceRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CitizenAccountInformationRetrievalServiceRequestData }
     *     
     */
    public CitizenAccountInformationRetrievalServiceRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenAccountInformationRetrievalServiceRequestData }
     *     
     */
    public void setRequest(CitizenAccountInformationRetrievalServiceRequestData value) {
        this.request = value;
    }

}
