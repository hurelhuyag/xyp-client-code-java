
package mn.gov.xyp.transport;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payInvoiceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payInvoiceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="listData" type="{http://transport.xyp.gov.mn/}payInvoiceDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payInvoiceData", propOrder = {
    "count",
    "listData",
    "paidAmount"
})
public class PayInvoiceData {

    protected int count;
    @XmlElement(nillable = true)
    protected List<PayInvoiceDetailData> listData;
    protected long paidAmount;

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the listData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayInvoiceDetailData }
     * 
     * 
     */
    public List<PayInvoiceDetailData> getListData() {
        if (listData == null) {
            listData = new ArrayList<PayInvoiceDetailData>();
        }
        return this.listData;
    }

    /**
     * Gets the value of the paidAmount property.
     * 
     */
    public long getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets the value of the paidAmount property.
     * 
     */
    public void setPaidAmount(long value) {
        this.paidAmount = value;
    }

}
