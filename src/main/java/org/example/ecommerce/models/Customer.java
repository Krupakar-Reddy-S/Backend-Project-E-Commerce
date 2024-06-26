package org.example.ecommerce.models;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private Date registrationDate;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}
