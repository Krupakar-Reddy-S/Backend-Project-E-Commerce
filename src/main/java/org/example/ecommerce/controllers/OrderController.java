package org.example.ecommerce.controllers;

import org.example.ecommerce.models.Order;
import org.example.ecommerce.models.OrderStatus;
import org.example.ecommerce.services.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") Long id) {
        orderService.deleteOrder(id);
    }

    @GetMapping("/{id}/status")
    public OrderStatus getOrderStatus(@PathVariable("id") Long id) {
        return orderService.getOrderStatus(id);
    }

    @PutMapping("/{id}/status")
    public OrderStatus updateOrderStatus(@PathVariable("id") Long id, @RequestBody OrderStatus orderStatus) {
        return orderService.updateOrderStatus(id, orderStatus);
    }
}
