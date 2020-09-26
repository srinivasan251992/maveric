package com.maveric.spring.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8820961581649067137L;
	
	@JsonProperty("artistName")
	public String artistName;
	
	@JsonProperty("id")
    public String id;
	
	@JsonProperty("releaseDate")
    public String releaseDate;
	
	@JsonProperty("name")
    public String name;
	
	@JsonProperty("kind")
    public String kind;
	
	@JsonProperty("copyright")
    public String copyright;
	
	@JsonProperty("artistId")
    public String artistId;
	
	@JsonProperty("artistUrl")
    public String artistUrl;
	
	@JsonProperty("artworkUrl100")
    public String artworkUrl100;
	
	@JsonProperty("genres")
    public List<Genre> genres;
	
	@JsonProperty("url")
    public String url;
	
	@JsonProperty("contentAdvisoryRating")
    public String contentAdvisoryRating;

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getArtistId() {
		return artistId;
	}

	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}

	public String getArtistUrl() {
		return artistUrl;
	}

	public void setArtistUrl(String artistUrl) {
		this.artistUrl = artistUrl;
	}

	public String getArtworkUrl100() {
		return artworkUrl100;
	}

	public void setArtworkUrl100(String artworkUrl100) {
		this.artworkUrl100 = artworkUrl100;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContentAdvisoryRating() {
		return contentAdvisoryRating;
	}

	public void setContentAdvisoryRating(String contentAdvisoryRating) {
		this.contentAdvisoryRating = contentAdvisoryRating;
	}
	
	

}
