package com.dinesh.hotel.hotel.microservice.service;

import com.dinesh.hotel.hotel.microservice.entity.Hotel;

import java.util.List;

public interface HotelService {
    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel get(String id);
}
