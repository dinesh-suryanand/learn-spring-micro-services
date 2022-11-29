package com.dinesh.userservice.user.microservice.service;

import com.dinesh.userservice.user.microservice.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User new_user);

    List<User> getAllUsers();

    User getUserById(String id);
}
