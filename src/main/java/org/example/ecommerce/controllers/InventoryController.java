package org.example.ecommerce.controllers;

import org.example.ecommerce.models.Inventory;
import org.example.ecommerce.services.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/{id}")
    public Inventory getInventoryById(@PathVariable("id") Long id) {
        return inventoryService.getInventoryById(id);
    }

    @GetMapping
    public List<Inventory> getAllInventory() {
        return inventoryService.getAllInventory();
    }

    @PostMapping
    public Inventory createInventory(@RequestBody Inventory inventory) {
        return inventoryService.createInventory(inventory);
    }

    @DeleteMapping("/{id}")
    public void deleteInventory(@PathVariable("id") Long id) {
        inventoryService.deleteInventory(id);
    }
}
