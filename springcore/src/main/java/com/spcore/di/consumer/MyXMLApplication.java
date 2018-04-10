package com.spcore.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;

import com.spcore.di.services.MessageService;

public class MyXMLApplication {
	@Autowired
	private MessageService service;

//	public MyXMLApplication(MessageService service) {
//		this.service = service;
//	}	
	
	public boolean processMessage(String msg, String rec) {
		return this.service.sendMessage(msg, rec);
	}

	public void setService(MessageService service) {
		this.service = service;
	}
	
}
