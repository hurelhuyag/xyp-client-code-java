
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100461_MandatoryInsuranceCaseStatementList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100461_MandatoryInsuranceCaseStatementList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://transport.xyp.gov.mn/}mandatoryInsuranceCaseListRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100461_MandatoryInsuranceCaseStatementList", propOrder = {
    "request"
})
public class WS100461MandatoryInsuranceCaseStatementList {

    protected MandatoryInsuranceCaseListRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryInsuranceCaseListRequestData }
     *     
     */
    public MandatoryInsuranceCaseListRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryInsuranceCaseListRequestData }
     *     
     */
    public void setRequest(MandatoryInsuranceCaseListRequestData value) {
        this.request = value;
    }

}
