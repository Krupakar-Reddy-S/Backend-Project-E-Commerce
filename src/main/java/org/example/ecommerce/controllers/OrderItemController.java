package org.example.ecommerce.controllers;

import org.example.ecommerce.models.OrderItem;
import org.example.ecommerce.services.OrderItemService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-item")
public class OrderItemController {
    private final Logger logger = LoggerFactory.getLogger(OrderItemController.class);
    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping("/{id}")
    public OrderItem getOrderItemById(@PathVariable("id") Long id) {
        logger.info("Getting order item by id: " + id);
        return orderItemService.getOrderItemById(id);
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        logger.info("Getting all order items...");
        return orderItemService.getAllOrderItems();
    }

    @PostMapping
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        logger.info("Creating order item: " + orderItem);
        return orderItemService.createOrderItem(orderItem);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderItem(@PathVariable("id") Long id) {
        logger.info("Deleting order item by id: " + id);
        orderItemService.deleteOrderItem(id);
    }
}
