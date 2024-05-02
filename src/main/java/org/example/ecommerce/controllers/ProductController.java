package org.example.ecommerce.controllers;

import org.example.ecommerce.models.Product;
import org.example.ecommerce.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final Logger logger = LoggerFactory.getLogger(ProductController.class);
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        logger.info("Getting product by id: " + id);
        return productService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        logger.info("Getting all products...");
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        logger.info("Creating product: " + product);
        return productService.createProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        logger.info("Deleting product by id: " + id);
        productService.deleteProduct(id);
    }

    @GetMapping("/category")
    public List<Product> getProductOfCategory(@RequestParam("categoryId") Long categoryId) {
        logger.info("Getting product of category by id: " + categoryId);
        return productService.getProductsByCategory(categoryId);
    }

    @GetMapping(params = "sortByPriceAsc")
    public List<Product> getProductsByPriceAsc() {
        logger.info("Getting products by price in ascending order...");
        return productService.getProductsByPriceAsc();
    }

    @GetMapping(params = "sortByPriceDesc")
    public List<Product> getProductsByPriceDesc() {
        logger.info("Getting products by price in descending order...");
        return productService.getProductsByPriceDesc();
    }
}
