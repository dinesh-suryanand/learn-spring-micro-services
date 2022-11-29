package com.dinesh.userservice.user.microservice.impel;

import com.dinesh.userservice.user.microservice.entities.User;
import com.dinesh.userservice.user.microservice.exceptions.ResourceNotFoundException;
import com.dinesh.userservice.user.microservice.repositories.UserRepository;
import com.dinesh.userservice.user.microservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpel implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User new_user) {
        String randomUserId = UUID.randomUUID().toString();
        new_user.setUserId(randomUserId);
        return userRepository.save(new_user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("user with given id: " + userId +" is not exists"));
    }
}
