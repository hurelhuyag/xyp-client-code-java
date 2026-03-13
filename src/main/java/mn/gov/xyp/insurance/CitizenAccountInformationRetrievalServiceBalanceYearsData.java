
package mn.gov.xyp.insurance;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenAccountInformationRetrievalServiceBalanceYearsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenAccountInformationRetrievalServiceBalanceYearsData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accumulatedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="c1Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="c2Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estimatedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenAccountInformationRetrievalServiceBalanceYearsData", propOrder = {
    "accumulatedAmount",
    "additionalAmount",
    "c1Amount",
    "c2Amount",
    "estimatedAmount",
    "year"
})
public class CitizenAccountInformationRetrievalServiceBalanceYearsData {

    protected String accumulatedAmount;
    protected String additionalAmount;
    protected String c1Amount;
    protected String c2Amount;
    protected String estimatedAmount;
    protected String year;

    /**
     * Gets the value of the accumulatedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulatedAmount() {
        return accumulatedAmount;
    }

    /**
     * Sets the value of the accumulatedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulatedAmount(String value) {
        this.accumulatedAmount = value;
    }

    /**
     * Gets the value of the additionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * Sets the value of the additionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmount(String value) {
        this.additionalAmount = value;
    }

    /**
     * Gets the value of the c1Amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC1Amount() {
        return c1Amount;
    }

    /**
     * Sets the value of the c1Amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC1Amount(String value) {
        this.c1Amount = value;
    }

    /**
     * Gets the value of the c2Amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC2Amount() {
        return c2Amount;
    }

    /**
     * Sets the value of the c2Amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC2Amount(String value) {
        this.c2Amount = value;
    }

    /**
     * Gets the value of the estimatedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedAmount() {
        return estimatedAmount;
    }

    /**
     * Sets the value of the estimatedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedAmount(String value) {
        this.estimatedAmount = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

}
