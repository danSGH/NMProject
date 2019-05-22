package com.nm.products.tvseries.service;

import java.net.URL;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nm.products.tvseries.TVSeriesConstants;
import com.nm.products.tvseries.model.TVSeriesInfo;

@Service("tvSeriesService")
public class TVSeriesServiceImpl implements TVSeriesService {

	@Override
	public TVSeriesInfo getTVSeriesInfo(String title, int season) {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			URL url = new URL(TVSeriesConstants.API_HOST_URL + title + TVSeriesConstants.API_SEASON + season + 
					TVSeriesConstants.API_KEY);
			TVSeriesInfo tvSeriesInfo = mapper.readValue(url, TVSeriesInfo.class);
			if (tvSeriesInfo != null) {
				System.out.println(tvSeriesInfo.toString());
				return tvSeriesInfo;
			}
		} catch (Exception e) {
			// Improve Error Handling to include proper information to Client.
			e.printStackTrace();
		}
		return null;
	}

}
