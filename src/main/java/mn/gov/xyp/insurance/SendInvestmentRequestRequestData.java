
package mn.gov.xyp.insurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendInvestmentRequestRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendInvestmentRequestRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://insurance.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="appYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="monetizeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendInvestmentRequestRequestData", propOrder = {
    "amount",
    "appYear",
    "monetizeType",
    "regnum"
})
public class SendInvestmentRequestRequestData
    extends ServiceRequest
{

    protected double amount;
    protected int appYear;
    protected String monetizeType;
    protected String regnum;

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the appYear property.
     * 
     */
    public int getAppYear() {
        return appYear;
    }

    /**
     * Sets the value of the appYear property.
     * 
     */
    public void setAppYear(int value) {
        this.appYear = value;
    }

    /**
     * Gets the value of the monetizeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonetizeType() {
        return monetizeType;
    }

    /**
     * Sets the value of the monetizeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonetizeType(String value) {
        this.monetizeType = value;
    }

    /**
     * Gets the value of the regnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnum(String value) {
        this.regnum = value;
    }

}
