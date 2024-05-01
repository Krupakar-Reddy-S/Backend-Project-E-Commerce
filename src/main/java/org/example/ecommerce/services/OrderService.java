package org.example.ecommerce.services;

import org.example.ecommerce.models.Order;
import org.example.ecommerce.models.OrderStatus;

import java.util.List;

public interface OrderService {
    Order getOrderById(Long id);
    List<Order> getAllOrders();
    Order createOrder(Order order);
    void deleteOrder(Long id);
    OrderStatus getOrderStatus(Long id);
    OrderStatus updateOrderStatus(Long id, OrderStatus orderStatus);
}
