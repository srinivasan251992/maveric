package com.maveric.spring.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Genre implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5323898865655191611L;
	
	@JsonProperty("genreId")
	public String genreId;
	
	@JsonProperty("name")
    public String name;
	
	@JsonProperty("url")
    public String url;

	public String getGenreId() {
		return genreId;
	}

	public void setGenreId(String genreId) {
		this.genreId = genreId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
