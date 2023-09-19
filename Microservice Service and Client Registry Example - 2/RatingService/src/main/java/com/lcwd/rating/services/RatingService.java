package com.lcwd.rating.services;

import java.util.List;

import com.lcwd.rating.entities.Rating;

public interface RatingService {

	//create
	Rating create(Rating rating);
	
	// get all ratings
	List<Rating> getRatings();
	
	//getAllbyUserID
	List<Rating> getRatingByUserId(String userId);
	
	//get all by hotel
	List<Rating> getRatingByHotelId(String hotelId);
}
