
package mn.gov.xyp.citizen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenshipRenunciationRecordDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenshipRenunciationRecordDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="denationalizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hariyatBolohUls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="journalNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="odoogiinForename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="odoogiinGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="odoogiinHariyalal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="odoogiinRegisterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="odoogiinSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ordinanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ordinanceNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registryUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wfmStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenshipRenunciationRecordDetailData", propOrder = {
    "birthDate",
    "confirmedDate",
    "denationalizationName",
    "forename",
    "givenName",
    "hariyatBolohUls",
    "journalNum",
    "odoogiinForename",
    "odoogiinGivenName",
    "odoogiinHariyalal",
    "odoogiinRegisterNum",
    "odoogiinSurname",
    "ordinanceDate",
    "ordinanceNum",
    "regDate",
    "registryUnitName",
    "regnum",
    "sexName",
    "surname",
    "wfmStatusName"
})
public class CitizenshipRenunciationRecordDetailData {

    protected String birthDate;
    protected String confirmedDate;
    protected String denationalizationName;
    protected String forename;
    protected String givenName;
    protected String hariyatBolohUls;
    protected String journalNum;
    protected String odoogiinForename;
    protected String odoogiinGivenName;
    protected String odoogiinHariyalal;
    protected String odoogiinRegisterNum;
    protected String odoogiinSurname;
    protected String ordinanceDate;
    protected String ordinanceNum;
    protected String regDate;
    protected String registryUnitName;
    protected String regnum;
    protected String sexName;
    protected String surname;
    protected String wfmStatusName;

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the confirmedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmedDate() {
        return confirmedDate;
    }

    /**
     * Sets the value of the confirmedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmedDate(String value) {
        this.confirmedDate = value;
    }

    /**
     * Gets the value of the denationalizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenationalizationName() {
        return denationalizationName;
    }

    /**
     * Sets the value of the denationalizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenationalizationName(String value) {
        this.denationalizationName = value;
    }

    /**
     * Gets the value of the forename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForename() {
        return forename;
    }

    /**
     * Sets the value of the forename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForename(String value) {
        this.forename = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the hariyatBolohUls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHariyatBolohUls() {
        return hariyatBolohUls;
    }

    /**
     * Sets the value of the hariyatBolohUls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHariyatBolohUls(String value) {
        this.hariyatBolohUls = value;
    }

    /**
     * Gets the value of the journalNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalNum() {
        return journalNum;
    }

    /**
     * Sets the value of the journalNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalNum(String value) {
        this.journalNum = value;
    }

    /**
     * Gets the value of the odoogiinForename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdoogiinForename() {
        return odoogiinForename;
    }

    /**
     * Sets the value of the odoogiinForename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdoogiinForename(String value) {
        this.odoogiinForename = value;
    }

    /**
     * Gets the value of the odoogiinGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdoogiinGivenName() {
        return odoogiinGivenName;
    }

    /**
     * Sets the value of the odoogiinGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdoogiinGivenName(String value) {
        this.odoogiinGivenName = value;
    }

    /**
     * Gets the value of the odoogiinHariyalal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdoogiinHariyalal() {
        return odoogiinHariyalal;
    }

    /**
     * Sets the value of the odoogiinHariyalal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdoogiinHariyalal(String value) {
        this.odoogiinHariyalal = value;
    }

    /**
     * Gets the value of the odoogiinRegisterNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdoogiinRegisterNum() {
        return odoogiinRegisterNum;
    }

    /**
     * Sets the value of the odoogiinRegisterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdoogiinRegisterNum(String value) {
        this.odoogiinRegisterNum = value;
    }

    /**
     * Gets the value of the odoogiinSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdoogiinSurname() {
        return odoogiinSurname;
    }

    /**
     * Sets the value of the odoogiinSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdoogiinSurname(String value) {
        this.odoogiinSurname = value;
    }

    /**
     * Gets the value of the ordinanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdinanceDate() {
        return ordinanceDate;
    }

    /**
     * Sets the value of the ordinanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdinanceDate(String value) {
        this.ordinanceDate = value;
    }

    /**
     * Gets the value of the ordinanceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdinanceNum() {
        return ordinanceNum;
    }

    /**
     * Sets the value of the ordinanceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdinanceNum(String value) {
        this.ordinanceNum = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDate(String value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the registryUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryUnitName() {
        return registryUnitName;
    }

    /**
     * Sets the value of the registryUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryUnitName(String value) {
        this.registryUnitName = value;
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
     * Gets the value of the sexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexName() {
        return sexName;
    }

    /**
     * Sets the value of the sexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexName(String value) {
        this.sexName = value;
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
     * Gets the value of the wfmStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWfmStatusName() {
        return wfmStatusName;
    }

    /**
     * Sets the value of the wfmStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWfmStatusName(String value) {
        this.wfmStatusName = value;
    }

}
