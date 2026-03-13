
package mn.gov.xyp.insurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disabledHumanInfoEnglishData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disabledHumanInfoEnglishData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addrSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codiagnosis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diagnosis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diagnosisEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="disease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meetDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="posision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provincename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resolved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disabledHumanInfoEnglishData", propOrder = {
    "actnum",
    "addrSum",
    "address",
    "addressProvince",
    "age",
    "codiagnosis",
    "decease",
    "diagnosis",
    "diagnosisEn",
    "disease",
    "endDate",
    "firstname",
    "gender",
    "jobname",
    "lastname",
    "meetDate",
    "meetType",
    "percentage",
    "period",
    "posision",
    "provincename",
    "reason",
    "regnum",
    "resolved",
    "startDate"
})
public class DisabledHumanInfoEnglishData {

    protected String actnum;
    protected String addrSum;
    protected String address;
    protected String addressProvince;
    protected int age;
    protected String codiagnosis;
    protected String decease;
    protected String diagnosis;
    protected String diagnosisEn;
    protected String disease;
    protected String endDate;
    protected String firstname;
    protected String gender;
    protected String jobname;
    protected String lastname;
    protected String meetDate;
    protected String meetType;
    protected int percentage;
    protected String period;
    protected String posision;
    protected String provincename;
    protected String reason;
    protected String regnum;
    protected String resolved;
    protected String startDate;

    /**
     * Gets the value of the actnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActnum() {
        return actnum;
    }

    /**
     * Sets the value of the actnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActnum(String value) {
        this.actnum = value;
    }

    /**
     * Gets the value of the addrSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrSum() {
        return addrSum;
    }

    /**
     * Sets the value of the addrSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrSum(String value) {
        this.addrSum = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressProvince() {
        return addressProvince;
    }

    /**
     * Sets the value of the addressProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressProvince(String value) {
        this.addressProvince = value;
    }

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the codiagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiagnosis() {
        return codiagnosis;
    }

    /**
     * Sets the value of the codiagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiagnosis(String value) {
        this.codiagnosis = value;
    }

    /**
     * Gets the value of the decease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecease() {
        return decease;
    }

    /**
     * Sets the value of the decease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecease(String value) {
        this.decease = value;
    }

    /**
     * Gets the value of the diagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * Sets the value of the diagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosis(String value) {
        this.diagnosis = value;
    }

    /**
     * Gets the value of the diagnosisEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosisEn() {
        return diagnosisEn;
    }

    /**
     * Sets the value of the diagnosisEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosisEn(String value) {
        this.diagnosisEn = value;
    }

    /**
     * Gets the value of the disease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisease() {
        return disease;
    }

    /**
     * Sets the value of the disease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisease(String value) {
        this.disease = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the jobname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobname() {
        return jobname;
    }

    /**
     * Sets the value of the jobname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobname(String value) {
        this.jobname = value;
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
     * Gets the value of the meetDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetDate() {
        return meetDate;
    }

    /**
     * Sets the value of the meetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetDate(String value) {
        this.meetDate = value;
    }

    /**
     * Gets the value of the meetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetType() {
        return meetType;
    }

    /**
     * Sets the value of the meetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetType(String value) {
        this.meetType = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     */
    public int getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     */
    public void setPercentage(int value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the posision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosision() {
        return posision;
    }

    /**
     * Sets the value of the posision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosision(String value) {
        this.posision = value;
    }

    /**
     * Gets the value of the provincename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincename() {
        return provincename;
    }

    /**
     * Sets the value of the provincename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincename(String value) {
        this.provincename = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
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
     * Gets the value of the resolved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolved() {
        return resolved;
    }

    /**
     * Sets the value of the resolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolved(String value) {
        this.resolved = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

}
