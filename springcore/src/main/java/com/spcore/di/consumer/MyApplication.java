package com.spcore.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spcore.di.services.MessageService;

@Component
public class MyApplication {
	//field based dependency Injection
	@Autowired
	private MessageService service;

	public void setService(MessageService service) {
		this.service = service;
	}
	public boolean processMessage(String msg, String rec) {
		return this.service.sendMessage(msg, rec);
	}
}
