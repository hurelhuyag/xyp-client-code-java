
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenNewDiplomaInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenNewDiplomaInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="academicShift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="academicShiftName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="admitAcademicYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="admitTermId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="approvalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conferAcademicYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conferDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conferTermId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="degreeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="educationFieldCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="educationFieldId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="educationFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="educationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="educationLevelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schoolId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="studentDegreeValidation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="studentEducationId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalGma" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalGpa" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenNewDiplomaInfoDetailData", propOrder = {
    "academicShift",
    "academicShiftName",
    "admitAcademicYear",
    "admitTermId",
    "approvalStatus",
    "conferAcademicYear",
    "conferDate",
    "conferTermId",
    "degreeNumber",
    "educationFieldCode",
    "educationFieldId",
    "educationFieldName",
    "educationLevel",
    "educationLevelName",
    "firstName",
    "lastName",
    "orgId",
    "orgName",
    "referenceSource",
    "regnum",
    "schoolId",
    "schoolName",
    "studentDegreeValidation",
    "studentEducationId",
    "totalGma",
    "totalGpa"
})
public class CitizenNewDiplomaInfoDetailData {

    protected String academicShift;
    protected String academicShiftName;
    protected String admitAcademicYear;
    protected int admitTermId;
    protected String approvalStatus;
    protected String conferAcademicYear;
    protected String conferDate;
    protected int conferTermId;
    protected String degreeNumber;
    protected String educationFieldCode;
    protected int educationFieldId;
    protected String educationFieldName;
    protected String educationLevel;
    protected String educationLevelName;
    protected String firstName;
    protected String lastName;
    protected int orgId;
    protected String orgName;
    protected String referenceSource;
    protected String regnum;
    protected int schoolId;
    protected String schoolName;
    protected String studentDegreeValidation;
    protected long studentEducationId;
    protected double totalGma;
    protected double totalGpa;

    /**
     * Gets the value of the academicShift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicShift() {
        return academicShift;
    }

    /**
     * Sets the value of the academicShift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicShift(String value) {
        this.academicShift = value;
    }

    /**
     * Gets the value of the academicShiftName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicShiftName() {
        return academicShiftName;
    }

    /**
     * Sets the value of the academicShiftName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicShiftName(String value) {
        this.academicShiftName = value;
    }

    /**
     * Gets the value of the admitAcademicYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmitAcademicYear() {
        return admitAcademicYear;
    }

    /**
     * Sets the value of the admitAcademicYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmitAcademicYear(String value) {
        this.admitAcademicYear = value;
    }

    /**
     * Gets the value of the admitTermId property.
     * 
     */
    public int getAdmitTermId() {
        return admitTermId;
    }

    /**
     * Sets the value of the admitTermId property.
     * 
     */
    public void setAdmitTermId(int value) {
        this.admitTermId = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalStatus(String value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the conferAcademicYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferAcademicYear() {
        return conferAcademicYear;
    }

    /**
     * Sets the value of the conferAcademicYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferAcademicYear(String value) {
        this.conferAcademicYear = value;
    }

    /**
     * Gets the value of the conferDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferDate() {
        return conferDate;
    }

    /**
     * Sets the value of the conferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferDate(String value) {
        this.conferDate = value;
    }

    /**
     * Gets the value of the conferTermId property.
     * 
     */
    public int getConferTermId() {
        return conferTermId;
    }

    /**
     * Sets the value of the conferTermId property.
     * 
     */
    public void setConferTermId(int value) {
        this.conferTermId = value;
    }

    /**
     * Gets the value of the degreeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegreeNumber() {
        return degreeNumber;
    }

    /**
     * Sets the value of the degreeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegreeNumber(String value) {
        this.degreeNumber = value;
    }

    /**
     * Gets the value of the educationFieldCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationFieldCode() {
        return educationFieldCode;
    }

    /**
     * Sets the value of the educationFieldCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationFieldCode(String value) {
        this.educationFieldCode = value;
    }

    /**
     * Gets the value of the educationFieldId property.
     * 
     */
    public int getEducationFieldId() {
        return educationFieldId;
    }

    /**
     * Sets the value of the educationFieldId property.
     * 
     */
    public void setEducationFieldId(int value) {
        this.educationFieldId = value;
    }

    /**
     * Gets the value of the educationFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationFieldName() {
        return educationFieldName;
    }

    /**
     * Sets the value of the educationFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationFieldName(String value) {
        this.educationFieldName = value;
    }

    /**
     * Gets the value of the educationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * Sets the value of the educationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationLevel(String value) {
        this.educationLevel = value;
    }

    /**
     * Gets the value of the educationLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationLevelName() {
        return educationLevelName;
    }

    /**
     * Sets the value of the educationLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationLevelName(String value) {
        this.educationLevelName = value;
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
     * Gets the value of the orgId property.
     * 
     */
    public int getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     */
    public void setOrgId(int value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the referenceSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceSource() {
        return referenceSource;
    }

    /**
     * Sets the value of the referenceSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceSource(String value) {
        this.referenceSource = value;
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
     * Gets the value of the schoolId property.
     * 
     */
    public int getSchoolId() {
        return schoolId;
    }

    /**
     * Sets the value of the schoolId property.
     * 
     */
    public void setSchoolId(int value) {
        this.schoolId = value;
    }

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName(String value) {
        this.schoolName = value;
    }

    /**
     * Gets the value of the studentDegreeValidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentDegreeValidation() {
        return studentDegreeValidation;
    }

    /**
     * Sets the value of the studentDegreeValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentDegreeValidation(String value) {
        this.studentDegreeValidation = value;
    }

    /**
     * Gets the value of the studentEducationId property.
     * 
     */
    public long getStudentEducationId() {
        return studentEducationId;
    }

    /**
     * Sets the value of the studentEducationId property.
     * 
     */
    public void setStudentEducationId(long value) {
        this.studentEducationId = value;
    }

    /**
     * Gets the value of the totalGma property.
     * 
     */
    public double getTotalGma() {
        return totalGma;
    }

    /**
     * Sets the value of the totalGma property.
     * 
     */
    public void setTotalGma(double value) {
        this.totalGma = value;
    }

    /**
     * Gets the value of the totalGpa property.
     * 
     */
    public double getTotalGpa() {
        return totalGpa;
    }

    /**
     * Sets the value of the totalGpa property.
     * 
     */
    public void setTotalGpa(double value) {
        this.totalGpa = value;
    }

}
