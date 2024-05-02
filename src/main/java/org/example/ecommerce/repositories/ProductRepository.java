package org.example.ecommerce.repositories;

import java.util.List;
import java.util.Optional;

import org.example.ecommerce.models.Product;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Override
    Optional<Product> findById(Long id);

    @Override
    List<Product> findAll();

    @Override
    Product save(Product product);

    @Override
    void deleteById(Long id);

    List<Product> findByCategoryId(Long categoryId);
    List<Product> findProductsByOrderByPriceAsc();
    List<Product> findProductsByOrderByPriceDesc();
}
