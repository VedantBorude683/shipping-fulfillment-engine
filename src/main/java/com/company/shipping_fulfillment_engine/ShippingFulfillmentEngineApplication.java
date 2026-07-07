package com.company.shipping_fulfillment_engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // <-- ADD THIS LINE
public class ShippingFulfillmentEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShippingFulfillmentEngineApplication.class, args);
	}
}