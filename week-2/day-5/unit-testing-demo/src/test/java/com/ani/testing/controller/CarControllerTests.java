package com.ani.testing.controller;

import com.ani.testing.domain.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CarControllerTests {

    @Autowired
    private TestRestTemplate template;

    @LocalServerPort
    private int port;

    @Test
    public void testGetMethod() {
        var builder = new StringBuilder();
        Car car = template.getForObject(
                "http://localhost:8080/car",
                Car.class
        );

        Assertions.assertNotNull(car);
    }
}
