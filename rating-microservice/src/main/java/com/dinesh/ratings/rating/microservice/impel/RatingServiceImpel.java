package com.dinesh.ratings.rating.microservice.impel;

import com.dinesh.ratings.rating.microservice.entities.Rating;
import com.dinesh.ratings.rating.microservice.repository.RatingRepository;
import com.dinesh.ratings.rating.microservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpel implements RatingService {

    @Autowired
    private RatingRepository repository;


    @Override
    public Rating create(Rating rating) {
        return repository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return repository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return repository.findByHotelId(hotelId);
    }
}
