package com.nm.products.tv.service;

import com.nm.products.tv.model.TVSeriesInfo;

public interface TVService {

	public TVSeriesInfo getTVSeriesInfo(String title, int season);
	
}
