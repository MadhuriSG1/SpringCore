package com.bridgeit.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.bridgeit.annotation")
public class AppConfig {
	/*
	@Bean
	public Samsung getPhone()
	{
		return new Samsung();
		
	}

	@Bean
	public MobileProcessor getprocess()
	{
		return new Snapdragon();
		
	}*/
}
