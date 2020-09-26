package com.maveric.spring.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Author implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8206558661173629757L;

	@JsonProperty("name")
	public String name;
	
	@JsonProperty("uri")
    public String uri;

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
