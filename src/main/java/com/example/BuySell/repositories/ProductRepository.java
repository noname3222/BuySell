package com.example.BuySell.repositories;

import com.example.BuySell.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);

    Page<Product> findByTitleContainingIgnoreCase(String title, Pageable pageable);

    Page<Product> findByCity(String city, Pageable pageable);

    Page<Product> findByTitleContainingIgnoreCaseAndCity(String title, String city, Pageable pageable);
}
