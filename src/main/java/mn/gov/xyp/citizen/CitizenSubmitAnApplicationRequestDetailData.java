
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenSubmitAnApplicationRequestDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenSubmitAnApplicationRequestDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="civilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventCity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="eventDistrict" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="eventSubDistrict" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="homeAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="homeCity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="homeDistrict" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="homeSubDistrict" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "citizenSubmitAnApplicationRequestDetailData", propOrder = {
    "civilId",
    "content",
    "date",
    "emailAddress",
    "eventAddress",
    "eventCity",
    "eventDistrict",
    "eventSubDistrict",
    "firstname",
    "homeAddress",
    "homeCity",
    "homeDistrict",
    "homeSubDistrict",
    "lastname",
    "phoneNumber",
    "regnum"
})
public class CitizenSubmitAnApplicationRequestDetailData {

    protected String civilId;
    protected String content;
    protected String date;
    protected String emailAddress;
    protected String eventAddress;
    protected int eventCity;
    protected int eventDistrict;
    protected int eventSubDistrict;
    protected String firstname;
    protected String homeAddress;
    protected int homeCity;
    protected int homeDistrict;
    protected int homeSubDistrict;
    protected String lastname;
    protected String phoneNumber;
    protected String regnum;

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
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the eventAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventAddress() {
        return eventAddress;
    }

    /**
     * Sets the value of the eventAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventAddress(String value) {
        this.eventAddress = value;
    }

    /**
     * Gets the value of the eventCity property.
     * 
     */
    public int getEventCity() {
        return eventCity;
    }

    /**
     * Sets the value of the eventCity property.
     * 
     */
    public void setEventCity(int value) {
        this.eventCity = value;
    }

    /**
     * Gets the value of the eventDistrict property.
     * 
     */
    public int getEventDistrict() {
        return eventDistrict;
    }

    /**
     * Sets the value of the eventDistrict property.
     * 
     */
    public void setEventDistrict(int value) {
        this.eventDistrict = value;
    }

    /**
     * Gets the value of the eventSubDistrict property.
     * 
     */
    public int getEventSubDistrict() {
        return eventSubDistrict;
    }

    /**
     * Sets the value of the eventSubDistrict property.
     * 
     */
    public void setEventSubDistrict(int value) {
        this.eventSubDistrict = value;
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
     * Gets the value of the homeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets the value of the homeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeAddress(String value) {
        this.homeAddress = value;
    }

    /**
     * Gets the value of the homeCity property.
     * 
     */
    public int getHomeCity() {
        return homeCity;
    }

    /**
     * Sets the value of the homeCity property.
     * 
     */
    public void setHomeCity(int value) {
        this.homeCity = value;
    }

    /**
     * Gets the value of the homeDistrict property.
     * 
     */
    public int getHomeDistrict() {
        return homeDistrict;
    }

    /**
     * Sets the value of the homeDistrict property.
     * 
     */
    public void setHomeDistrict(int value) {
        this.homeDistrict = value;
    }

    /**
     * Gets the value of the homeSubDistrict property.
     * 
     */
    public int getHomeSubDistrict() {
        return homeSubDistrict;
    }

    /**
     * Sets the value of the homeSubDistrict property.
     * 
     */
    public void setHomeSubDistrict(int value) {
        this.homeSubDistrict = value;
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
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
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
