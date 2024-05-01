package org.example.ecommerce.exceptions;

import lombok.*;

@Getter
@Setter
public class InventoryItemNotFoundException extends RuntimeException {
    private Long id;
    public String message;

    public InventoryItemNotFoundException(Long id, String message) {
        this.id = id;
        this.message = message;
    }
}
