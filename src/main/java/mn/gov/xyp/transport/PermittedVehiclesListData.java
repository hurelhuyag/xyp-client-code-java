
package mn.gov.xyp.transport;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permittedVehiclesListData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="permittedVehiclesListData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listData" type="{http://transport.xyp.gov.mn/}permittedVehiclesListDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pages" type="{http://transport.xyp.gov.mn/}permittedVehicleListPagesData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "permittedVehiclesListData", propOrder = {
    "listData",
    "pages"
})
public class PermittedVehiclesListData {

    @XmlElement(nillable = true)
    protected List<PermittedVehiclesListDetailData> listData;
    @XmlElement(nillable = true)
    protected List<PermittedVehicleListPagesData> pages;

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
     * {@link PermittedVehiclesListDetailData }
     * 
     * 
     */
    public List<PermittedVehiclesListDetailData> getListData() {
        if (listData == null) {
            listData = new ArrayList<PermittedVehiclesListDetailData>();
        }
        return this.listData;
    }

    /**
     * Gets the value of the pages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermittedVehicleListPagesData }
     * 
     * 
     */
    public List<PermittedVehicleListPagesData> getPages() {
        if (pages == null) {
            pages = new ArrayList<PermittedVehicleListPagesData>();
        }
        return this.pages;
    }

}
