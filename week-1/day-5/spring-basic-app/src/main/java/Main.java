import car.Car;
import car.Driver;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        //if you need want to create object of driver
        // you need to have object car
        // which also means
        // driver object is dependent on car object

        // dependency can be satisfied in 2 ways
        // first supplying car in a constructor
        // supplying car in a setter method

        // Driver driver = new Driver(car);

        Driver driver = new Driver();
        driver.setCar(car);
    }
}
