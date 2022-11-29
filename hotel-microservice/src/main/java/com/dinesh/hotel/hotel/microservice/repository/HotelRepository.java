package com.dinesh.hotel.hotel.microservice.repository;

import com.dinesh.hotel.hotel.microservice.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {
}
