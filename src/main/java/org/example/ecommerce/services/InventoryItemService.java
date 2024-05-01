package org.example.ecommerce.services;

import org.example.ecommerce.models.InventoryItem;

import java.util.List;

public interface InventoryItemService {
    InventoryItem getInventoryItemById(Long id);
    List<InventoryItem> getAllInventoryItems();
    InventoryItem createInventoryItem(InventoryItem inventoryItem);
    void deleteInventoryItem(Long id);
}
