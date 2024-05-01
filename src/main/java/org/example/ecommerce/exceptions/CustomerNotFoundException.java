package org.example.ecommerce.exceptions;

import lombok.*;

@Getter
@Setter
public class CustomerNotFoundException extends RuntimeException {
    private Long id;
    public String message;

    public CustomerNotFoundException(Long id, String message) {
        this.id = id;
        this.message = message;
    }
}
