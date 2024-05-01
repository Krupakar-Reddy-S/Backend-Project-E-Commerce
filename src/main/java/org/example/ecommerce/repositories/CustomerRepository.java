package org.example.ecommerce.repositories;

import org.example.ecommerce.models.Customer;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Override
    Optional<Customer> findById(Long id);

    @Override
    List<Customer> findAll();

    @Override
    Customer save(Customer customer);

    @Override
    void deleteById(Long id);
}
