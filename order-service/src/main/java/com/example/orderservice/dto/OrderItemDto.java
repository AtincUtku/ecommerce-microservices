package com.example.orderservice.dto;

import java.io.Serializable;

public class OrderItemDto implements Serializable {

    private String productId;
    private int quantity;

    // Default constructor is needed for de-serialization
    public OrderItemDto() {
    }

    public OrderItemDto(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    // Standard getters and setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
