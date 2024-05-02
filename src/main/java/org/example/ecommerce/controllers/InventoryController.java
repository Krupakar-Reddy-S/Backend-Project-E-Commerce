package org.example.ecommerce.controllers;

import org.example.ecommerce.models.Inventory;
import org.example.ecommerce.services.InventoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    private final Logger logger = LoggerFactory.getLogger(InventoryController.class);
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/{id}")
    public Inventory getInventoryById(@PathVariable("id") Long id) {
        logger.info("Getting inventory by id: " + id);
        return inventoryService.getInventoryById(id);
    }

    @GetMapping
    public List<Inventory> getAllInventory() {
        logger.info("Getting all inventory...");
        return inventoryService.getAllInventory();
    }

    @PostMapping
    public Inventory createInventory(@RequestBody Inventory inventory) {
        logger.info("Creating inventory: " + inventory);
        return inventoryService.createInventory(inventory);
    }

    @DeleteMapping("/{id}")
    public void deleteInventory(@PathVariable("id") Long id) {
        logger.info("Deleting inventory by id: " + id);
        inventoryService.deleteInventory(id);
    }
}
