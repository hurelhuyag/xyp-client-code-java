
package mn.gov.xyp.transport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ecLicenseCheckerData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ecLicenseCheckerData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ecLicence" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="licenceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecLicenseCheckerData", propOrder = {
    "ecLicence",
    "licenceId",
    "message"
})
public class EcLicenseCheckerData {

    protected boolean ecLicence;
    protected int licenceId;
    protected String message;

    /**
     * Gets the value of the ecLicence property.
     * 
     */
    public boolean isEcLicence() {
        return ecLicence;
    }

    /**
     * Sets the value of the ecLicence property.
     * 
     */
    public void setEcLicence(boolean value) {
        this.ecLicence = value;
    }

    /**
     * Gets the value of the licenceId property.
     * 
     */
    public int getLicenceId() {
        return licenceId;
    }

    /**
     * Sets the value of the licenceId property.
     * 
     */
    public void setLicenceId(int value) {
        this.licenceId = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
