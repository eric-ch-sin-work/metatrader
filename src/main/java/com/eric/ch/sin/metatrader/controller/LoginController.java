package com.eric.ch.sin.metatrader.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/v1/login")
public class LoginController {

	//TODO: for authentication
    @PostMapping("login")
    public String authenticate() {
        return "{\"result\": \"success\"}";
    }
}
