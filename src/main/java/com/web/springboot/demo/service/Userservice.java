package com.web.springboot.demo.service;

import com.web.springboot.demo.entities.User;
import org.springframework.stereotype.Service;

@Service

public class Userservice {

    public User createUser(User user){
        User savedUser = new User(
                user.getId(),
                user.getName(),
                user.getUsername()
        );
        return savedUser;
    }
}
