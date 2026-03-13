
package mn.gov.xyp.meta;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkAccessMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkAccessMap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="operationDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputList" type="{http://meta.xyp.gov.mn/}checkAccessOutputParameterData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkAccessMap", propOrder = {
    "hasAccess",
    "operationDetail",
    "operationName",
    "outputList"
})
public class CheckAccessMap {

    protected boolean hasAccess;
    protected String operationDetail;
    protected String operationName;
    @XmlElement(nillable = true)
    protected List<CheckAccessOutputParameterData> outputList;

    /**
     * Gets the value of the hasAccess property.
     * 
     */
    public boolean isHasAccess() {
        return hasAccess;
    }

    /**
     * Sets the value of the hasAccess property.
     * 
     */
    public void setHasAccess(boolean value) {
        this.hasAccess = value;
    }

    /**
     * Gets the value of the operationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationDetail() {
        return operationDetail;
    }

    /**
     * Sets the value of the operationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationDetail(String value) {
        this.operationDetail = value;
    }

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the outputList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckAccessOutputParameterData }
     * 
     * 
     */
    public List<CheckAccessOutputParameterData> getOutputList() {
        if (outputList == null) {
            outputList = new ArrayList<CheckAccessOutputParameterData>();
        }
        return this.outputList;
    }

}
