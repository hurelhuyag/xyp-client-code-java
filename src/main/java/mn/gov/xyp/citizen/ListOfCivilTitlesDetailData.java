
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfCivilTitlesDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfCivilTitlesDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="completedDateUtc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="degreeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="degreeTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sportId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sportTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statementNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="statusDateUtc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submittedDateUtc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfCivilTitlesDetailData", propOrder = {
    "completedDateUtc",
    "degreeId",
    "degreeTitle",
    "firstName",
    "lastName",
    "regnum",
    "sportId",
    "sportTitle",
    "statementNumber",
    "status",
    "statusDateUtc",
    "submittedDateUtc",
    "uniqueId"
})
public class ListOfCivilTitlesDetailData {

    protected String completedDateUtc;
    protected int degreeId;
    protected String degreeTitle;
    protected String firstName;
    protected String lastName;
    protected String regnum;
    protected int sportId;
    protected String sportTitle;
    protected String statementNumber;
    protected int status;
    protected String statusDateUtc;
    protected String submittedDateUtc;
    protected String uniqueId;

    /**
     * Gets the value of the completedDateUtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletedDateUtc() {
        return completedDateUtc;
    }

    /**
     * Sets the value of the completedDateUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletedDateUtc(String value) {
        this.completedDateUtc = value;
    }

    /**
     * Gets the value of the degreeId property.
     * 
     */
    public int getDegreeId() {
        return degreeId;
    }

    /**
     * Sets the value of the degreeId property.
     * 
     */
    public void setDegreeId(int value) {
        this.degreeId = value;
    }

    /**
     * Gets the value of the degreeTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegreeTitle() {
        return degreeTitle;
    }

    /**
     * Sets the value of the degreeTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegreeTitle(String value) {
        this.degreeTitle = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
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

    /**
     * Gets the value of the sportId property.
     * 
     */
    public int getSportId() {
        return sportId;
    }

    /**
     * Sets the value of the sportId property.
     * 
     */
    public void setSportId(int value) {
        this.sportId = value;
    }

    /**
     * Gets the value of the sportTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSportTitle() {
        return sportTitle;
    }

    /**
     * Sets the value of the sportTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSportTitle(String value) {
        this.sportTitle = value;
    }

    /**
     * Gets the value of the statementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementNumber() {
        return statementNumber;
    }

    /**
     * Sets the value of the statementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementNumber(String value) {
        this.statementNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDateUtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDateUtc() {
        return statusDateUtc;
    }

    /**
     * Sets the value of the statusDateUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDateUtc(String value) {
        this.statusDateUtc = value;
    }

    /**
     * Gets the value of the submittedDateUtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittedDateUtc() {
        return submittedDateUtc;
    }

    /**
     * Sets the value of the submittedDateUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedDateUtc(String value) {
        this.submittedDateUtc = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

}
