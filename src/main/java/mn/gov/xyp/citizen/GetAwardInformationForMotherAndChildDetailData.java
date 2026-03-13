
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAwardInformationForMotherAndChildDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAwardInformationForMotherAndChildDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="c1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="c2" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="c3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="c4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m2" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="m3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAwardInformationForMotherAndChildDetailData", propOrder = {
    "c1",
    "c2",
    "c3",
    "c4",
    "m1",
    "m2",
    "m3",
    "m4"
})
public class GetAwardInformationForMotherAndChildDetailData {

    protected String c1;
    protected long c2;
    protected String c3;
    protected String c4;
    protected String m1;
    protected long m2;
    protected String m3;
    protected String m4;

    /**
     * Gets the value of the c1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC1() {
        return c1;
    }

    /**
     * Sets the value of the c1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC1(String value) {
        this.c1 = value;
    }

    /**
     * Gets the value of the c2 property.
     * 
     */
    public long getC2() {
        return c2;
    }

    /**
     * Sets the value of the c2 property.
     * 
     */
    public void setC2(long value) {
        this.c2 = value;
    }

    /**
     * Gets the value of the c3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC3() {
        return c3;
    }

    /**
     * Sets the value of the c3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC3(String value) {
        this.c3 = value;
    }

    /**
     * Gets the value of the c4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC4() {
        return c4;
    }

    /**
     * Sets the value of the c4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC4(String value) {
        this.c4 = value;
    }

    /**
     * Gets the value of the m1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM1() {
        return m1;
    }

    /**
     * Sets the value of the m1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM1(String value) {
        this.m1 = value;
    }

    /**
     * Gets the value of the m2 property.
     * 
     */
    public long getM2() {
        return m2;
    }

    /**
     * Sets the value of the m2 property.
     * 
     */
    public void setM2(long value) {
        this.m2 = value;
    }

    /**
     * Gets the value of the m3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM3() {
        return m3;
    }

    /**
     * Sets the value of the m3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM3(String value) {
        this.m3 = value;
    }

    /**
     * Gets the value of the m4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM4() {
        return m4;
    }

    /**
     * Sets the value of the m4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM4(String value) {
        this.m4 = value;
    }

}
