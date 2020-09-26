package com.maveric.spring.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.maveric.spring.model.Author;
import com.maveric.spring.model.Feed;
import com.maveric.spring.model.Root;
import com.maveric.spring.service.RetrieveService;

@SpringBootTest
class MavericControllerTest {
	
	@InjectMocks
	MavericController controller;
	
	@Mock
	private RetrieveService service;

	@Test
	void testController() {
		Root root = new Root();
		Feed feed = new Feed();
		Author author = new Author();
		author.setName("");
		author.setUri("");
		feed.setTitle("");
		feed.setAuthor(author);
		root.setFeed(feed);
		Mockito.when(service.retrieveFields()).thenReturn(root);
		controller.retrievePost();
	}
}
