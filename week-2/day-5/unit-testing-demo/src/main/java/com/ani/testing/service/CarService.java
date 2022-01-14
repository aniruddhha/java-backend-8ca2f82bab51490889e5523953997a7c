package com.ani.testing.service;

import com.ani.testing.domain.Car;

import java.util.Optional;

public interface CarService {
    Car saveCar(Car car);

    Optional<Car> findCarById(Long id);
}
