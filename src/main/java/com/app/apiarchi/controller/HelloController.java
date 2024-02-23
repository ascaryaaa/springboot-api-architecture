package com.app.apiarchi.controller;

import com.app.apiarchi.repository.ProductRepositoryImpl;
import com.app.apiarchi.service.HelloService;
import com.app.apiarchi.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class HelloController {
    private HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        var notificationService = new NotificationService();
        var productRepository = new ProductRepositoryImpl();
        this.helloService = helloService;
    }
    @GetMapping("/hello")
    public ResponseEntity get() {
        try{
            //logging
            return helloService.greeting("ultraman");
        } catch (RuntimeException e) {
            return ResponseEntity.internalServerError().build();
        }

    }
}
