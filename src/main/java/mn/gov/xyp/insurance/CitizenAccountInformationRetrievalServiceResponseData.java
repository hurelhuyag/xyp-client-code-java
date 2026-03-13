
package mn.gov.xyp.insurance;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenAccountInformationRetrievalServiceResponseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenAccountInformationRetrievalServiceResponseData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accumulatedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="c1Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="c2Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="civilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estimatedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="list" type="{http://insurance.xyp.gov.mn/}citizenAccountInformationRetrievalServiceBalanceYearsData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenAccountInformationRetrievalServiceResponseData", propOrder = {
    "accumulatedAmount",
    "additionalAmount",
    "c1Amount",
    "c2Amount",
    "civilId",
    "estimatedAmount",
    "firstname",
    "lastname",
    "list",
    "regnum"
})
public class CitizenAccountInformationRetrievalServiceResponseData {

    protected String accumulatedAmount;
    protected String additionalAmount;
    protected String c1Amount;
    protected String c2Amount;
    protected String civilId;
    protected String estimatedAmount;
    protected String firstname;
    protected String lastname;
    @XmlElement(nillable = true)
    protected List<CitizenAccountInformationRetrievalServiceBalanceYearsData> list;
    protected String regnum;

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
     * Gets the value of the civilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilId() {
        return civilId;
    }

    /**
     * Sets the value of the civilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilId(String value) {
        this.civilId = value;
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
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitizenAccountInformationRetrievalServiceBalanceYearsData }
     * 
     * 
     */
    public List<CitizenAccountInformationRetrievalServiceBalanceYearsData> getList() {
        if (list == null) {
            list = new ArrayList<CitizenAccountInformationRetrievalServiceBalanceYearsData>();
        }
        return this.list;
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
