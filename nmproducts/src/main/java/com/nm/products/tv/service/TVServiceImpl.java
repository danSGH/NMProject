package com.nm.products.tv.service;

import java.net.URL;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nm.products.tv.TVConstants;
import com.nm.products.tv.model.TVSeriesInfo;

@Service("tvService")
public class TVServiceImpl implements TVService {

	@Override
	public TVSeriesInfo getTVSeriesInfo(String title, int season) {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			URL url = new URL(TVConstants.API_HOST_URL + title + TVConstants.API_SEASON + season + 
					TVConstants.API_KEY);
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
