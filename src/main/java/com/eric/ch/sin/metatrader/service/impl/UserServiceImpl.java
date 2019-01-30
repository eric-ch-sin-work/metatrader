package com.eric.ch.sin.metatrader.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eric.ch.sin.metatrader.entity.User;
import com.eric.ch.sin.metatrader.repository.UserRepository;
import com.eric.ch.sin.metatrader.service.UserService;

@Service
public class UserServiceImpl implements UserService{


	@Autowired
	private UserRepository userRepository;
	

	//TODO: getting all users
	@Override
    public List<User> getAllUsers() {
		List<User> list = new ArrayList<>();
		userRepository.findAll().forEach(e -> list.add(e));
		return list;
    }
}
