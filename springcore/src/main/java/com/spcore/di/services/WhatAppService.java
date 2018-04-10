package com.spcore.di.services;

public class WhatAppService implements MessageService {

	@Override
	public boolean sendMessage(String msg, String rec) {
		System.out.println("WhatsApp Sent to "+rec+ " with Message="+msg);
		return true;
	}

}
