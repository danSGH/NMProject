package com.nm.products.tvseries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nm.products.tvseries.model.TVSeriesInfo;
import com.nm.products.tvseries.service.TVSeriesServiceImpl;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/tvseries")
public class TVSeriesController {

	 @Autowired
	private TVSeriesServiceImpl tvSeriesService;
	 
	 public TVSeriesController() {
			System.out.print("Constructor" + tvSeriesService);
		}
	
//	@GetMapping(value = "/title/{t}/season/{s}")
//	public ResponseEntity<TVSeriesInfo> getTVSeriesInfo(@PathVariable("t") String tvSeriesName, 
//			@PathVariable("s") int season) {
//		
//		System.out.println("HI");
//		
//		TVSeriesInfo tvSeriesInfo = tvSeriesService.getTVSeriesInfo(tvSeriesName, season);
//		if (tvSeriesInfo == null) {
//			return new ResponseEntity<TVSeriesInfo>(HttpStatus.NOT_FOUND);
//		} else {
//			return new ResponseEntity<TVSeriesInfo>(tvSeriesInfo, HttpStatus.OK);
//		}
//	}

}
