package org.example.ecommerce.services;

import org.example.ecommerce.exceptions.CategoryNotFoundException;
import org.example.ecommerce.models.Category;

import java.util.List;

public interface CategoryService {
    Category getCategoryById(Long id) throws CategoryNotFoundException;
    List<Category> getAllCategories();
    Category createCategory(Category category);
    void deleteCategory(Long id);
}
