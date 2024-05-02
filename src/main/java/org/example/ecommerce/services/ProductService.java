package org.example.ecommerce.services;

import org.example.ecommerce.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
    Product createProduct(Product product);
    void deleteProduct(Long id);
    List<Product> getProductsByCategory(Long categoryId);
    List<Product> getProductsByPriceAsc();
    List<Product> getProductsByPriceDesc();
}
