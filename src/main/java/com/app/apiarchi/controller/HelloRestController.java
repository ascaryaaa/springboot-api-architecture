package com.app.apiarchi.controller;

import com.app.apiarchi.service.HelloRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class HelloRestController {
    private HelloRestService helloRestService;

    @Autowired
    public HelloRestController(HelloRestService helloRestService) {
        this.helloRestService = helloRestService;
    }
    @GetMapping("/hello")
    public ResponseEntity get() {
        try{
            //logging
            return helloRestService.ok();
        } catch (RuntimeException e) {
            return ResponseEntity.internalServerError().build();
        }

    }
}
