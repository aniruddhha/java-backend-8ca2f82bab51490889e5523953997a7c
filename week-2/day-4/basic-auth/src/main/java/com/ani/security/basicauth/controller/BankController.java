package com.ani.security.basicauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/") // http://localhost:8080/
@RestController
public class BankController {

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/secured")
    public ResponseEntity<String> securedResource() {
        return ResponseEntity.ok("hello, I am very secured");
    }

    @GetMapping("/unsecured")
    public ResponseEntity<String> unsecuredResource() {
        return ResponseEntity.ok("hello, I am open to chat");
    }
}
