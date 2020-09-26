package com.maveric.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maveric.spring.model.ResponseClass;
import com.maveric.spring.model.Root;
import com.maveric.spring.service.RetrieveService;

@RestController
@RequestMapping("iphone")
public class MavericController {
	
	@Autowired
	private RetrieveService service;

	@GetMapping("/retrieve")
	public ResponseClass retrievePost() {
		Root root = service.retrieveFields();
		ResponseClass resp = new ResponseClass();
		resp.setName(root.getFeed().getAuthor().getName());
		resp.setTitle(root.getFeed().getTitle());
		resp.setUri(root.getFeed().getAuthor().getUri());
		
		return resp;
	}
}
