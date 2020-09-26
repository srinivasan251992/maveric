package com.maveric.spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseClass {
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("uri")
	private String uri;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	

}
