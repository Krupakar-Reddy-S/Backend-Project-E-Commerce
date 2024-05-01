package org.example.ecommerce.exceptions;

import lombok.*;

@Getter
@Setter
public class OrderItemNotFoundException extends RuntimeException {
    private Long id;
    public String message;

    public OrderItemNotFoundException(Long id, String message) {
        this.id = id;
        this.message = message;
    }
}
