package com.maveric.spring.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

@ExtendWith(MockitoExtension.class)
public class RetrieveServiceImplTest {
	
	@InjectMocks
	RetrieveServiceImpl impl;
	
	@Mock
	RestTemplate rt;
	
	@Test
	public void testImpl() {
		impl.retrieveFields();
	}

}
