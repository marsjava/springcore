package com.spcore.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WelcomeBeanConfig {
	@Bean
	public WelcomeBean welcomeBean() {
		return new WelcomeBean();
	}
}
