package car;

public class Driver {

    //    private final Car car;

    /*public Driver(Car car) { // constructor injection
        this.car = car;
    }*/

    private Car car;

    public void setCar(Car car) { // setter injection
        this.car = car;
    }
}
