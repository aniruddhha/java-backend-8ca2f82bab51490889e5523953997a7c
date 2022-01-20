package com.ani.rest.basics;

import com.ani.rest.basics.controller.CarController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestBasicsApplicationTests {

	@Autowired
	private CarController controller;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(controller);
	}
}
