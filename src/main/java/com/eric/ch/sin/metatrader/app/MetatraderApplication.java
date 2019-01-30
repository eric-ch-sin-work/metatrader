package com.eric.ch.sin.metatrader.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.eric.ch.sin.metatrader.controller", 
		"com.eric.ch.sin.metatrader.service",
		"com.eric.ch.sin.metatrader.entity",
		"com.eric.ch.sin.metatrader.config"})
public class MetatraderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetatraderApplication.class, args);
	}
}

