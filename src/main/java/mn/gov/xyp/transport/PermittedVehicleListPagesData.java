
package mn.gov.xyp.transport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permittedVehicleListPagesData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="permittedVehicleListPagesData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="currentPageListCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="firstItem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hasMorePages" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasPages" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="lastItem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lastPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nextPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="onFirstPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="perPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="previousPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "permittedVehicleListPagesData", propOrder = {
    "currentPage",
    "currentPageListCount",
    "firstItem",
    "hasMorePages",
    "hasPages",
    "lastItem",
    "lastPage",
    "nextPage",
    "onFirstPage",
    "perPage",
    "previousPage",
    "total"
})
public class PermittedVehicleListPagesData {

    protected int currentPage;
    protected int currentPageListCount;
    protected int firstItem;
    protected boolean hasMorePages;
    protected boolean hasPages;
    protected int lastItem;
    protected int lastPage;
    protected int nextPage;
    protected boolean onFirstPage;
    protected int perPage;
    protected int previousPage;
    protected int total;

    /**
     * Gets the value of the currentPage property.
     * 
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Sets the value of the currentPage property.
     * 
     */
    public void setCurrentPage(int value) {
        this.currentPage = value;
    }

    /**
     * Gets the value of the currentPageListCount property.
     * 
     */
    public int getCurrentPageListCount() {
        return currentPageListCount;
    }

    /**
     * Sets the value of the currentPageListCount property.
     * 
     */
    public void setCurrentPageListCount(int value) {
        this.currentPageListCount = value;
    }

    /**
     * Gets the value of the firstItem property.
     * 
     */
    public int getFirstItem() {
        return firstItem;
    }

    /**
     * Sets the value of the firstItem property.
     * 
     */
    public void setFirstItem(int value) {
        this.firstItem = value;
    }

    /**
     * Gets the value of the hasMorePages property.
     * 
     */
    public boolean isHasMorePages() {
        return hasMorePages;
    }

    /**
     * Sets the value of the hasMorePages property.
     * 
     */
    public void setHasMorePages(boolean value) {
        this.hasMorePages = value;
    }

    /**
     * Gets the value of the hasPages property.
     * 
     */
    public boolean isHasPages() {
        return hasPages;
    }

    /**
     * Sets the value of the hasPages property.
     * 
     */
    public void setHasPages(boolean value) {
        this.hasPages = value;
    }

    /**
     * Gets the value of the lastItem property.
     * 
     */
    public int getLastItem() {
        return lastItem;
    }

    /**
     * Sets the value of the lastItem property.
     * 
     */
    public void setLastItem(int value) {
        this.lastItem = value;
    }

    /**
     * Gets the value of the lastPage property.
     * 
     */
    public int getLastPage() {
        return lastPage;
    }

    /**
     * Sets the value of the lastPage property.
     * 
     */
    public void setLastPage(int value) {
        this.lastPage = value;
    }

    /**
     * Gets the value of the nextPage property.
     * 
     */
    public int getNextPage() {
        return nextPage;
    }

    /**
     * Sets the value of the nextPage property.
     * 
     */
    public void setNextPage(int value) {
        this.nextPage = value;
    }

    /**
     * Gets the value of the onFirstPage property.
     * 
     */
    public boolean isOnFirstPage() {
        return onFirstPage;
    }

    /**
     * Sets the value of the onFirstPage property.
     * 
     */
    public void setOnFirstPage(boolean value) {
        this.onFirstPage = value;
    }

    /**
     * Gets the value of the perPage property.
     * 
     */
    public int getPerPage() {
        return perPage;
    }

    /**
     * Sets the value of the perPage property.
     * 
     */
    public void setPerPage(int value) {
        this.perPage = value;
    }

    /**
     * Gets the value of the previousPage property.
     * 
     */
    public int getPreviousPage() {
        return previousPage;
    }

    /**
     * Sets the value of the previousPage property.
     * 
     */
    public void setPreviousPage(int value) {
        this.previousPage = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

}
