package org.example.ecommerce.models;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Inventory inventory;

    @Enumerated(EnumType.STRING)
    private Rating rating;

    private String name;
    private String description;
    private Double price;

}
