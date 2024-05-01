package org.example.ecommerce.controllers;

import org.example.ecommerce.models.OrderItem;
import org.example.ecommerce.services.OrderItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-item")
public class OrderItemController {
    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping("/{id}")
    public OrderItem getOrderItemById(@PathVariable("id") Long id) {
        return orderItemService.getOrderItemById(id);
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }

    @PostMapping
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.createOrderItem(orderItem);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderItem(@PathVariable("id") Long id) {
        orderItemService.deleteOrderItem(id);
    }
}
