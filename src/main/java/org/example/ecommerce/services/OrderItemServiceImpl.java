package org.example.ecommerce.services;

import org.example.ecommerce.models.OrderItem;
import org.example.ecommerce.repositories.OrderItemRepository;
import org.example.ecommerce.exceptions.OrderItemNotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemServiceImpl implements OrderItemService{
    private final OrderItemRepository orderItemRepository;

    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public OrderItem getOrderItemById(Long id) {
        Optional<OrderItem> optionalOrderItem = orderItemRepository.findById(id);

        if (optionalOrderItem.isPresent()) {
            return optionalOrderItem.get();
        } else {
            throw new OrderItemNotFoundException(id, "OrderItem with id " + id + " not found!");
        }
    }

    @Override
    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    @Override
    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    public void deleteOrderItem(Long id) {
        orderItemRepository.deleteById(id);
    }
}
