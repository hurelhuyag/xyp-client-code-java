
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freightTransportTrainDocListDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freightTransportTrainDocListDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bill" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocListBillData" minOccurs="0"/&gt;
 *         &lt;element name="freightForwarder" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocCitizenData" minOccurs="0"/&gt;
 *         &lt;element name="receiver" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocCitizenData" minOccurs="0"/&gt;
 *         &lt;element name="sender" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocCitizenData" minOccurs="0"/&gt;
 *         &lt;element name="stations" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocListStationsData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freightTransportTrainDocListDetailData", propOrder = {
    "bill",
    "freightForwarder",
    "receiver",
    "sender",
    "stations"
})
public class FreightTransportTrainDocListDetailData {

    protected FreightTransportTrainDocListBillData bill;
    protected FreightTransportTrainDocCitizenData freightForwarder;
    protected FreightTransportTrainDocCitizenData receiver;
    protected FreightTransportTrainDocCitizenData sender;
    protected FreightTransportTrainDocListStationsData stations;

    /**
     * Gets the value of the bill property.
     * 
     * @return
     *     possible object is
     *     {@link FreightTransportTrainDocListBillData }
     *     
     */
    public FreightTransportTrainDocListBillData getBill() {
        return bill;
    }

    /**
     * Sets the value of the bill property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightTransportTrainDocListBillData }
     *     
     */
    public void setBill(FreightTransportTrainDocListBillData value) {
        this.bill = value;
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
     *     {@link FreightTransportTrainDocCitizenData }
     *     
     */
    public FreightTransportTrainDocCitizenData getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightTransportTrainDocCitizenData }
     *     
     */
    public void setSender(FreightTransportTrainDocCitizenData value) {
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

}
