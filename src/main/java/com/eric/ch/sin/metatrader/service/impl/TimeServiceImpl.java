
package com.eric.ch.sin.metatrader.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.stereotype.Service;

import com.eric.ch.sin.metatrader.service.TimeService;

@Service
public class TimeServiceImpl implements TimeService{

	/**
	 * Get current time 
	 * @return Return Current Time
	 * */
	@Override
	public String getNow() {
    	Date now = new Date();
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss+08:00");
    	format.setTimeZone(TimeZone.getTimeZone("UTC+8"));
    	String timestamp = format.format(now);
		return timestamp;
	}
}
