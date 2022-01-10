package com.ani;

import com.ani.car.Car;
import com.ani.driver.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Car car1 = (Car) context.getBean("car");

        Driver driver1 = (Driver) context.getBean("driver");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
