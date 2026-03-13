
package mn.gov.xyp.transport;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freightTransportTrainDocDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freightTransportTrainDocDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bill" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocDetailBillData" minOccurs="0"/&gt;
 *         &lt;element name="files" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="freightForwarder" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocCitizenData" minOccurs="0"/&gt;
 *         &lt;element name="freights" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocDetailFreightData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="payment" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocDetailPaymentData" minOccurs="0"/&gt;
 *         &lt;element name="receiver" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocCitizenData" minOccurs="0"/&gt;
 *         &lt;element name="sender" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocDetailSenderData" minOccurs="0"/&gt;
 *         &lt;element name="stations" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocListStationsData" minOccurs="0"/&gt;
 *         &lt;element name="wagons" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocDetailWagonData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freightTransportTrainDocDetailData", propOrder = {
    "bill",
    "files",
    "freightForwarder",
    "freights",
    "payment",
    "receiver",
    "sender",
    "stations",
    "wagons"
})
public class FreightTransportTrainDocDetailData {

    protected FreightTransportTrainDocDetailBillData bill;
    @XmlElement(nillable = true)
    protected List<String> files;
    protected FreightTransportTrainDocCitizenData freightForwarder;
    @XmlElement(nillable = true)
    protected List<FreightTransportTrainDocDetailFreightData> freights;
    protected FreightTransportTrainDocDetailPaymentData payment;
    protected FreightTransportTrainDocCitizenData receiver;
    protected FreightTransportTrainDocDetailSenderData sender;
    protected FreightTransportTrainDocListStationsData stations;
    @XmlElement(nillable = true)
    protected List<FreightTransportTrainDocDetailWagonData> wagons;

    /**
     * Gets the value of the bill property.
     * 
     * @return
     *     possible object is
     *     {@link FreightTransportTrainDocDetailBillData }
     *     
     */
    public FreightTransportTrainDocDetailBillData getBill() {
        return bill;
    }

    /**
     * Sets the value of the bill property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightTransportTrainDocDetailBillData }
     *     
     */
    public void setBill(FreightTransportTrainDocDetailBillData value) {
        this.bill = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the files property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFiles() {
        if (files == null) {
            files = new ArrayList<String>();
        }
        return this.files;
    }

    /**
     * Gets the value of the freightForwarder property.
     * 
     * @return
     *     possible object is
     *     {@link FreightTransportTrainDocCitizenData }
     *     
     */
    public FreightTransportTrainDocCitizenData getFreightForwarder() {
        return freightForwarder;
    }

    /**
     * Sets the value of the freightForwarder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightTransportTrainDocCitizenData }
     *     
     */
    public void setFreightForwarder(FreightTransportTrainDocCitizenData value) {
        this.freightForwarder = value;
    }

    /**
     * Gets the value of the freights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreightTransportTrainDocDetailFreightData }
     * 
     * 
     */
    public List<FreightTransportTrainDocDetailFreightData> getFreights() {
        if (freights == null) {
            freights = new ArrayList<FreightTransportTrainDocDetailFreightData>();
        }
        return this.freights;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link FreightTransportTrainDocDetailPaymentData }
     *     
     */
    public FreightTransportTrainDocDetailPaymentData getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightTransportTrainDocDetailPaymentData }
     *     
     */
    public void setPayment(FreightTransportTrainDocDetailPaymentData value) {
        this.payment = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link FreightTransportTrainDocCitizenData }
     *     
     */
    public FreightTransportTrainDocCitizenData getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightTransportTrainDocCitizenData }
     *     
     */
    public void setReceiver(FreightTransportTrainDocCitizenData value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link FreightTransportTrainDocDetailSenderData }
     *     
     */
    public FreightTransportTrainDocDetailSenderData getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightTransportTrainDocDetailSenderData }
     *     
     */
    public void setSender(FreightTransportTrainDocDetailSenderData value) {
        this.sender = value;
    }

    /**
     * Gets the value of the stations property.
     * 
     * @return
     *     possible object is
     *     {@link FreightTransportTrainDocListStationsData }
     *     
     */
    public FreightTransportTrainDocListStationsData getStations() {
        return stations;
    }

    /**
     * Sets the value of the stations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightTransportTrainDocListStationsData }
     *     
     */
    public void setStations(FreightTransportTrainDocListStationsData value) {
        this.stations = value;
    }

    /**
     * Gets the value of the wagons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wagons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWagons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreightTransportTrainDocDetailWagonData }
     * 
     * 
     */
    public List<FreightTransportTrainDocDetailWagonData> getWagons() {
        if (wagons == null) {
            wagons = new ArrayList<FreightTransportTrainDocDetailWagonData>();
        }
        return this.wagons;
    }

}
