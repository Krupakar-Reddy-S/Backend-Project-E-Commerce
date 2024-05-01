package org.example.ecommerce.services;

import org.example.ecommerce.models.Inventory;

import java.util.List;

public interface InventoryService {
    Inventory getInventoryById(Long productId);
    List<Inventory> getAllInventory();
    Inventory createInventory(Inventory inventory);
    void deleteInventory(Long productId);
}
