package org.example.ecommerce.services;

import org.example.ecommerce.models.Order;
import org.example.ecommerce.models.OrderStatus;
import org.example.ecommerce.repositories.OrderRepository;
import org.example.ecommerce.exceptions.OrderNotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order getOrderById(Long id) {
        Optional<Order> optionalOrder = orderRepository.findById(id);

        if (optionalOrder.isPresent()) {
            return optionalOrder.get();
        } else {
            throw new OrderNotFoundException(id, "Order with id " + id + " not found!");
        }
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public OrderStatus getOrderStatus(Long id) {
        Optional<Order> optionalOrder = orderRepository.findById(id);

        if (optionalOrder.isPresent()) {
            return optionalOrder.get().getOrderStatus();
        } else {
            throw new OrderNotFoundException(id, "Order with id " + id + " not found!");
        }
    }

    @Override
    public OrderStatus updateOrderStatus(Long id, OrderStatus orderStatus) {
        Optional<Order> optionalOrder = orderRepository.findById(id);

        if (optionalOrder.isPresent()) {
            Order order = optionalOrder.get();
            order.setOrderStatus(orderStatus);
            orderRepository.save(order);

            return order.getOrderStatus();
        } else {
            throw new OrderNotFoundException(id, "Order with id " + id + " not found!");
        }
    }
}
