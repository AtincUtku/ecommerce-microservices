package com.example.orderservice.dto;

import java.io.Serializable;
import java.util.List;

public class OrderDto implements Serializable {

    private String userId;
    private List<OrderItemDto> items;

    // Default constructor is needed for de-serialization
    public OrderDto() {
    }

    public OrderDto(String userId, List<OrderItemDto> items) {
        this.userId = userId;
        this.items = items;
    }

    // Standard getters and setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<OrderItemDto> getItems() {
        return items;
    }

    public void setItems(List<OrderItemDto> items) {
        this.items = items;
    }
}
