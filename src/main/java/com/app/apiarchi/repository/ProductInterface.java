package com.app.apiarchi.repository;

import com.app.apiarchi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInterface extends JpaRepository<Product,Long> {
    List<Product> get();
    Product getById();
    Long add();
}
