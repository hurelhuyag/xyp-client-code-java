
package mn.gov.xyp.insurance;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMonetizedIncomeInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMonetizedIncomeInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="balanceC1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="balanceC2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="incomeYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="montetizedIncome" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="montetizedIncomeDetail" type="{http://insurance.xyp.gov.mn/}montetizedIncomeDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="preMonetizedIncome" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="preMonetizedIncomeDetail" type="{http://insurance.xyp.gov.mn/}preMonetizedIncomeDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMonetizedIncomeInfoData", propOrder = {
    "adjustment",
    "balanceC1",
    "balanceC2",
    "incomeYear",
    "montetizedIncome",
    "montetizedIncomeDetail",
    "preMonetizedIncome",
    "preMonetizedIncomeDetail",
    "roi"
})
public class GetMonetizedIncomeInfoData {

    protected Double adjustment;
    protected Double balanceC1;
    protected Double balanceC2;
    protected int incomeYear;
    protected Double montetizedIncome;
    @XmlElement(nillable = true)
    protected List<MontetizedIncomeDetail> montetizedIncomeDetail;
    protected Double preMonetizedIncome;
    @XmlElement(nillable = true)
    protected List<PreMonetizedIncomeDetail> preMonetizedIncomeDetail;
    protected Double roi;

    /**
     * Gets the value of the adjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustment() {
        return adjustment;
    }

    /**
     * Sets the value of the adjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustment(Double value) {
        this.adjustment = value;
    }

    /**
     * Gets the value of the balanceC1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceC1() {
        return balanceC1;
    }

    /**
     * Sets the value of the balanceC1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceC1(Double value) {
        this.balanceC1 = value;
    }

    /**
     * Gets the value of the balanceC2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceC2() {
        return balanceC2;
    }

    /**
     * Sets the value of the balanceC2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceC2(Double value) {
        this.balanceC2 = value;
    }

    /**
     * Gets the value of the incomeYear property.
     * 
     */
    public int getIncomeYear() {
        return incomeYear;
    }

    /**
     * Sets the value of the incomeYear property.
     * 
     */
    public void setIncomeYear(int value) {
        this.incomeYear = value;
    }

    /**
     * Gets the value of the montetizedIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontetizedIncome() {
        return montetizedIncome;
    }

    /**
     * Sets the value of the montetizedIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontetizedIncome(Double value) {
        this.montetizedIncome = value;
    }

    /**
     * Gets the value of the montetizedIncomeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the montetizedIncomeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMontetizedIncomeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MontetizedIncomeDetail }
     * 
     * 
     */
    public List<MontetizedIncomeDetail> getMontetizedIncomeDetail() {
        if (montetizedIncomeDetail == null) {
            montetizedIncomeDetail = new ArrayList<MontetizedIncomeDetail>();
        }
        return this.montetizedIncomeDetail;
    }

    /**
     * Gets the value of the preMonetizedIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreMonetizedIncome() {
        return preMonetizedIncome;
    }

    /**
     * Sets the value of the preMonetizedIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreMonetizedIncome(Double value) {
        this.preMonetizedIncome = value;
    }

    /**
     * Gets the value of the preMonetizedIncomeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preMonetizedIncomeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreMonetizedIncomeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreMonetizedIncomeDetail }
     * 
     * 
     */
    public List<PreMonetizedIncomeDetail> getPreMonetizedIncomeDetail() {
        if (preMonetizedIncomeDetail == null) {
            preMonetizedIncomeDetail = new ArrayList<PreMonetizedIncomeDetail>();
        }
        return this.preMonetizedIncomeDetail;
    }

    /**
     * Gets the value of the roi property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRoi() {
        return roi;
    }

    /**
     * Sets the value of the roi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRoi(Double value) {
        this.roi = value;
    }

}
