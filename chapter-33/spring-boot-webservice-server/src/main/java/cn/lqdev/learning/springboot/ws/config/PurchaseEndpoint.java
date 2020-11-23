package cn.lqdev.learning.springboot.ws.config;

import cn.lqdev.learning.springboot.ws.webservice.ItemListRequest;
import cn.lqdev.learning.springboot.ws.webservice.ItemListResponse;
import cn.lqdev.learning.springboot.ws.webservice.Items;
import cn.lqdev.learning.springboot.ws.webservice.PurchaseOrderType;
import cn.lqdev.learning.springboot.ws.webservice.ShowPurchaseOrderRequest;
import cn.lqdev.learning.springboot.ws.webservice.ShowPurchaseOrderResponse;
import cn.lqdev.learning.springboot.ws.webservice.USAddress;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

@Endpoint
public class PurchaseEndpoint {

    @PayloadRoot(namespace = WsConst.NAMESPACE_URI_PURCHASE, localPart = "itemListRequest")
    @ResponsePayload
    public ItemListResponse getItemList(@RequestPayload ItemListRequest itemListRequest){
        ItemListResponse response = new ItemListResponse();
        Items items = new Items();
        Items.Item item = new Items.Item();
        item.setProductName("Product_1");
        item.setComment("Product_1");
        item.setUSPrice(new BigDecimal(1024));
        item.setPartNum("3");

        Items.Item item2 = new Items.Item();
        item.setProductName("Product_2");
        item.setComment("Product_2");
        item.setUSPrice(new BigDecimal(1980));
        item.setPartNum("4");

        items.getItem().add(item);
        items.getItem().add(item2);
        response.getItems().add(items);

        return response;
    }

    @PayloadRoot(namespace = WsConst.NAMESPACE_URI_PURCHASE, localPart = "showPurchaseOrderRequest")
    @ResponsePayload
    public ShowPurchaseOrderResponse getPurchaseOrders(@RequestPayload ShowPurchaseOrderRequest showPurchaseOrderRequest)
            throws DatatypeConfigurationException {
        ShowPurchaseOrderResponse response = new ShowPurchaseOrderResponse();

        USAddress billToUsAddress = new USAddress();
        billToUsAddress.setCountry("Taiwan");
        billToUsAddress.setCity("Taipei");
        billToUsAddress.setName("XXXX");

        USAddress shipToUsAddress = new USAddress();
        shipToUsAddress.setCountry("Taiwan");
        shipToUsAddress.setCity("Changhua");
        shipToUsAddress.setName("FFFFF");

        XMLGregorianCalendar xmlGregorianCalendar =
                DatatypeFactory.newInstance().newXMLGregorianCalendar("2020-11-23");

        PurchaseOrderType purchaseOrderType= new PurchaseOrderType();
        purchaseOrderType.setBillTo(billToUsAddress);
        purchaseOrderType.setComment("billTo");
        purchaseOrderType.setShipTo(shipToUsAddress);
        purchaseOrderType.setConfirmDate(xmlGregorianCalendar);
        purchaseOrderType.setItems(gainItems());
        response.getPurchaseOrder().add(0, purchaseOrderType);
        return response;
    }

    private Items gainItems() throws DatatypeConfigurationException {
        Items items = new Items();

        Items.Item item1 = new Items.Item();
        item1.setUSPrice(new BigDecimal(1380));
        item1.setProductName("相機包");

        XMLGregorianCalendar xmlGregorianCalendar =
                DatatypeFactory.newInstance().newXMLGregorianCalendar("2020-11-25");
        item1.setShipDate(xmlGregorianCalendar);

        Items.Item item2 = new Items.Item();
        item2.setUSPrice(new BigDecimal(1850));
        item2.setProductName("胸跨包");
        item2.setShipDate(xmlGregorianCalendar);

        items.getItem().add(0, item1);
        items.getItem().add(1, item2);
        return items;
    }

}
