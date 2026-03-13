
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAvailableNumberListDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAvailableNumberListDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intervalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isGiven" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isOrder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provinceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="weekend" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableNumberListDetailData", propOrder = {
    "id",
    "intervalName",
    "isGiven",
    "isOrder",
    "name",
    "orderDate",
    "provinceId",
    "weekend"
})
public class GetAvailableNumberListDetailData {

    protected int id;
    protected String intervalName;
    protected int isGiven;
    protected int isOrder;
    protected String name;
    protected String orderDate;
    protected int provinceId;
    protected int weekend;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the intervalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervalName() {
        return intervalName;
    }

    /**
     * Sets the value of the intervalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervalName(String value) {
        this.intervalName = value;
    }

    /**
     * Gets the value of the isGiven property.
     * 
     */
    public int getIsGiven() {
        return isGiven;
    }

    /**
     * Sets the value of the isGiven property.
     * 
     */
    public void setIsGiven(int value) {
        this.isGiven = value;
    }

    /**
     * Gets the value of the isOrder property.
     * 
     */
    public int getIsOrder() {
        return isOrder;
    }

    /**
     * Sets the value of the isOrder property.
     * 
     */
    public void setIsOrder(int value) {
        this.isOrder = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the provinceId property.
     * 
     */
    public int getProvinceId() {
        return provinceId;
    }

    /**
     * Sets the value of the provinceId property.
     * 
     */
    public void setProvinceId(int value) {
        this.provinceId = value;
    }

    /**
     * Gets the value of the weekend property.
     * 
     */
    public int getWeekend() {
        return weekend;
    }

    /**
     * Sets the value of the weekend property.
     * 
     */
    public void setWeekend(int value) {
        this.weekend = value;
    }

}
