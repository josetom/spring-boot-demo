package com.dex.order.api;

import com.dex.order.model.Order;
import io.swagger.annotations.*;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link OrdersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-26T21:59:43.122248+05:30[Asia/Kolkata]")
public interface OrdersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /orders : Create a new Order
     *
     * @param order  (optional)
     * @return Order Response (status code 200)
     *         or unable to process the action (status code 400)
     * @see OrdersApi#createOrder
     */
    default ResponseEntity<Order> createOrder(Order order) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"symbol\" : \"symbol\", \"side\" : \"BUY\", \"quantity\" : 0.08008281904610115, \"signature\" : \"signature\", \"price\" : 0.6027456183070403, \"type\" : \"LIMIT\", \"timeInForce\" : \"GTC\", \"recvWindow\" : 5, \"timestamp\" : 1.4658129805029452 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /orders/{id} : retrieve an order
     *
     * @param id Order ID (required)
     * @return Order Response (status code 200)
     *         or bad input parameter (status code 400)
     * @see OrdersApi#getOrders
     */
    default ResponseEntity<Order> getOrders(String id) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"symbol\" : \"symbol\", \"side\" : \"BUY\", \"quantity\" : 0.08008281904610115, \"signature\" : \"signature\", \"price\" : 0.6027456183070403, \"type\" : \"LIMIT\", \"timeInForce\" : \"GTC\", \"recvWindow\" : 5, \"timestamp\" : 1.4658129805029452 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
