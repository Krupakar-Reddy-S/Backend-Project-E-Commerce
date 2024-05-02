package org.example.ecommerce.services;

import org.example.ecommerce.exceptions.CategoryNotFoundException;
import org.example.ecommerce.exceptions.ProductNotFoundException;
import org.example.ecommerce.models.Category;
import org.example.ecommerce.models.Product;
import org.example.ecommerce.repositories.CategoryRepository;
import org.example.ecommerce.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getProductById(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);

        if (optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            throw new ProductNotFoundException(id, "Product with id " + id + " not found!");
        }
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        Category category = product.getCategory();

        if (category.getId() == null) {
            product.setCategory(categoryRepository.save(category));
        }

        Product product1 = productRepository.save(product);
        Optional<Category> optionalCategory = categoryRepository.findById(category.getId());

        if (optionalCategory.isEmpty()) {
            throw new CategoryNotFoundException(category.getId(), "Invalid Category Id passed!");
        }

        product1.setCategory(optionalCategory.get());

        return product1;
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getProductsByCategory(Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    @Override
    public List<Product> getProductsByPriceAsc() {
        return productRepository.findProductsByOrderByPriceAsc();
    }

    @Override
    public List<Product> getProductsByPriceDesc() {
        return productRepository.findProductsByOrderByPriceDesc();
    }
}
