package com.maveric.spring;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaverickApplicationTests {
	
	@InjectMocks
	MaverickApplication app;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testMain() {
		String[] args = {""};
		app.main(args);
	}

}
