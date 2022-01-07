import car.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Car car1 = (Car) context.getBean("carakfjhlskfhslhlshg");
        car1.setSpeed(100);

        Class<Car> cls = Car.class; // this is not the bytecode class file
        Car car2 = context.getBean(cls);
        System.out.println("Car Speed is "+ car2.getSpeed());

    }
}
