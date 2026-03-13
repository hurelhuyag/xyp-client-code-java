
package mn.gov.xyp.insurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100585_GetOrgBenNumBy36Month complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100585_GetOrgBenNumBy36Month"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://insurance.xyp.gov.mn/}getOrgBenNumBy36MonthRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100585_GetOrgBenNumBy36Month", propOrder = {
    "request"
})
public class WS100585GetOrgBenNumBy36Month {

    protected GetOrgBenNumBy36MonthRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetOrgBenNumBy36MonthRequestData }
     *     
     */
    public GetOrgBenNumBy36MonthRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrgBenNumBy36MonthRequestData }
     *     
     */
    public void setRequest(GetOrgBenNumBy36MonthRequestData value) {
        this.request = value;
    }

}
