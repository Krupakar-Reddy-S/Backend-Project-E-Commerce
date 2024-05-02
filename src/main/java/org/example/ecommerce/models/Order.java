package org.example.ecommerce.models;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;

@Getter
@Setter
@Entity(name = "`Order`")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItem;

    @ManyToOne
    @JsonBackReference
    private Customer customer;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus = OrderStatus.PENDING;
}
