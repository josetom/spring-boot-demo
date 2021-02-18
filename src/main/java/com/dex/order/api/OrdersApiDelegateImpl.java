package com.dex.order.api;

import com.binance.api.client.domain.account.NewOrder;
import com.binance.api.client.domain.account.NewOrderResponse;
import com.dex.exchange.binance.BinanceClient;
import com.dex.exchange.binance.BinanceTransformer;
import com.dex.order.model.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Component
public class OrdersApiDelegateImpl implements OrdersApiDelegate {

    private static Logger logger = LogManager.getLogger();

    @Override
    public ResponseEntity<Order> createOrder(Order order) {
        try {
            if(order.getTimestamp() == null) {
                order.setTimestamp(BigDecimal.valueOf(new Date().getTime()));
            }
            // TODO Dummy implementation. This needs to be changed.
            NewOrder newOrder = BinanceTransformer.transform(order, NewOrder.class);
            NewOrderResponse newOrderResponse = BinanceClient.getRestClient().newOrder(newOrder);
            return ResponseEntity.ok(BinanceTransformer.transform(newOrderResponse, Order.class));
        } catch (Exception exception) {
            logger.error(exception);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Order> getOrders(String id) {
        Order order = new Order();
        return ResponseEntity.ok(order);
    }

}
