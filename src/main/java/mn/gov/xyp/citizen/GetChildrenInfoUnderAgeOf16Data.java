
package mn.gov.xyp.citizen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getChildrenInfoUnderAgeOf16Data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getChildrenInfoUnderAgeOf16Data"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="list" type="{http://citizen.xyp.gov.mn/}getChildrenInfoUnderAgeOf16DetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChildrenInfoUnderAgeOf16Data", propOrder = {
    "list"
})
public class GetChildrenInfoUnderAgeOf16Data {

    @XmlElement(nillable = true)
    protected List<GetChildrenInfoUnderAgeOf16DetailData> list;

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetChildrenInfoUnderAgeOf16DetailData }
     * 
     * 
     */
    public List<GetChildrenInfoUnderAgeOf16DetailData> getList() {
        if (list == null) {
            list = new ArrayList<GetChildrenInfoUnderAgeOf16DetailData>();
        }
        return this.list;
    }

}
