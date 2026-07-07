package com.company.shipping_fulfillment_engine.client;


import com.company.shipping_fulfillment_engine.dto.OrderEventPayload;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// THIS tells your AI exactly who the upstream provider is
@FeignClient(name = "order-core-api", url = "${order.service.url}")
public interface OrderServiceClient {

    @GetMapping("/api/v1/orders/{id}")
    OrderEventPayload fetchOrderDetails(@PathVariable("id") String trackingId);
}