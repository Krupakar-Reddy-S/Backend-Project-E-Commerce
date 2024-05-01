package org.example.ecommerce.repositories;

import org.example.ecommerce.models.Category;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Override
    Optional<Category> findById(Long id);

    @Override
    List<Category> findAll();

    @Override
    Category save(Category category);

    @Override
    void deleteById(Long id);
}
