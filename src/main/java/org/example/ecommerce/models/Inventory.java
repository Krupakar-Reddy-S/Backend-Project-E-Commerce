package org.example.ecommerce.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "inventory")
    private List<InventoryItem> inventoryItems;

    @Enumerated(EnumType.STRING)
    private InventoryLevel inventoryLevel;
}
