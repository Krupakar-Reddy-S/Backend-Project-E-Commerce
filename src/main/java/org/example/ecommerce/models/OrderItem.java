package org.example.ecommerce.models;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

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
    @JsonBackReference
    private Order order;

    private int quantity;
}