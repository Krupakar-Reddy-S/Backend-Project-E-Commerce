package org.example.ecommerce.exceptions;

import lombok.Getter;
import lombok.Setter;

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
