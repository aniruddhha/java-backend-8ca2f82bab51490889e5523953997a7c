package com.ani.config;

import com.ani.car.Car;
import com.ani.driver.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy //  hey spring kindly search for all the classes which are attached with @Aspect annotation
@ComponentScan("com.ani") // hey spring you will find all beans in side given package
@Configuration
public class AppConfig {

    @Bean
    public Driver driver() {
        return new Driver();
    }
}
