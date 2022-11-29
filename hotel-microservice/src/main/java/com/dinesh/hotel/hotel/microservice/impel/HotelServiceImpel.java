package com.dinesh.hotel.hotel.microservice.impel;

import com.dinesh.hotel.hotel.microservice.entity.Hotel;
import com.dinesh.hotel.hotel.microservice.exceptions.ResourceNotFoundException;
import com.dinesh.hotel.hotel.microservice.repository.HotelRepository;
import com.dinesh.hotel.hotel.microservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpel implements HotelService {
    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String randomId = UUID.randomUUID().toString();
        hotel.setHotelId(randomId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("hotel with given id is not found"));
    }
}
