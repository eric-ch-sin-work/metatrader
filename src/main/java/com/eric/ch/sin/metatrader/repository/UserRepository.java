package com.eric.ch.sin.metatrader.repository;

import org.springframework.data.repository.CrudRepository;

import com.eric.ch.sin.metatrader.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}

