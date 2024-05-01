package org.example.ecommerce.exceptionhandlers;

import org.example.ecommerce.dtos.ExceptionDto;
import org.example.ecommerce.exceptions.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleCategoryNotFoundException(CategoryNotFoundException categoryNotFoundException) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Invalid Category Id: " + categoryNotFoundException.getId());
        dto.setResolution("CategoryNotFoundException");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, org.springframework.http.HttpStatus.BAD_REQUEST);

        return response;
    }

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleCustomerNotFoundException(CustomerNotFoundException customerNotFoundException) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Invalid Customer Id: " + customerNotFoundException.getId());
        dto.setResolution("CustomerNotFoundException");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, org.springframework.http.HttpStatus.BAD_REQUEST);

        return response;
    }

    @ExceptionHandler(InventoryNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleInventoryNotFoundException(InventoryNotFoundException inventoryNotFoundException) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Invalid Inventory Id: " + inventoryNotFoundException.getId());
        dto.setResolution("InventoryNotFoundException");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, org.springframework.http.HttpStatus.BAD_REQUEST);

        return response;
    }

    @ExceptionHandler(InventoryItemNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleInventoryItemNotFoundException(InventoryItemNotFoundException inventoryItemNotFoundException) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Invalid Inventory Item Id: " + inventoryItemNotFoundException.getId());
        dto.setResolution("InventoryItemNotFoundException");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, org.springframework.http.HttpStatus.BAD_REQUEST);

        return response;
    }

    @ExceptionHandler(OrderNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleOrderNotFoundException(OrderNotFoundException orderNotFoundException) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Invalid Order Id: " + orderNotFoundException.getId());
        dto.setResolution("OrderNotFoundException");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, org.springframework.http.HttpStatus.BAD_REQUEST);

        return response;
    }

    @ExceptionHandler(OrderItemNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleOrderItemNotFoundException(OrderItemNotFoundException orderItemNotFoundException) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Invalid Order Item Id: " + orderItemNotFoundException.getId());
        dto.setResolution("OrderItemNotFoundException");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, org.springframework.http.HttpStatus.BAD_REQUEST);

        return response;
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleProductNotFoundException(ProductNotFoundException productNotFoundException) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Invalid Product Id: " + productNotFoundException.getId());
        dto.setResolution("ProductNotFoundException");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, org.springframework.http.HttpStatus.BAD_REQUEST);

        return response;
    }

}
