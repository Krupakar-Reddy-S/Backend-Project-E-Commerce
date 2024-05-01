package org.example.ecommerce.services;

import org.example.ecommerce.exceptions.InventoryNotFoundException;
import org.example.ecommerce.models.Inventory;
import org.example.ecommerce.repositories.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService{
    private final InventoryRepository inventoryRepository;

    public InventoryServiceImpl(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public Inventory getInventoryById(Long id) {
        Optional<Inventory> optionalInventory = inventoryRepository.findById(id);

        if (optionalInventory.isPresent()) {
            return optionalInventory.get();
        } else {
            throw new InventoryNotFoundException(id, "Inventory with id " + id + " not found!");
        }
    }

    @Override
    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    @Override
    public Inventory createInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public void deleteInventory(Long productId) {
        inventoryRepository.deleteById(productId);
    }
}
