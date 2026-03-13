
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getBusDispatcherListRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBusDispatcherListRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://transport.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="directionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="leaveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBusDispatcherListRequestData", propOrder = {
    "directionId",
    "leaveDate"
})
public class GetBusDispatcherListRequestData
    extends ServiceRequest
{

    protected int directionId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar leaveDate;

    /**
     * Gets the value of the directionId property.
     * 
     */
    public int getDirectionId() {
        return directionId;
    }

    /**
     * Sets the value of the directionId property.
     * 
     */
    public void setDirectionId(int value) {
        this.directionId = value;
    }

    /**
     * Gets the value of the leaveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeaveDate() {
        return leaveDate;
    }

    /**
     * Sets the value of the leaveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeaveDate(XMLGregorianCalendar value) {
        this.leaveDate = value;
    }

}
