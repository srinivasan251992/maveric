package com.maveric.spring.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5878005663305622842L;
	
	@JsonProperty("feed")
	 public Feed feed;

	public Feed getFeed() {
		return feed;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}
	
	

}
