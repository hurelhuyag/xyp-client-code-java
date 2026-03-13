
package mn.gov.xyp.transport;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mandatoryInsuranceCaseStatementData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mandatoryInsuranceCaseStatementData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caseList" type="{http://transport.xyp.gov.mn/}mandatoryInsuranceCaseStatementCases" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="policyList" type="{http://transport.xyp.gov.mn/}mandatoryInsuranceCaseStatementPolicies" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="statusMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mandatoryInsuranceCaseStatementData", propOrder = {
    "caseList",
    "policyList",
    "status",
    "statusCode",
    "statusMsg"
})
public class MandatoryInsuranceCaseStatementData {

    @XmlElement(nillable = true)
    protected List<MandatoryInsuranceCaseStatementCases> caseList;
    @XmlElement(nillable = true)
    protected List<MandatoryInsuranceCaseStatementPolicies> policyList;
    protected boolean status;
    protected int statusCode;
    protected String statusMsg;

    /**
     * Gets the value of the caseList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MandatoryInsuranceCaseStatementCases }
     * 
     * 
     */
    public List<MandatoryInsuranceCaseStatementCases> getCaseList() {
        if (caseList == null) {
            caseList = new ArrayList<MandatoryInsuranceCaseStatementCases>();
        }
        return this.caseList;
    }

    /**
     * Gets the value of the policyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MandatoryInsuranceCaseStatementPolicies }
     * 
     * 
     */
    public List<MandatoryInsuranceCaseStatementPolicies> getPolicyList() {
        if (policyList == null) {
            policyList = new ArrayList<MandatoryInsuranceCaseStatementPolicies>();
        }
        return this.policyList;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     */
    public void setStatusCode(int value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMsg() {
        return statusMsg;
    }

    /**
     * Sets the value of the statusMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMsg(String value) {
        this.statusMsg = value;
    }

}
