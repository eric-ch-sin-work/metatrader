package com.eric.ch.sin.metatrader.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eric.ch.sin.metatrader.entity.User;

@RestController
@RequestMapping(path="/v1/users")
public class UserController {


	//TODO: getting all users
    @GetMapping("")
    public List<User> getAllUsers() {
    	List<User> users = new ArrayList<User>();
    	for (int i = 0; i < 10; i++) { 
	        User user = new User();
	        users.add(user);
        }
        return users;
    }
}
