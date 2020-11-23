//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2020.11.23 於 11:27:25 AM CST 
//


package cn.lqdev.learning.springboot.ws.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.lqdev.learning.springboot.ws.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Comment_QNAME = new QName("http://tempuri.org/PurchaseOrderSchema.xsd", "comment");
    private final static QName _PurchaseOrder_QNAME = new QName("http://tempuri.org/PurchaseOrderSchema.xsd", "purchaseOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.lqdev.learning.springboot.ws.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link AuthorRequest }
     * 
     */
    public AuthorRequest createAuthorRequest() {
        return new AuthorRequest();
    }

    /**
     * Create an instance of {@link AuthorResponse }
     * 
     */
    public AuthorResponse createAuthorResponse() {
        return new AuthorResponse();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link AuthorListRequest }
     * 
     */
    public AuthorListRequest createAuthorListRequest() {
        return new AuthorListRequest();
    }

    /**
     * Create an instance of {@link AuthorListResponse }
     * 
     */
    public AuthorListResponse createAuthorListResponse() {
        return new AuthorListResponse();
    }

    /**
     * Create an instance of {@link ItemListResponse }
     * 
     */
    public ItemListResponse createItemListResponse() {
        return new ItemListResponse();
    }

    /**
     * Create an instance of {@link ShowPurchaseOrderRequest }
     * 
     */
    public ShowPurchaseOrderRequest createShowPurchaseOrderRequest() {
        return new ShowPurchaseOrderRequest();
    }

    /**
     * Create an instance of {@link PurchaseOrderType }
     * 
     */
    public PurchaseOrderType createPurchaseOrderType() {
        return new PurchaseOrderType();
    }

    /**
     * Create an instance of {@link ShowPurchaseOrderResponse }
     * 
     */
    public ShowPurchaseOrderResponse createShowPurchaseOrderResponse() {
        return new ShowPurchaseOrderResponse();
    }

    /**
     * Create an instance of {@link ItemListRequest }
     * 
     */
    public ItemListRequest createItemListRequest() {
        return new ItemListRequest();
    }

    /**
     * Create an instance of {@link USAddress }
     * 
     */
    public USAddress createUSAddress() {
        return new USAddress();
    }

    /**
     * Create an instance of {@link Items.Item }
     * 
     */
    public Items.Item createItemsItem() {
        return new Items.Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/PurchaseOrderSchema.xsd", name = "comment")
    public JAXBElement<String> createComment(String value) {
        return new JAXBElement<String>(_Comment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/PurchaseOrderSchema.xsd", name = "purchaseOrder")
    public JAXBElement<PurchaseOrderType> createPurchaseOrder(PurchaseOrderType value) {
        return new JAXBElement<PurchaseOrderType>(_PurchaseOrder_QNAME, PurchaseOrderType.class, null, value);
    }

}
