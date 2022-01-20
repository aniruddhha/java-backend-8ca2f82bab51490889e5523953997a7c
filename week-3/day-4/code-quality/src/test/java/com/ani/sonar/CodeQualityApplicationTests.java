package com.ani.sonar;

import com.ani.sonar.dto.Msg;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodeQualityApplicationTests {

	@Test
	void contextLoads() {
		Msg msg = new Msg();
		Assertions.assertNotNull(msg);
	}

}
