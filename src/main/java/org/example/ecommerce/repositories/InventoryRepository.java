package org.example.ecommerce.repositories;

import org.example.ecommerce.models.Inventory;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
     @Override
     Optional<Inventory> findById(Long id);

    @Override
    List<Inventory> findAll();

    @Override
    Inventory save(Inventory inventory);

    @Override
    void deleteById(Long id);
}
