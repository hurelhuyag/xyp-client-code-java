
package mn.gov.xyp.transport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transportCompanyCreateWorkerRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transportCompanyCreateWorkerRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://transport.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bornDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diplomaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverExpertLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverLicenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="experience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="explosiveWorkPermit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="familyMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="healthCheckUpForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isDriverExpertLicense" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proofOfVehicleAndDriverInsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="register" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surgaltDiplom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="university" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validLicenseForHazardousMaterialsDriver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transportCompanyCreateWorkerRequestData", propOrder = {
    "bornDate",
    "description",
    "diplomaNumber",
    "driverExpertLicenseNumber",
    "driverLicenseNumber",
    "driverLicenseType",
    "email",
    "endDate",
    "expId",
    "experience",
    "explosiveWorkPermit",
    "familyMemberCount",
    "familyName",
    "firstname",
    "genderId",
    "healthCheckUpForm",
    "isDriverExpertLicense",
    "lastname",
    "number",
    "orgRegnum",
    "phone",
    "position",
    "profession",
    "profile",
    "proofOfVehicleAndDriverInsurance",
    "register",
    "startDate",
    "surgaltDiplom",
    "typeId",
    "university",
    "validLicenseForHazardousMaterialsDriver"
})
public class TransportCompanyCreateWorkerRequestData
    extends ServiceRequest
{

    protected String bornDate;
    protected String description;
    protected String diplomaNumber;
    protected String driverExpertLicenseNumber;
    protected String driverLicenseNumber;
    protected String driverLicenseType;
    protected String email;
    protected String endDate;
    protected int expId;
    protected String experience;
    protected String explosiveWorkPermit;
    protected int familyMemberCount;
    protected String familyName;
    protected String firstname;
    protected int genderId;
    protected String healthCheckUpForm;
    protected int isDriverExpertLicense;
    protected String lastname;
    protected String number;
    protected String orgRegnum;
    protected String phone;
    protected String position;
    protected String profession;
    protected String profile;
    protected String proofOfVehicleAndDriverInsurance;
    protected String register;
    protected String startDate;
    protected String surgaltDiplom;
    protected int typeId;
    protected String university;
    protected String validLicenseForHazardousMaterialsDriver;

    /**
     * Gets the value of the bornDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBornDate() {
        return bornDate;
    }

    /**
     * Sets the value of the bornDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBornDate(String value) {
        this.bornDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the diplomaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiplomaNumber() {
        return diplomaNumber;
    }

    /**
     * Sets the value of the diplomaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiplomaNumber(String value) {
        this.diplomaNumber = value;
    }

    /**
     * Gets the value of the driverExpertLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverExpertLicenseNumber() {
        return driverExpertLicenseNumber;
    }

    /**
     * Sets the value of the driverExpertLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverExpertLicenseNumber(String value) {
        this.driverExpertLicenseNumber = value;
    }

    /**
     * Gets the value of the driverLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    /**
     * Sets the value of the driverLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverLicenseNumber(String value) {
        this.driverLicenseNumber = value;
    }

    /**
     * Gets the value of the driverLicenseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverLicenseType() {
        return driverLicenseType;
    }

    /**
     * Sets the value of the driverLicenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverLicenseType(String value) {
        this.driverLicenseType = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the expId property.
     * 
     */
    public int getExpId() {
        return expId;
    }

    /**
     * Sets the value of the expId property.
     * 
     */
    public void setExpId(int value) {
        this.expId = value;
    }

    /**
     * Gets the value of the experience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperience() {
        return experience;
    }

    /**
     * Sets the value of the experience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperience(String value) {
        this.experience = value;
    }

    /**
     * Gets the value of the explosiveWorkPermit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplosiveWorkPermit() {
        return explosiveWorkPermit;
    }

    /**
     * Sets the value of the explosiveWorkPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplosiveWorkPermit(String value) {
        this.explosiveWorkPermit = value;
    }

    /**
     * Gets the value of the familyMemberCount property.
     * 
     */
    public int getFamilyMemberCount() {
        return familyMemberCount;
    }

    /**
     * Sets the value of the familyMemberCount property.
     * 
     */
    public void setFamilyMemberCount(int value) {
        this.familyMemberCount = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
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
     * Gets the value of the genderId property.
     * 
     */
    public int getGenderId() {
        return genderId;
    }

    /**
     * Sets the value of the genderId property.
     * 
     */
    public void setGenderId(int value) {
        this.genderId = value;
    }

    /**
     * Gets the value of the healthCheckUpForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCheckUpForm() {
        return healthCheckUpForm;
    }

    /**
     * Sets the value of the healthCheckUpForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCheckUpForm(String value) {
        this.healthCheckUpForm = value;
    }

    /**
     * Gets the value of the isDriverExpertLicense property.
     * 
     */
    public int getIsDriverExpertLicense() {
        return isDriverExpertLicense;
    }

    /**
     * Sets the value of the isDriverExpertLicense property.
     * 
     */
    public void setIsDriverExpertLicense(int value) {
        this.isDriverExpertLicense = value;
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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the orgRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRegnum() {
        return orgRegnum;
    }

    /**
     * Sets the value of the orgRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgRegnum(String value) {
        this.orgRegnum = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfession() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfession(String value) {
        this.profession = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * Gets the value of the proofOfVehicleAndDriverInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProofOfVehicleAndDriverInsurance() {
        return proofOfVehicleAndDriverInsurance;
    }

    /**
     * Sets the value of the proofOfVehicleAndDriverInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProofOfVehicleAndDriverInsurance(String value) {
        this.proofOfVehicleAndDriverInsurance = value;
    }

    /**
     * Gets the value of the register property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegister(String value) {
        this.register = value;
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

    /**
     * Gets the value of the surgaltDiplom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurgaltDiplom() {
        return surgaltDiplom;
    }

    /**
     * Sets the value of the surgaltDiplom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurgaltDiplom(String value) {
        this.surgaltDiplom = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     */
    public int getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(int value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the university property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversity() {
        return university;
    }

    /**
     * Sets the value of the university property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversity(String value) {
        this.university = value;
    }

    /**
     * Gets the value of the validLicenseForHazardousMaterialsDriver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidLicenseForHazardousMaterialsDriver() {
        return validLicenseForHazardousMaterialsDriver;
    }

    /**
     * Sets the value of the validLicenseForHazardousMaterialsDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidLicenseForHazardousMaterialsDriver(String value) {
        this.validLicenseForHazardousMaterialsDriver = value;
    }

}
