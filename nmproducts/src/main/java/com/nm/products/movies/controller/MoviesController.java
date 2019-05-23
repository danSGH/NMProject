package com.nm.products.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nm.products.movies.model.MovieInfo;
import com.nm.products.movies.service.MovieServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/movies")
public class MoviesController {
	
	@Autowired
	private MovieServiceImpl movieService;
	

	public MoviesController() {
		System.out.print("Constructor");
	}
	
	@GetMapping(value = "/title/{t}")
	public ResponseEntity<MovieInfo> getMovieInfo(@PathVariable("t") String movieName) {
		
		System.out.println("HI");
		
		MovieInfo movieInfo = movieService.getMovieInfo(movieName);
		if (movieInfo == null) {
			return new ResponseEntity<MovieInfo>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<MovieInfo>(movieInfo, HttpStatus.OK);
		}
	}

}
