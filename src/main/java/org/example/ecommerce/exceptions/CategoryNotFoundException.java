package org.example.ecommerce.exceptions;

import lombok.*;

@Getter
@Setter
public class CategoryNotFoundException extends RuntimeException {
    private Long id;
    public String message;

    public CategoryNotFoundException(Long id, String message) {
        this.id = id;
        this.message = message;
    }
}
