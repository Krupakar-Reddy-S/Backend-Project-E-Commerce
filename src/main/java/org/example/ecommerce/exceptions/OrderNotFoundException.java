package org.example.ecommerce.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderNotFoundException extends RuntimeException {
    private Long id;
    public String message;

    public OrderNotFoundException(Long id, String message) {
        this.id = id;
        this.message = message;
    }
}
