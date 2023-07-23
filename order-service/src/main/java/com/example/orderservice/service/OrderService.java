package com.example.orderservice.service;

import com.example.orderservice.dto.OrderDto;

import java.util.List;
import java.util.UUID;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDto);
    OrderDto getOrderByOrderId(UUID orderId);
    List<OrderDto> getOrdersByUserId(UUID userId);
    List<OrderDto> getAllOrders();
    void deleteOrder(UUID orderId);
}
