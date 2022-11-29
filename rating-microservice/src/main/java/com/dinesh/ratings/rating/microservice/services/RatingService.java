package com.dinesh.ratings.rating.microservice.services;

import com.dinesh.ratings.rating.microservice.entities.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating create(Rating rating);

    //getall ratings
    List<Rating> getAllRatings();

    //get all by user id
    List<Rating> getRatingByUserId(String userId);

    //get all by hotel id
    List<Rating> getRatingByHotelId(String HotelId);

}
