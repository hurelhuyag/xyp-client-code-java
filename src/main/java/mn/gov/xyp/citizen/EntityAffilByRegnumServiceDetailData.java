
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entityAffilByRegnumServiceDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entityAffilByRegnumServiceDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cprId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cprName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cprNationRegistNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cprType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cprTypeDetailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cprTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerOrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registeredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entityAffilByRegnumServiceDetailData", propOrder = {
    "cprId",
    "cprName",
    "cprNationRegistNumber",
    "cprType",
    "cprTypeDetailName",
    "cprTypeName",
    "registerOrgName",
    "registeredDate",
    "statusName"
})
public class EntityAffilByRegnumServiceDetailData {

    protected String cprId;
    protected String cprName;
    protected String cprNationRegistNumber;
    protected String cprType;
    protected String cprTypeDetailName;
    protected String cprTypeName;
    protected String registerOrgName;
    protected String registeredDate;
    protected String statusName;

    /**
     * Gets the value of the cprId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCprId() {
        return cprId;
    }

    /**
     * Sets the value of the cprId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCprId(String value) {
        this.cprId = value;
    }

    /**
     * Gets the value of the cprName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCprName() {
        return cprName;
    }

    /**
     * Sets the value of the cprName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCprName(String value) {
        this.cprName = value;
    }

    /**
     * Gets the value of the cprNationRegistNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCprNationRegistNumber() {
        return cprNationRegistNumber;
    }

    /**
     * Sets the value of the cprNationRegistNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCprNationRegistNumber(String value) {
        this.cprNationRegistNumber = value;
    }

    /**
     * Gets the value of the cprType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCprType() {
        return cprType;
    }

    /**
     * Sets the value of the cprType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCprType(String value) {
        this.cprType = value;
    }

    /**
     * Gets the value of the cprTypeDetailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCprTypeDetailName() {
        return cprTypeDetailName;
    }

    /**
     * Sets the value of the cprTypeDetailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCprTypeDetailName(String value) {
        this.cprTypeDetailName = value;
    }

    /**
     * Gets the value of the cprTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCprTypeName() {
        return cprTypeName;
    }

    /**
     * Sets the value of the cprTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCprTypeName(String value) {
        this.cprTypeName = value;
    }

    /**
     * Gets the value of the registerOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterOrgName() {
        return registerOrgName;
    }

    /**
     * Sets the value of the registerOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterOrgName(String value) {
        this.registerOrgName = value;
    }

    /**
     * Gets the value of the registeredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Sets the value of the registeredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredDate(String value) {
        this.registeredDate = value;
    }

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

}
