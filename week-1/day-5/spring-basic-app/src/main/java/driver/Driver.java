package driver;

import car.Car;

public class Driver {

    private final Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}
