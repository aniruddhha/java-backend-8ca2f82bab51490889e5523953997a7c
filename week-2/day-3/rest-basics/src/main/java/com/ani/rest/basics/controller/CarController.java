package com.ani.rest.basics.controller;

import com.ani.rest.basics.domain.Car;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/car")
@RestController
public class CarController {

    @GetMapping("/hi") // GET - http://localhost:8080/car/hi
    public String sayHi() {
        return "hi";
    }

    // if you want to get something from server
    @GetMapping // GET - http://localhost:8080/car/
    public Car defaultCar() {
        var car = new Car();
        car.setFwd(true);
        car.setSpeed(100);
        car.setParts(List.of("abc", "pqr", "lmn"));
        return car;
    }

    // hey server please save new car
    @PostMapping // POST - http://localhost:8080/car/
    public Car saveCar(@RequestBody Car car) {
        var cr = new Car();
        cr.setSpeed(0);
        cr.setFwd(false);
        cr.setParts( car.getParts() );
        return  cr;
    }

    // hey server please update the existing car
    @PutMapping // PUT - http://localhost:8080/car/
    public Car updateCar(@RequestBody Car updatedCar) {
        return updatedCar;
    }

    // hey server please delete the car
    @DeleteMapping("/{carId}") // DELETE - http://localhost:8080/car/123
    public String deleteCar(@PathVariable int carId) {
        return "Car deleted successfully";
    }
}
