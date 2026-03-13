
package mn.gov.xyp.insurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100582_enterprisesOrgContributionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100582_enterprisesOrgContributionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://insurance.xyp.gov.mn/}enterprisesOrgContributionInfoRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100582_enterprisesOrgContributionInfo", propOrder = {
    "request"
})
public class WS100582EnterprisesOrgContributionInfo {

    protected EnterprisesOrgContributionInfoRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link EnterprisesOrgContributionInfoRequestData }
     *     
     */
    public EnterprisesOrgContributionInfoRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterprisesOrgContributionInfoRequestData }
     *     
     */
    public void setRequest(EnterprisesOrgContributionInfoRequestData value) {
        this.request = value;
    }

}
