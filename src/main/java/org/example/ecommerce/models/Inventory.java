package org.example.ecommerce.models;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;

@Getter
@Setter
@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "inventory")
    @JsonBackReference
    private List<InventoryItem> inventoryItems;

    @Enumerated(EnumType.STRING)
    private InventoryLevel inventoryLevel = InventoryLevel.L3;
}
