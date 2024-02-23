package com.app.apiarchi.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloRestService {
    public ResponseEntity ok() {
        return ResponseEntity.ok("OK");
    }
}
