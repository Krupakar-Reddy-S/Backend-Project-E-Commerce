package org.example.ecommerce.repositories;

import org.example.ecommerce.models.InventoryItem;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> {
    @Override
    Optional<InventoryItem> findById(Long id);

    @Override
    List<InventoryItem> findAll();

    @Override
    InventoryItem save(InventoryItem inventoryItem);

    @Override
    void deleteById(Long id);
}
