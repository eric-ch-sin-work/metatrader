package com.eric.ch.sin.metatrader.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration 
@EnableJpaRepositories("com.eric.ch.sin.metatrader.repository")
@EntityScan("com.eric.ch.sin.metatrader.entity") 
public class JPAConfig {
}