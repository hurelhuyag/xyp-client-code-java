
package mn.gov.xyp.insurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100579_pensionFiveYearsAverageChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100579_pensionFiveYearsAverageChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://insurance.xyp.gov.mn/}pensionFiveYearsAverageChangeRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100579_pensionFiveYearsAverageChange", propOrder = {
    "request"
})
public class WS100579PensionFiveYearsAverageChange {

    protected PensionFiveYearsAverageChangeRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link PensionFiveYearsAverageChangeRequestData }
     *     
     */
    public PensionFiveYearsAverageChangeRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionFiveYearsAverageChangeRequestData }
     *     
     */
    public void setRequest(PensionFiveYearsAverageChangeRequestData value) {
        this.request = value;
    }

}
