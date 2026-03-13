
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conformityCertificateListProductList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conformityCertificateListProductList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="barCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="drying" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packageTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packageTypeNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plGrossWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plNetWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plQuantityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plQuantityTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plQuantityTypeNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plWeightType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plWeightTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plWeightTypeNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referLaboratoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referLaboratoryNameCh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referLaboratoryNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referLaboratoryNameMn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referLaboratoryNameRu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referServiceTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="testDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="testNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conformityCertificateListProductList", propOrder = {
    "barCode",
    "code",
    "drying",
    "hsCode",
    "id",
    "packageName",
    "packageType",
    "packageTypeName",
    "packageTypeNameEn",
    "plGrossWeight",
    "plNetWeight",
    "plQuantity",
    "plQuantityType",
    "plQuantityTypeName",
    "plQuantityTypeNameEn",
    "plWeightType",
    "plWeightTypeName",
    "plWeightTypeNameEn",
    "productName",
    "referLaboratoryId",
    "referLaboratoryNameCh",
    "referLaboratoryNameEn",
    "referLaboratoryNameMn",
    "referLaboratoryNameRu",
    "referServiceType",
    "referServiceTypeName",
    "standardCode",
    "testDate",
    "testNumber",
    "cDate"
})
public class ConformityCertificateListProductList {

    protected String barCode;
    protected String code;
    protected String drying;
    protected String hsCode;
    protected String id;
    protected String packageName;
    protected String packageType;
    protected String packageTypeName;
    protected String packageTypeNameEn;
    protected String plGrossWeight;
    protected String plNetWeight;
    protected String plQuantity;
    protected String plQuantityType;
    protected String plQuantityTypeName;
    protected String plQuantityTypeNameEn;
    protected String plWeightType;
    protected String plWeightTypeName;
    protected String plWeightTypeNameEn;
    protected String productName;
    protected String referLaboratoryId;
    protected String referLaboratoryNameCh;
    protected String referLaboratoryNameEn;
    protected String referLaboratoryNameMn;
    protected String referLaboratoryNameRu;
    protected String referServiceType;
    protected String referServiceTypeName;
    protected String standardCode;
    protected String testDate;
    protected String testNumber;
    protected String cDate;

    /**
     * Gets the value of the barCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * Sets the value of the barCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the drying property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrying() {
        return drying;
    }

    /**
     * Sets the value of the drying property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrying(String value) {
        this.drying = value;
    }

    /**
     * Gets the value of the hsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsCode() {
        return hsCode;
    }

    /**
     * Sets the value of the hsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsCode(String value) {
        this.hsCode = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the packageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Sets the value of the packageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageName(String value) {
        this.packageName = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageType(String value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the packageTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTypeName() {
        return packageTypeName;
    }

    /**
     * Sets the value of the packageTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTypeName(String value) {
        this.packageTypeName = value;
    }

    /**
     * Gets the value of the packageTypeNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTypeNameEn() {
        return packageTypeNameEn;
    }

    /**
     * Sets the value of the packageTypeNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTypeNameEn(String value) {
        this.packageTypeNameEn = value;
    }

    /**
     * Gets the value of the plGrossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlGrossWeight() {
        return plGrossWeight;
    }

    /**
     * Sets the value of the plGrossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlGrossWeight(String value) {
        this.plGrossWeight = value;
    }

    /**
     * Gets the value of the plNetWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlNetWeight() {
        return plNetWeight;
    }

    /**
     * Sets the value of the plNetWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlNetWeight(String value) {
        this.plNetWeight = value;
    }

    /**
     * Gets the value of the plQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlQuantity() {
        return plQuantity;
    }

    /**
     * Sets the value of the plQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlQuantity(String value) {
        this.plQuantity = value;
    }

    /**
     * Gets the value of the plQuantityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlQuantityType() {
        return plQuantityType;
    }

    /**
     * Sets the value of the plQuantityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlQuantityType(String value) {
        this.plQuantityType = value;
    }

    /**
     * Gets the value of the plQuantityTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlQuantityTypeName() {
        return plQuantityTypeName;
    }

    /**
     * Sets the value of the plQuantityTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlQuantityTypeName(String value) {
        this.plQuantityTypeName = value;
    }

    /**
     * Gets the value of the plQuantityTypeNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlQuantityTypeNameEn() {
        return plQuantityTypeNameEn;
    }

    /**
     * Sets the value of the plQuantityTypeNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlQuantityTypeNameEn(String value) {
        this.plQuantityTypeNameEn = value;
    }

    /**
     * Gets the value of the plWeightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlWeightType() {
        return plWeightType;
    }

    /**
     * Sets the value of the plWeightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlWeightType(String value) {
        this.plWeightType = value;
    }

    /**
     * Gets the value of the plWeightTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlWeightTypeName() {
        return plWeightTypeName;
    }

    /**
     * Sets the value of the plWeightTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlWeightTypeName(String value) {
        this.plWeightTypeName = value;
    }

    /**
     * Gets the value of the plWeightTypeNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlWeightTypeNameEn() {
        return plWeightTypeNameEn;
    }

    /**
     * Sets the value of the plWeightTypeNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlWeightTypeNameEn(String value) {
        this.plWeightTypeNameEn = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the referLaboratoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferLaboratoryId() {
        return referLaboratoryId;
    }

    /**
     * Sets the value of the referLaboratoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferLaboratoryId(String value) {
        this.referLaboratoryId = value;
    }

    /**
     * Gets the value of the referLaboratoryNameCh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferLaboratoryNameCh() {
        return referLaboratoryNameCh;
    }

    /**
     * Sets the value of the referLaboratoryNameCh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferLaboratoryNameCh(String value) {
        this.referLaboratoryNameCh = value;
    }

    /**
     * Gets the value of the referLaboratoryNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferLaboratoryNameEn() {
        return referLaboratoryNameEn;
    }

    /**
     * Sets the value of the referLaboratoryNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferLaboratoryNameEn(String value) {
        this.referLaboratoryNameEn = value;
    }

    /**
     * Gets the value of the referLaboratoryNameMn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferLaboratoryNameMn() {
        return referLaboratoryNameMn;
    }

    /**
     * Sets the value of the referLaboratoryNameMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferLaboratoryNameMn(String value) {
        this.referLaboratoryNameMn = value;
    }

    /**
     * Gets the value of the referLaboratoryNameRu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferLaboratoryNameRu() {
        return referLaboratoryNameRu;
    }

    /**
     * Sets the value of the referLaboratoryNameRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferLaboratoryNameRu(String value) {
        this.referLaboratoryNameRu = value;
    }

    /**
     * Gets the value of the referServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferServiceType() {
        return referServiceType;
    }

    /**
     * Sets the value of the referServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferServiceType(String value) {
        this.referServiceType = value;
    }

    /**
     * Gets the value of the referServiceTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferServiceTypeName() {
        return referServiceTypeName;
    }

    /**
     * Sets the value of the referServiceTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferServiceTypeName(String value) {
        this.referServiceTypeName = value;
    }

    /**
     * Gets the value of the standardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardCode() {
        return standardCode;
    }

    /**
     * Sets the value of the standardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardCode(String value) {
        this.standardCode = value;
    }

    /**
     * Gets the value of the testDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestDate() {
        return testDate;
    }

    /**
     * Sets the value of the testDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestDate(String value) {
        this.testDate = value;
    }

    /**
     * Gets the value of the testNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestNumber() {
        return testNumber;
    }

    /**
     * Sets the value of the testNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestNumber(String value) {
        this.testNumber = value;
    }

    /**
     * Gets the value of the cDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDate() {
        return cDate;
    }

    /**
     * Sets the value of the cDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDate(String value) {
        this.cDate = value;
    }

}
