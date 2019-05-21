package com.nm.products.movies.service;

import java.io.IOException;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nm.products.movies.MovieConstants;
import com.nm.products.movies.model.MovieInfo;

@Service("movieService")
public class MovieServiceImpl implements MovieService {

	@Override
	public MovieInfo getMovieInfo(String movieName) {
		// TODO Auto-generated method stub

//		URL url;
//		try {
//			url = new URL(StocksConstants.API_HOST_URL + StocksConstants.API_FUNCTION);
//			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//			conn.setRequestMethod("GET");
//			conn.setRequestProperty("Accept", "application/json");
//			if (conn.getResponseCode() != 200) {
//				throw new RuntimeException("Failed : HTTP error code : "
//						+ conn.getResponseCode());
//			}
//
//			BufferedReader br = new BufferedReader(new InputStreamReader(
//					(conn.getInputStream())));
//
//				String output;
//				System.out.println("Output from Server .... \n");
//				while ((output = br.readLine()) != null) {
//					System.out.println(output);
//				}
//
//				conn.disconnect();
//
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//

//		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
//		ClientHttpResponse response = null;
//		try {
//			ClientHttpRequest request = factory
//					.createRequest(new URI(MovieConstants.API_HOST_URL + MovieConstants.API_FUNCTION), HttpMethod.GET);
//			response = request.execute();
//
//			System.out.println(response.toString());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			response.close();
//		}

		ObjectMapper mapper = new ObjectMapper();
		try {
			URL url = new URL(MovieConstants.API_HOST_URL + movieName + MovieConstants.API_FUNCTION);
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
