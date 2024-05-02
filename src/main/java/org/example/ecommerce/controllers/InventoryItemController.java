package org.example.ecommerce.controllers;

import org.example.ecommerce.models.InventoryItem;
import org.example.ecommerce.services.InventoryItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory-item")
public class InventoryItemController {
    private final Logger logger = LoggerFactory.getLogger(InventoryItemController.class);
    private final InventoryItemService inventoryItemService;

    public InventoryItemController(InventoryItemService inventoryItemService) {
        this.inventoryItemService = inventoryItemService;
    }

    @GetMapping("/{id}")
    public InventoryItem getInventoryItemById(@PathVariable("id") Long id) {
        logger.info("Getting inventory item by id: " + id);
        return inventoryItemService.getInventoryItemById(id);
    }

    @GetMapping
    public List<InventoryItem> getAllInventoryItems() {
        logger.info("Getting all inventory items...");
        return inventoryItemService.getAllInventoryItems();
    }

    @PostMapping
    public InventoryItem createInventoryItem(@RequestBody InventoryItem inventoryItem) {
        logger.info("Creating inventory item: " + inventoryItem);
        return inventoryItemService.createInventoryItem(inventoryItem);
    }

    @DeleteMapping("/{id}")
    public void deleteInventoryItem(@PathVariable("id") Long id) {
        logger.info("Deleting inventory item by id: " + id);
        inventoryItemService.deleteInventoryItem(id);
    }
}
