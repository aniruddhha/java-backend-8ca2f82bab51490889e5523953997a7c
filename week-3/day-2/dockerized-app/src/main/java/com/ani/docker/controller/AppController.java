package com.ani.docker.controller;

import com.ani.docker.domain.App;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RequestMapping("/app")
@RestController
public class AppController {

    @GetMapping
    public ResponseEntity<App> get() {
        return ResponseEntity.ok(
                new App(
                        1234L,
                        1,
                        "abc",
                        LocalDate.of(2021,1,1),
                        true
                )
        );
    }
}
