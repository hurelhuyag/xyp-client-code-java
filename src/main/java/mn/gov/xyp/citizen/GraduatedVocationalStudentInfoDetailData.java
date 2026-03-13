
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for graduatedVocationalStudentInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="graduatedVocationalStudentInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="diplomaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="graduateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="graduateLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="graduationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="professionIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="professionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="professionNameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schoolNameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graduatedVocationalStudentInfoDetailData", propOrder = {
    "diplomaNumber",
    "graduateDate",
    "graduateLevel",
    "graduationNumber",
    "lastName",
    "name",
    "professionIndex",
    "professionName",
    "professionNameEng",
    "regnum",
    "schoolName",
    "schoolNameEng",
    "source"
})
public class GraduatedVocationalStudentInfoDetailData {

    protected String diplomaNumber;
    protected String graduateDate;
    protected String graduateLevel;
    protected String graduationNumber;
    protected String lastName;
    protected String name;
    protected String professionIndex;
    protected String professionName;
    protected String professionNameEng;
    protected String regnum;
    protected String schoolName;
    protected String schoolNameEng;
    protected String source;

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
     * Gets the value of the graduateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduateDate() {
        return graduateDate;
    }

    /**
     * Sets the value of the graduateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduateDate(String value) {
        this.graduateDate = value;
    }

    /**
     * Gets the value of the graduateLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduateLevel() {
        return graduateLevel;
    }

    /**
     * Sets the value of the graduateLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduateLevel(String value) {
        this.graduateLevel = value;
    }

    /**
     * Gets the value of the graduationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduationNumber() {
        return graduationNumber;
    }

    /**
     * Sets the value of the graduationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduationNumber(String value) {
        this.graduationNumber = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the professionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionIndex() {
        return professionIndex;
    }

    /**
     * Sets the value of the professionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionIndex(String value) {
        this.professionIndex = value;
    }

    /**
     * Gets the value of the professionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionName() {
        return professionName;
    }

    /**
     * Sets the value of the professionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionName(String value) {
        this.professionName = value;
    }

    /**
     * Gets the value of the professionNameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionNameEng() {
        return professionNameEng;
    }

    /**
     * Sets the value of the professionNameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionNameEng(String value) {
        this.professionNameEng = value;
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
     * Gets the value of the schoolNameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolNameEng() {
        return schoolNameEng;
    }

    /**
     * Sets the value of the schoolNameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolNameEng(String value) {
        this.schoolNameEng = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
