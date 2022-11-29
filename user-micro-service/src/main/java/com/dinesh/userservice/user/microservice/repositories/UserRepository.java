package com.dinesh.userservice.user.microservice.repositories;

import com.dinesh.userservice.user.microservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
