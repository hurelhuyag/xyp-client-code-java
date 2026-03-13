
package mn.gov.xyp.insurance;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrgBenNumBy36MonthDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrgBenNumBy36MonthDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bemNumberMN" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="benNumberFN" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="shim" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrgBenNumBy36MonthDetailData", propOrder = {
    "bemNumberMN",
    "benNumberFN",
    "month",
    "shim",
    "year"
})
public class GetOrgBenNumBy36MonthDetailData {

    protected int bemNumberMN;
    protected int benNumberFN;
    protected int month;
    protected Double shim;
    protected int year;

    /**
     * Gets the value of the bemNumberMN property.
     * 
     */
    public int getBemNumberMN() {
        return bemNumberMN;
    }

    /**
     * Sets the value of the bemNumberMN property.
     * 
     */
    public void setBemNumberMN(int value) {
        this.bemNumberMN = value;
    }

    /**
     * Gets the value of the benNumberFN property.
     * 
     */
    public int getBenNumberFN() {
        return benNumberFN;
    }

    /**
     * Sets the value of the benNumberFN property.
     * 
     */
    public void setBenNumberFN(int value) {
        this.benNumberFN = value;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Gets the value of the shim property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShim() {
        return shim;
    }

    /**
     * Sets the value of the shim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShim(Double value) {
        this.shim = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
