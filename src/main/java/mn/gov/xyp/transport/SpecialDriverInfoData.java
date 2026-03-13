
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for specialDriverInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="specialDriverInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="bloodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classB" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="classC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="classD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="classDanger" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="classE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="classInterPassanger" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="classInterTransport" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="classTourist" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="epdlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eyeColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eyeColorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstnameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="haveLicense" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastnameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="licenseNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pdlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="register" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surnameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specialDriverInfoData", propOrder = {
    "birthdate",
    "bloodType",
    "classB",
    "classC",
    "classD",
    "classDanger",
    "classE",
    "classInterPassanger",
    "classInterTransport",
    "classTourist",
    "countryName",
    "epdlNumber",
    "eyeColor",
    "eyeColorCode",
    "firstname",
    "firstnameEn",
    "gender",
    "haveLicense",
    "id",
    "image",
    "lastname",
    "lastnameEn",
    "licenseNumber",
    "pdlNumber",
    "register",
    "surname",
    "surnameEn"
})
public class SpecialDriverInfoData {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthdate;
    protected String bloodType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar classB;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar classC;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar classD;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar classDanger;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar classE;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar classInterPassanger;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar classInterTransport;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar classTourist;
    protected String countryName;
    protected String epdlNumber;
    protected String eyeColor;
    protected String eyeColorCode;
    protected String firstname;
    protected String firstnameEn;
    protected String gender;
    protected int haveLicense;
    protected int id;
    protected byte[] image;
    protected String lastname;
    protected String lastnameEn;
    protected int licenseNumber;
    protected String pdlNumber;
    protected String register;
    protected String surname;
    protected String surnameEn;

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the bloodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloodType() {
        return bloodType;
    }

    /**
     * Sets the value of the bloodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloodType(String value) {
        this.bloodType = value;
    }

    /**
     * Gets the value of the classB property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClassB() {
        return classB;
    }

    /**
     * Sets the value of the classB property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClassB(XMLGregorianCalendar value) {
        this.classB = value;
    }

    /**
     * Gets the value of the classC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClassC() {
        return classC;
    }

    /**
     * Sets the value of the classC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClassC(XMLGregorianCalendar value) {
        this.classC = value;
    }

    /**
     * Gets the value of the classD property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClassD() {
        return classD;
    }

    /**
     * Sets the value of the classD property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClassD(XMLGregorianCalendar value) {
        this.classD = value;
    }

    /**
     * Gets the value of the classDanger property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClassDanger() {
        return classDanger;
    }

    /**
     * Sets the value of the classDanger property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClassDanger(XMLGregorianCalendar value) {
        this.classDanger = value;
    }

    /**
     * Gets the value of the classE property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClassE() {
        return classE;
    }

    /**
     * Sets the value of the classE property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClassE(XMLGregorianCalendar value) {
        this.classE = value;
    }

    /**
     * Gets the value of the classInterPassanger property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClassInterPassanger() {
        return classInterPassanger;
    }

    /**
     * Sets the value of the classInterPassanger property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClassInterPassanger(XMLGregorianCalendar value) {
        this.classInterPassanger = value;
    }

    /**
     * Gets the value of the classInterTransport property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClassInterTransport() {
        return classInterTransport;
    }

    /**
     * Sets the value of the classInterTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClassInterTransport(XMLGregorianCalendar value) {
        this.classInterTransport = value;
    }

    /**
     * Gets the value of the classTourist property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClassTourist() {
        return classTourist;
    }

    /**
     * Sets the value of the classTourist property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClassTourist(XMLGregorianCalendar value) {
        this.classTourist = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the epdlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpdlNumber() {
        return epdlNumber;
    }

    /**
     * Sets the value of the epdlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpdlNumber(String value) {
        this.epdlNumber = value;
    }

    /**
     * Gets the value of the eyeColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEyeColor() {
        return eyeColor;
    }

    /**
     * Sets the value of the eyeColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEyeColor(String value) {
        this.eyeColor = value;
    }

    /**
     * Gets the value of the eyeColorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEyeColorCode() {
        return eyeColorCode;
    }

    /**
     * Sets the value of the eyeColorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEyeColorCode(String value) {
        this.eyeColorCode = value;
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
     * Gets the value of the firstnameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstnameEn() {
        return firstnameEn;
    }

    /**
     * Sets the value of the firstnameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstnameEn(String value) {
        this.firstnameEn = value;
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
     * Gets the value of the haveLicense property.
     * 
     */
    public int getHaveLicense() {
        return haveLicense;
    }

    /**
     * Sets the value of the haveLicense property.
     * 
     */
    public void setHaveLicense(int value) {
        this.haveLicense = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
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
     * Gets the value of the lastnameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastnameEn() {
        return lastnameEn;
    }

    /**
     * Sets the value of the lastnameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastnameEn(String value) {
        this.lastnameEn = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     */
    public int getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     */
    public void setLicenseNumber(int value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the pdlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdlNumber() {
        return pdlNumber;
    }

    /**
     * Sets the value of the pdlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdlNumber(String value) {
        this.pdlNumber = value;
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
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the surnameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameEn() {
        return surnameEn;
    }

    /**
     * Sets the value of the surnameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameEn(String value) {
        this.surnameEn = value;
    }

}
