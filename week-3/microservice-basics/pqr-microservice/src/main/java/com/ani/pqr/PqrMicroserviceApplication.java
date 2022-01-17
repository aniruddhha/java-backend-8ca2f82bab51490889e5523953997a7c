package com.ani.pqr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PqrMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PqrMicroserviceApplication.class, args);
	}

}
