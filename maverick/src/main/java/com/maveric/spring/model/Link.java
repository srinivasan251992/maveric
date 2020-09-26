package com.maveric.spring.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Link implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4003535965433529930L;
	
	@JsonProperty("self")
	public String self;
	
	@JsonProperty("alternate")
    public String alternate;

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public String getAlternate() {
		return alternate;
	}

	public void setAlternate(String alternate) {
		this.alternate = alternate;
	}

	
}
