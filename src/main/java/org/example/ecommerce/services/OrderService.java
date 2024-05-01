package org.example.ecommerce.services;

import org.example.ecommerce.models.Order;

import java.util.List;

public interface OrderService {
    Order getOrderById(Long id);
    List<Order> getAllOrders();
    Order createOrder(Order order);
    void deleteOrder(Long id);
}
