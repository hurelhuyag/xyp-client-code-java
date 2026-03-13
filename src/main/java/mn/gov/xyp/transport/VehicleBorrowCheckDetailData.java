
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleBorrowCheckDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleBorrowCheckDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fillingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleBorrowCheckDetailData", propOrder = {
    "fillingCode",
    "orgName",
    "orgRegnum"
})
public class VehicleBorrowCheckDetailData {

    protected String fillingCode;
    protected String orgName;
    protected String orgRegnum;

    /**
     * Gets the value of the fillingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillingCode() {
        return fillingCode;
    }

    /**
     * Sets the value of the fillingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillingCode(String value) {
        this.fillingCode = value;
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

}
