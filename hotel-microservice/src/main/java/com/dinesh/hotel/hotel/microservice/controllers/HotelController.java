package com.dinesh.hotel.hotel.microservice.controllers;

import com.dinesh.hotel.hotel.microservice.entity.Hotel;
import com.dinesh.hotel.hotel.microservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;
    //crate

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }
    //getsingle
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getSingle(String id){
        return ResponseEntity.ok(hotelService.get(id));
    }

    //getall
    @GetMapping
    public ResponseEntity<List<Hotel>> getAll(){
        return ResponseEntity.ok(hotelService.getAll());
    }
}
