
package mn.gov.xyp.citizen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for civilInfoAtBurtgelmnData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="civilInfoAtBurtgelmnData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WS100103" type="{http://citizen.xyp.gov.mn/}civilInfoAtBurtgelmnDetailDataWS100103" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WS100104" type="{http://citizen.xyp.gov.mn/}civilInfoAtBurtgelmnDetailDataWS100104" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WS100105" type="{http://citizen.xyp.gov.mn/}civilInfoAtBurtgelmnDetailDataWS100105" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WS100201" type="{http://citizen.xyp.gov.mn/}civilInfoAtBurtgelmnDetailDataWS100201" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WS100202" type="{http://citizen.xyp.gov.mn/}civilInfoAtBurtgelmnDetailDataWS100202" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WS100313" type="{http://citizen.xyp.gov.mn/}civilInfoAtBurtgelmnDetailDataWS100313" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WS100314" type="{http://citizen.xyp.gov.mn/}civilInfoAtBurtgelmnDetailDataWS100314" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "civilInfoAtBurtgelmnData", propOrder = {
    "ws100103",
    "ws100104",
    "ws100105",
    "ws100201",
    "ws100202",
    "ws100313",
    "ws100314"
})
public class CivilInfoAtBurtgelmnData {

    @XmlElement(name = "WS100103", nillable = true)
    protected List<CivilInfoAtBurtgelmnDetailDataWS100103> ws100103;
    @XmlElement(name = "WS100104", nillable = true)
    protected List<CivilInfoAtBurtgelmnDetailDataWS100104> ws100104;
    @XmlElement(name = "WS100105", nillable = true)
    protected List<CivilInfoAtBurtgelmnDetailDataWS100105> ws100105;
    @XmlElement(name = "WS100201", nillable = true)
    protected List<CivilInfoAtBurtgelmnDetailDataWS100201> ws100201;
    @XmlElement(name = "WS100202", nillable = true)
    protected List<CivilInfoAtBurtgelmnDetailDataWS100202> ws100202;
    @XmlElement(name = "WS100313", nillable = true)
    protected List<CivilInfoAtBurtgelmnDetailDataWS100313> ws100313;
    @XmlElement(name = "WS100314", nillable = true)
    protected List<CivilInfoAtBurtgelmnDetailDataWS100314> ws100314;

    /**
     * Gets the value of the ws100103 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ws100103 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWS100103().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CivilInfoAtBurtgelmnDetailDataWS100103 }
     * 
     * 
     */
    public List<CivilInfoAtBurtgelmnDetailDataWS100103> getWS100103() {
        if (ws100103 == null) {
            ws100103 = new ArrayList<CivilInfoAtBurtgelmnDetailDataWS100103>();
        }
        return this.ws100103;
    }

    /**
     * Gets the value of the ws100104 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ws100104 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWS100104().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CivilInfoAtBurtgelmnDetailDataWS100104 }
     * 
     * 
     */
    public List<CivilInfoAtBurtgelmnDetailDataWS100104> getWS100104() {
        if (ws100104 == null) {
            ws100104 = new ArrayList<CivilInfoAtBurtgelmnDetailDataWS100104>();
        }
        return this.ws100104;
    }

    /**
     * Gets the value of the ws100105 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ws100105 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWS100105().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CivilInfoAtBurtgelmnDetailDataWS100105 }
     * 
     * 
     */
    public List<CivilInfoAtBurtgelmnDetailDataWS100105> getWS100105() {
        if (ws100105 == null) {
            ws100105 = new ArrayList<CivilInfoAtBurtgelmnDetailDataWS100105>();
        }
        return this.ws100105;
    }

    /**
     * Gets the value of the ws100201 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ws100201 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWS100201().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CivilInfoAtBurtgelmnDetailDataWS100201 }
     * 
     * 
     */
    public List<CivilInfoAtBurtgelmnDetailDataWS100201> getWS100201() {
        if (ws100201 == null) {
            ws100201 = new ArrayList<CivilInfoAtBurtgelmnDetailDataWS100201>();
        }
        return this.ws100201;
    }

    /**
     * Gets the value of the ws100202 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ws100202 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWS100202().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CivilInfoAtBurtgelmnDetailDataWS100202 }
     * 
     * 
     */
    public List<CivilInfoAtBurtgelmnDetailDataWS100202> getWS100202() {
        if (ws100202 == null) {
            ws100202 = new ArrayList<CivilInfoAtBurtgelmnDetailDataWS100202>();
        }
        return this.ws100202;
    }

    /**
     * Gets the value of the ws100313 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ws100313 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWS100313().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CivilInfoAtBurtgelmnDetailDataWS100313 }
     * 
     * 
     */
    public List<CivilInfoAtBurtgelmnDetailDataWS100313> getWS100313() {
        if (ws100313 == null) {
            ws100313 = new ArrayList<CivilInfoAtBurtgelmnDetailDataWS100313>();
        }
        return this.ws100313;
    }

    /**
     * Gets the value of the ws100314 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ws100314 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWS100314().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CivilInfoAtBurtgelmnDetailDataWS100314 }
     * 
     * 
     */
    public List<CivilInfoAtBurtgelmnDetailDataWS100314> getWS100314() {
        if (ws100314 == null) {
            ws100314 = new ArrayList<CivilInfoAtBurtgelmnDetailDataWS100314>();
        }
        return this.ws100314;
    }

}
