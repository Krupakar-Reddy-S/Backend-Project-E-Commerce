package org.example.ecommerce.controllers;

import org.example.ecommerce.models.InventoryItem;
import org.example.ecommerce.services.InventoryItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory-item")
public class InventoryItemController {
    private final InventoryItemService inventoryItemService;

    public InventoryItemController(InventoryItemService inventoryItemService) {
        this.inventoryItemService = inventoryItemService;
    }

    @GetMapping("/{id}")
    public InventoryItem getInventoryItemById(@PathVariable("id") Long id) {
        return inventoryItemService.getInventoryItemById(id);
    }

    @GetMapping
    public List<InventoryItem> getAllInventoryItems() {
        return inventoryItemService.getAllInventoryItems();
    }

    @PostMapping
    public InventoryItem createInventoryItem(@RequestBody InventoryItem inventoryItem) {
        return inventoryItemService.createInventoryItem(inventoryItem);
    }

    @DeleteMapping("/{id}")
    public void deleteInventoryItem(@PathVariable("id") Long id) {
        inventoryItemService.deleteInventoryItem(id);
    }
}
