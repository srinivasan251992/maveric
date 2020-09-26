package com.maveric.spring.model;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.OffsetDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.google.code.beanmatchers.BeanMatchers;
import com.google.code.beanmatchers.ValueGenerator;

public class ResponseClassTest {
	@BeforeEach
	public void setup() {
		BeanMatchers.registerValueGenerator(new ValueGenerator<OffsetDateTime>() {
			public OffsetDateTime generate() {
				return OffsetDateTime.now();
			}
		}, OffsetDateTime.class);
	}
	
	@Test
	public void testResponseClass() {
		assertThat(ResponseClass.class, allOf(BeanMatchers.hasValidGettersAndSetters()));
	}
}
