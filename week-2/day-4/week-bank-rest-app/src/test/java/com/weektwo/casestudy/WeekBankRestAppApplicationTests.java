package com.weektwo.casestudy;

import com.weektwo.casestudy.controller.BankController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WeekBankRestAppApplicationTests {

	@Autowired
	private BankController controller;
	@Test
	void contextLoads() {
		Assertions.assertNotNull(controller);
	}
}
