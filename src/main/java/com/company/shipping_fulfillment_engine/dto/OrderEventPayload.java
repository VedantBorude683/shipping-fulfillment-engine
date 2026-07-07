package com.company.shipping_fulfillment_engine.dto;

import jakarta.validation.constraints.NotNull;

public class OrderEventPayload {

    // THIS is the trap. It strictly demands an Integer.
    @NotNull(message = "Order ID cannot be null")
    private Integer orderId;

    @NotNull
    private Double amount;

    private String status;

    // Getters and Setters
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}