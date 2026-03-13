
package mn.gov.xyp.citizen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCitizenBelowSubsistenceLevelInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCitizenBelowSubsistenceLevelInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="list" type="{http://citizen.xyp.gov.mn/}getCitizenBelowSubsistenceLevelInfoDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCitizenBelowSubsistenceLevelInfoData", propOrder = {
    "list"
})
public class GetCitizenBelowSubsistenceLevelInfoData {

    @XmlElement(nillable = true)
    protected List<GetCitizenBelowSubsistenceLevelInfoDetailData> list;

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
     * {@link GetCitizenBelowSubsistenceLevelInfoDetailData }
     * 
     * 
     */
    public List<GetCitizenBelowSubsistenceLevelInfoDetailData> getList() {
        if (list == null) {
            list = new ArrayList<GetCitizenBelowSubsistenceLevelInfoDetailData>();
        }
        return this.list;
    }

}
