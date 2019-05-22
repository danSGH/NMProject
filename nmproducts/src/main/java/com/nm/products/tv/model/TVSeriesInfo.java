package com.nm.products.tv.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TVSeriesInfo {

	@JsonProperty("Title")
	private String title;
	
	@JsonProperty("Season")
	private String season;
	
	@JsonProperty("totalSeasons")
	private String totalSeasons;
	
	@JsonProperty("Episodes")
	private List<Episode> episode;
	
	@JsonProperty("Response")
	private String response;

	@JsonProperty("Title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("Title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("Season")
	public String getSeason() {
		return season;
	}

	@JsonProperty("Season")
	public void setSeason(String season) {
		this.season = season;
	}

	@JsonProperty("totalSeasons")
	public String getTotalSeasons() {
		return totalSeasons;
	}

	@JsonProperty("totalSeasons")
	public void setTotalSeasons(String totalSeasons) {
		this.totalSeasons = totalSeasons;
	}

	@JsonProperty("Episodes")
	public List<Episode> getEpisode() {
		return episode;
	}

	@JsonProperty("Episodes")
	public void setEpisode(List<Episode> episode) {
		this.episode = episode;
	}

	@JsonProperty("Response")
	public String getResponse() {
		return response;
	}

	@JsonProperty("Response")
	public void setResponse(String response) {
		this.response = response;
	}
	
}
