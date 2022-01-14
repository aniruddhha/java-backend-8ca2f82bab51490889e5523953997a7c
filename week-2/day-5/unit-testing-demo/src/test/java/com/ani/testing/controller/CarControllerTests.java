package com.ani.testing.controller;

import com.ani.testing.domain.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;
import java.time.LocalDate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CarControllerTests {

    @Autowired
    private TestRestTemplate template; // it is wrapper over http client

    @LocalServerPort
    private int port;

    @DisplayName("GET - Car - Checking Object is non null")
    @Test
    public void testGetMethod() {

        String url = "http://" + "localhost" +":" + port +"/car";

        Car car = template.getForObject( // GET method
                url,
                Car.class
        );

        Assertions.assertNotNull(car);
    }

    @DisplayName("GET - Car - Checking object content")
    @Test
    public void testObjectContent() {
        String url = "http://" + "localhost" +":" + port +"/car";
        var re = template.getForEntity(url, Car.class);
        var car = re.getBody();
        Assertions.assertEquals(car.getId(), 10 );
    }

    @DisplayName("GET - Car - Checking Status Code")
    @Test
    public void testGetStatusCode() {
        String url = "http://" + "localhost" +":" + port +"/car";
        ResponseEntity<Car> entity = template.getForEntity(url, Car.class);
        Assertions.assertEquals(
                HttpStatus.OK,
                entity.getStatusCode()
        );
    }

    @DisplayName("POST - Car - Saving Car Object")
    @Test
    public void testPostMethod() {
        String url = "http://" + "localhost" +":" + port +"/car";
        var car = new Car();
        car.setCost(56.23);
        car.setId(10L);
        car.setModel("abc");
        car.setMfg(Date.valueOf(LocalDate.now()));
        var re = template.postForEntity(
                url,
                car,
                Car.class // type information of Car -> this is skeleton of the car
        );
        Assertions.assertEquals(HttpStatus.CREATED, re.getStatusCode());
    }
}
