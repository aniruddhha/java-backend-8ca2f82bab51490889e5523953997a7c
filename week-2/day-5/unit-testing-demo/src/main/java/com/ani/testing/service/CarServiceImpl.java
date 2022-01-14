package com.ani.testing.service;

import com.ani.testing.domain.Car;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService{
    @Override
    public Car saveCar(Car car) {

        return car;
    }
}
