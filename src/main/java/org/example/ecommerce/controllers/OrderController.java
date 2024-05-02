package org.example.ecommerce.controllers;

import org.example.ecommerce.models.Order;
import org.example.ecommerce.models.OrderStatus;
import org.example.ecommerce.services.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final Logger logger = LoggerFactory.getLogger(OrderController.class);
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable("id") Long id) {
        logger.info("Getting order by id: " + id);
        return orderService.getOrderById(id);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        logger.info("Getting all orders...");
        return orderService.getAllOrders();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        logger.info("Creating order: " + order);
        return orderService.createOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") Long id) {
        logger.info("Deleting order by id: " + id);
        orderService.deleteOrder(id);
    }

    @GetMapping("/{id}/status")
    public OrderStatus getOrderStatus(@PathVariable("id") Long id) {
        logger.info("Getting order status by id: " + id);
        return orderService.getOrderStatus(id);
    }

    @PutMapping("/{id}/status")
    public OrderStatus updateOrderStatus(@PathVariable("id") Long id, @RequestBody OrderStatus orderStatus) {
        logger.info("Updating order status by id: " + id);
        return orderService.updateOrderStatus(id, orderStatus);
    }
}
