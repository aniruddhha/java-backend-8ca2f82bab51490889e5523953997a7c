package com.ani.orm.service;

import com.ani.orm.domain.Car;
import com.ani.orm.repository.CarCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarCrudRepo repository;

    public Car saveCar(Car car) {
        return repository.save(car);
    }

    public void deleteCar(Long id) {
        repository.deleteById(id);
    }

    public List<Car> findAllCars() {
        return repository.findAll();
    }

    public Car updateCar() {

        // complete the code for updating the car
        return null;
    }
}
