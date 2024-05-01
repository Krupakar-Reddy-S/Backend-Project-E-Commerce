package org.example.ecommerce.exceptions;

import lombok.*;

@Getter
@Setter
public class InventoryNotFoundException extends RuntimeException {
    private Long id;
    public String message;

    public InventoryNotFoundException(Long id, String message) {
        this.id = id;
        this.message = message;
    }
}
