package com.ani.abc.abcmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AbcMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcMicroserviceApplication.class, args);
	}

}
