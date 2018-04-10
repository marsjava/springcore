package com.spcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spconfig3.xml");
		MyCollections myCollection = (MyCollections)ctx.getBean("collection");
		myCollection.getNameList();
		myCollection.getRegId();
		myCollection.getAddress();
		myCollection.getMyProps();		
	}
}
