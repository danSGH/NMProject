package com.nm.products.movies.service;

import java.net.URL;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nm.products.movies.MovieConstants;
import com.nm.products.movies.model.MovieInfo;

@Service("movieService")
public class MovieServiceImpl implements MovieService {

	@Override
	public MovieInfo getMovieInfo(String movieName) {

		ObjectMapper mapper = new ObjectMapper();
		try {
			URL url = new URL(MovieConstants.API_HOST_URL + movieName + MovieConstants.API_KEY);
			MovieInfo movieInfo = mapper.readValue(url, MovieInfo.class);
			if (movieInfo != null) {
				System.out.println(movieInfo.toString());
				return movieInfo;
			}
		} catch (Exception e) {
			// Improve Error Handling to include proper information to Client.
			e.printStackTrace();
		}

		return null;
	}

}
