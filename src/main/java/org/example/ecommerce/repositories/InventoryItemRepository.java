package org.example.ecommerce.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryItemRepository extends JpaRepository<InventoryItemRepository, Long> {
    @Override
    Optional<InventoryItemRepository> findById(Long id);

    @Override
    List<InventoryItemRepository> findAll();

    @Override
    InventoryItemRepository save(InventoryItemRepository inventoryItem);

    @Override
    void deleteById(Long id);
}
