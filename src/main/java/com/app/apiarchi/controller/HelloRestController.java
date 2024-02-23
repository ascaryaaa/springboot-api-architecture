package com.app.apiarchi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class HelloRestController {
    @GetMapping("/hello")
    public ResponseEntity get() {
        try{
            //logging
            return helloRestService.ok("OK");
        } catch (RuntimeException e) {
            return ResponseEntity.internalServerError().build();
        }

    }
}
