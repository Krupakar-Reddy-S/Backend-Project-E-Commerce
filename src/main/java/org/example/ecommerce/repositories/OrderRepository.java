package org.example.ecommerce.repositories;

import org.example.ecommerce.models.Order;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Override
    Optional<Order> findById(Long id);

    @Override
    List<Order> findAll();

    @Override
    Order save(Order order);

    @Override
    void deleteById(Long id);
}
