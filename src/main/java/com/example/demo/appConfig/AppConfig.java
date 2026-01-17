package com.example.demo.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	@Bean
     public RestTemplate restTempletes() {
		return new RestTemplate();
	}
}
