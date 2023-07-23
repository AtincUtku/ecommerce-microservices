package com.example.userservice.service;

import com.example.userservice.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
    User saveUser(User user);
    Optional<User> getUserById(UUID id);
    List<User> getAllUsers();
    void deleteUser(UUID id);
}
