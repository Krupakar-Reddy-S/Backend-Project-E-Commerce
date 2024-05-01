package org.example.ecommerce.services;

import org.example.ecommerce.models.InventoryItem;
import org.example.ecommerce.repositories.InventoryItemRepository;
import org.example.ecommerce.exceptions.InventoryItemNotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryItemServiceImpl implements InventoryItemService{
    private final InventoryItemRepository inventoryItemRepository;

    public InventoryItemServiceImpl(InventoryItemRepository inventoryItemRepository) {
        this.inventoryItemRepository = inventoryItemRepository;
    }

    @Override
    public InventoryItem getInventoryItemById(Long id) {
        Optional<InventoryItem> optionalInventoryItem = inventoryItemRepository.findById(id);

        if (optionalInventoryItem.isPresent()) {
            return optionalInventoryItem.get();
        } else {
            throw new InventoryItemNotFoundException(id, "InventoryItem with id " + id + " not found!");
        }
    }

    @Override
    public List<InventoryItem> getAllInventoryItems() {
        return inventoryItemRepository.findAll();
    }

    @Override
    public InventoryItem createInventoryItem(InventoryItem inventoryItem) {
        return inventoryItemRepository.save(inventoryItem);
    }

    @Override
    public void deleteInventoryItem(Long id) {
        inventoryItemRepository.deleteById(id);
    }
}
