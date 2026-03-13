
package mn.gov.xyp.insurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTotalWorkMonthResponseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTotalWorkMonthResponseData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalWorkMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTotalWorkMonthResponseData", propOrder = {
    "totalWorkMonth"
})
public class GetTotalWorkMonthResponseData {

    protected int totalWorkMonth;

    /**
     * Gets the value of the totalWorkMonth property.
     * 
     */
    public int getTotalWorkMonth() {
        return totalWorkMonth;
    }

    /**
     * Sets the value of the totalWorkMonth property.
     * 
     */
    public void setTotalWorkMonth(int value) {
        this.totalWorkMonth = value;
    }

}
