package org.example.ecommerce.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Product product;

    @ManyToOne
    private Order order;

    private int quantity;
}