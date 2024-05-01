package org.example.ecommerce.repositories;

import org.example.ecommerce.models.OrderItem;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    @Override
    Optional<OrderItem> findById(Long id);

    @Override
    List<OrderItem> findAll();

    @Override
    OrderItem save(OrderItem orderItem);

    @Override
    void deleteById(Long id);
}
