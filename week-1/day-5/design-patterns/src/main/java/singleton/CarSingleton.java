package singleton;

public class CarSingleton {

    private static Car car;

    private CarSingleton() {
    }

    public static Car newInstance() {
        if(car == null) return car = new Car();
        return car;
    }
}
