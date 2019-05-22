package com.nm.products.tvseries.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Episode {

	@JsonProperty("Title")
	private String title;
	
	@JsonProperty("Released")
	private String released;
	
	@JsonProperty("Episode")
	private String episode;
	
	@JsonProperty("imdbRating")
	private String imdbRating;
	
	@JsonProperty("imdbID")
	private String imdbID;

	
	@JsonProperty("Title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("Title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("Released")
	public String getReleased() {
		return released;
	}

	@JsonProperty("Released")
	public void setReleased(String released) {
		this.released = released;
	}

	@JsonProperty("Episode")
	public String getEpisode() {
		return episode;
	}

	@JsonProperty("Episode")
	public void setEpisode(String episode) {
		this.episode = episode;
	}

	@JsonProperty("imdbRating")
	public String getImdbRating() {
		return imdbRating;
	}

	@JsonProperty("imdbRating")
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}

	@JsonProperty("imdbID")
	public String getImdbID() {
		return imdbID;
	}

	@JsonProperty("imdbID")
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	
}
