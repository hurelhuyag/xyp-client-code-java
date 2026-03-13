
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freightTransportTrainDocListStationsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freightTransportTrainDocListStationsData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fromStation" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocListDirectionData" minOccurs="0"/&gt;
 *         &lt;element name="toStation" type="{http://transport.xyp.gov.mn/}freightTransportTrainDocListDirectionData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freightTransportTrainDocListStationsData", propOrder = {
    "distance",
    "fromStation",
    "toStation"
})
public class FreightTransportTrainDocListStationsData {

    protected int distance;
    protected FreightTransportTrainDocListDirectionData fromStation;
    protected FreightTransportTrainDocListDirectionData toStation;

    /**
     * Gets the value of the distance property.
     * 
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     */
    public void setDistance(int value) {
        this.distance = value;
    }

    /**
     * Gets the value of the fromStation property.
     * 
     * @return
     *     possible object is
     *     {@link FreightTransportTrainDocListDirectionData }
     *     
     */
    public FreightTransportTrainDocListDirectionData getFromStation() {
        return fromStation;
    }

    /**
     * Sets the value of the fromStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightTransportTrainDocListDirectionData }
     *     
     */
    public void setFromStation(FreightTransportTrainDocListDirectionData value) {
        this.fromStation = value;
    }

    /**
     * Gets the value of the toStation property.
     * 
     * @return
     *     possible object is
     *     {@link FreightTransportTrainDocListDirectionData }
     *     
     */
    public FreightTransportTrainDocListDirectionData getToStation() {
        return toStation;
    }

    /**
     * Sets the value of the toStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightTransportTrainDocListDirectionData }
     *     
     */
    public void setToStation(FreightTransportTrainDocListDirectionData value) {
        this.toStation = value;
    }

}
