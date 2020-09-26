package com.maveric.spring.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Feed implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -550756302843522864L;

	@JsonProperty("title")
	public String title;
	
	@JsonProperty("id")
    public String id;
	
	@JsonProperty("author")
    public Author author;
	
	@JsonProperty("links")
    public List<Link> links;
	
	@JsonProperty("copyright")
    public String copyright;
	
	@JsonProperty("country")
    public String country;
	
	@JsonProperty("icon")
    public String icon;
	
	@JsonProperty("updated")
    public Date updated;
	
	@JsonProperty("results")
    public List<Result> results;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}
	
	
}
