
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freightTransportTrainDocDetailPaymentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freightTransportTrainDocDetailPaymentData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freightTransportTrainDocDetailPaymentData", propOrder = {
    "currency",
    "otherFee",
    "payType",
    "payedDate",
    "transportFee"
})
public class FreightTransportTrainDocDetailPaymentData {

    protected String currency;
    protected String otherFee;
    protected String payType;
    protected String payedDate;
    protected String transportFee;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the otherFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherFee() {
        return otherFee;
    }

    /**
     * Sets the value of the otherFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherFee(String value) {
        this.otherFee = value;
    }

    /**
     * Gets the value of the payType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayType() {
        return payType;
    }

    /**
     * Sets the value of the payType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayType(String value) {
        this.payType = value;
    }

    /**
     * Gets the value of the payedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayedDate() {
        return payedDate;
    }

    /**
     * Sets the value of the payedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayedDate(String value) {
        this.payedDate = value;
    }

    /**
     * Gets the value of the transportFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportFee() {
        return transportFee;
    }

    /**
     * Sets the value of the transportFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportFee(String value) {
        this.transportFee = value;
    }

}
