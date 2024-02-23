package com.app.apiarchi.service;

import com.app.apiarchi.model.Product;
import com.app.apiarchi.repository.ProductInterface;
import com.app.apiarchi.repository.ProductRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private NotificationService notificationService;
    private ProductInterface productRepository;
    @Autowired
    public HelloService() {
        this.notificationService = new NotificationService();
        this.productRepository = new ProductRepositoryImpl();
    }
    public ResponseEntity greeting(String userId) {

        productRepository.get();

        return ResponseEntity.ok("OK");
    }
}
