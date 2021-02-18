package com.dex.order.api;

import com.dex.order.model.Order;
import org.springframework.http.ResponseEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrdersApiDelegateImplTest {

    private Order getMockOrder() {
        Order order = new Order();
//        order.setSymbol("BTCETH");
//        order.setSide(Order.SideEnum.BUY);
//        order.setType(Order.TypeEnum.LIMIT);
//        order.setPrice(new BigDecimal("0.037483"));
//        order.setQuantity(new BigDecimal("0.01"));
//        order.setTimeInForce(Order.TimeInForceEnum.GTC);
//        order.setRecvWindow(5000);
//        order.setTimestamp(new BigDecimal("1611252071234"));
//        order.setSignature(EncryptionUtils.getSignature(order, ExchangeConstants.Binance.SECRET_KEY));


//        {
//            "symbol": "ETHBTC",
//                "side": "BUY",
//                "type": "LIMIT",
//                "timeInForce": "GTC",
//                "price": 0.07355400,
//                "quantity": 0.01,
//                "recvWindow": 5000
//        }

        return order;
    }

    @Test
    public void getOrdersTest() {
        String dummyOrderId = "dummy_id";
        OrdersApiDelegateImpl ordersApiDelegate = new OrdersApiDelegateImpl();
        Assert.assertEquals(ordersApiDelegate.getOrders(dummyOrderId), ResponseEntity.ok(getMockOrder()));
    }

}
