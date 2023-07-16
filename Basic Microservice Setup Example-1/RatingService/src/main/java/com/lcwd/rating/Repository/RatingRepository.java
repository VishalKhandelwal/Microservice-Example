package com.lcwd.rating.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lcwd.rating.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {

	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);
	
}
