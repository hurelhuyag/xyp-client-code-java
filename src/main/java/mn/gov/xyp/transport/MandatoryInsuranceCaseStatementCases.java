
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mandatoryInsuranceCaseStatementCases complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mandatoryInsuranceCaseStatementCases"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indemnity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="insuranceCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mandatoryInsuranceCaseStatementCases", propOrder = {
    "caseDate",
    "indemnity",
    "insuranceCompany"
})
public class MandatoryInsuranceCaseStatementCases {

    protected String caseDate;
    protected int indemnity;
    protected String insuranceCompany;

    /**
     * Gets the value of the caseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseDate() {
        return caseDate;
    }

    /**
     * Sets the value of the caseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseDate(String value) {
        this.caseDate = value;
    }

    /**
     * Gets the value of the indemnity property.
     * 
     */
    public int getIndemnity() {
        return indemnity;
    }

    /**
     * Sets the value of the indemnity property.
     * 
     */
    public void setIndemnity(int value) {
        this.indemnity = value;
    }

    /**
     * Gets the value of the insuranceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    /**
     * Sets the value of the insuranceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCompany(String value) {
        this.insuranceCompany = value;
    }

}
