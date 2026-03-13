
package mn.gov.xyp.transport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBusLocationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBusLocationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="c" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="f" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="near" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="s" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="z" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBusLocationData", propOrder = {
    "c",
    "f",
    "lc",
    "near",
    "s",
    "sc",
    "t",
    "x",
    "y",
    "z"
})
public class GetBusLocationData {

    protected int c;
    protected String f;
    protected int lc;
    protected String near;
    protected int s;
    protected int sc;
    protected String t;
    protected double x;
    protected double y;
    protected int z;

    /**
     * Gets the value of the c property.
     * 
     */
    public int getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     */
    public void setC(int value) {
        this.c = value;
    }

    /**
     * Gets the value of the f property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF() {
        return f;
    }

    /**
     * Sets the value of the f property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF(String value) {
        this.f = value;
    }

    /**
     * Gets the value of the lc property.
     * 
     */
    public int getLc() {
        return lc;
    }

    /**
     * Sets the value of the lc property.
     * 
     */
    public void setLc(int value) {
        this.lc = value;
    }

    /**
     * Gets the value of the near property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNear() {
        return near;
    }

    /**
     * Sets the value of the near property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNear(String value) {
        this.near = value;
    }

    /**
     * Gets the value of the s property.
     * 
     */
    public int getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     */
    public void setS(int value) {
        this.s = value;
    }

    /**
     * Gets the value of the sc property.
     * 
     */
    public int getSc() {
        return sc;
    }

    /**
     * Sets the value of the sc property.
     * 
     */
    public void setSc(int value) {
        this.sc = value;
    }

    /**
     * Gets the value of the t property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT() {
        return t;
    }

    /**
     * Sets the value of the t property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT(String value) {
        this.t = value;
    }

    /**
     * Gets the value of the x property.
     * 
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(double value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(double value) {
        this.y = value;
    }

    /**
     * Gets the value of the z property.
     * 
     */
    public int getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     * 
     */
    public void setZ(int value) {
        this.z = value;
    }

}
