package com.spcore.di.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spcore.di.consumer.MyXMLApplication;

public class XmlClientApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spconfig2.xml");
		MyXMLApplication bean = ctx.getBean(MyXMLApplication.class);
		bean.processMessage("Hexaware", "marikannan@hexaware.com");
		ctx.close();
	}
}
