package com.dinesh.ratings.rating.microservice.controllers;

import com.dinesh.ratings.rating.microservice.entities.Rating;
import com.dinesh.ratings.rating.microservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;
    //create rating
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    //getall
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings(){
        return ResponseEntity.ok(ratingService.getAllRatings());
    }

    @GetMapping("users/{id}")
    public ResponseEntity<List<Rating>> getRatingsById(@PathVariable String id){
        return ResponseEntity.ok(ratingService.getRatingByUserId(id));
    }
    @GetMapping("hotels/{id}")
    public ResponseEntity<List<Rating>> getAllRatingsByHotelId(@PathVariable String id){
        return ResponseEntity.ok(ratingService.getRatingByHotelId(id));
    }
}
