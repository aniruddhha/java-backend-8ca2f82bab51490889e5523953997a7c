package com.weektwo.casestudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // = configuration + component scan + auto configuration
public class WeekBankRestAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeekBankRestAppApplication.class, args);
	}
}
