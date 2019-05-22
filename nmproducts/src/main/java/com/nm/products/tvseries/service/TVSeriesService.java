package com.nm.products.tvseries.service;

import com.nm.products.tvseries.model.TVSeriesInfo;

public interface TVSeriesService {

	public TVSeriesInfo getTVSeriesInfo(String title, int season);
	
}
