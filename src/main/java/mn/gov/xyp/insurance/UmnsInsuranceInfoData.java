
package mn.gov.xyp.insurance;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for umnsInsuranceInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="umnsInsuranceInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pensionList" type="{http://insurance.xyp.gov.mn/}umnsPensionDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="salaryList" type="{http://insurance.xyp.gov.mn/}umnsSalaryDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "umnsInsuranceInfoData", propOrder = {
    "pensionList",
    "salaryList"
})
public class UmnsInsuranceInfoData {

    @XmlElement(nillable = true)
    protected List<UmnsPensionDetail> pensionList;
    @XmlElement(nillable = true)
    protected List<UmnsSalaryDetail> salaryList;

    /**
     * Gets the value of the pensionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pensionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPensionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UmnsPensionDetail }
     * 
     * 
     */
    public List<UmnsPensionDetail> getPensionList() {
        if (pensionList == null) {
            pensionList = new ArrayList<UmnsPensionDetail>();
        }
        return this.pensionList;
    }

    /**
     * Gets the value of the salaryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salaryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalaryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UmnsSalaryDetail }
     * 
     * 
     */
    public List<UmnsSalaryDetail> getSalaryList() {
        if (salaryList == null) {
            salaryList = new ArrayList<UmnsSalaryDetail>();
        }
        return this.salaryList;
    }

}
