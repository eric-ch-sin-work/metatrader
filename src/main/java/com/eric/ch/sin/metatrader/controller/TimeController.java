package com.eric.ch.sin.metatrader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eric.ch.sin.metatrader.service.TimeService;

@RestController
@RequestMapping(path="/v1/time")
public class TimeController {

	@Autowired
	private TimeService timeService;

	/**
	 * Get current time 
	 * @return Return Current Time
	 * */
    @GetMapping(value="/now",  produces = "application/json; charset=UTF-8")
    public String getNow() {
    	String now = timeService.getNow();
    	return new StringBuilder("{\"currentTime\": \"")
    			.append(now)
    			.append("\"}")
    			.toString();
    }
}
