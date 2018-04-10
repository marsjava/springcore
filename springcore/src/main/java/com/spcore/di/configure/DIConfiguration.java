package com.spcore.di.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spcore.di.services.EmailService;
import com.spcore.di.services.MessageService;

@Configuration
@ComponentScan(value= {"com.spcore.di.consumer"})
public class DIConfiguration {
	@Bean
	public MessageService getMessageService() {
		return new EmailService();
	}
}
