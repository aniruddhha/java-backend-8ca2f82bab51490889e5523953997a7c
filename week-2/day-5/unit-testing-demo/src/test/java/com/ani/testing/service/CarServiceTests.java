package com.ani.testing.service;

import com.ani.testing.domain.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.sql.Date;

@SpringBootTest
public class CarServiceTests {

    @Autowired
    private CarServiceImpl service; // I want to create fake behaviour, I can use mocking

    @DisplayName("Service : Car Not Null")
    @Test
    public void testCarSave() {

        Car car = new Car();
        car.setCost(56.23);
        car.setId(10L);
        car.setModel("abc");
        car.setMfg(Date.valueOf("2020-10-01"));

        Car resCar = service.saveCar(car);
        Assertions.assertNotNull(resCar);
    }

    @DisplayName("Service : Car Equality")
    @Test
    public void testCarEquality() {
        Car car = new Car();
        car.setCost(56.23);
        car.setId(10L);
        car.setModel("abc");
        car.setMfg(Date.valueOf("2020-10-01"));

        Car resCar = service.saveCar(car);
        Assertions.assertEquals(car, resCar);
    }
}
