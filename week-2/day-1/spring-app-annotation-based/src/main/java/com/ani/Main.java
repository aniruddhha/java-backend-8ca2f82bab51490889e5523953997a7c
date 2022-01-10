package com.ani;

import com.ani.car.Bwm;
import com.ani.car.Car;
import com.ani.config.AppConfig;
import com.ani.driver.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // hey spring - i have written beans configuration in AppConfig class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car1 = (Car) context.getBean("car");
        car1.speedUp();

        Bwm bmw = context.getBean(Bwm.class);
        bmw.openWindow();

        Driver driver1 = (Driver) context.getBean("driver");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
