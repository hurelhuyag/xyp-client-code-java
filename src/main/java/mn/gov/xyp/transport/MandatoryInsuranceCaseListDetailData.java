
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mandatoryInsuranceCaseListDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mandatoryInsuranceCaseListDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caseLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insurerAmendedValue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="plateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mandatoryInsuranceCaseListDetailData", propOrder = {
    "caseDate",
    "caseLocation",
    "insuranceCompany",
    "insurerAmendedValue",
    "plateNumber",
    "policyNumber",
    "vehicleMark"
})
public class MandatoryInsuranceCaseListDetailData {

    protected String caseDate;
    protected String caseLocation;
    protected String insuranceCompany;
    protected int insurerAmendedValue;
    protected String plateNumber;
    protected String policyNumber;
    protected String vehicleMark;

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
     * Gets the value of the caseLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseLocation() {
        return caseLocation;
    }

    /**
     * Sets the value of the caseLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseLocation(String value) {
        this.caseLocation = value;
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

    /**
     * Gets the value of the insurerAmendedValue property.
     * 
     */
    public int getInsurerAmendedValue() {
        return insurerAmendedValue;
    }

    /**
     * Sets the value of the insurerAmendedValue property.
     * 
     */
    public void setInsurerAmendedValue(int value) {
        this.insurerAmendedValue = value;
    }

    /**
     * Gets the value of the plateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * Sets the value of the plateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateNumber(String value) {
        this.plateNumber = value;
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNumber(String value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the vehicleMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleMark() {
        return vehicleMark;
    }

    /**
     * Sets the value of the vehicleMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleMark(String value) {
        this.vehicleMark = value;
    }

}
