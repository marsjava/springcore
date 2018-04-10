package com.spcore.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spcore.di.configure.DIConfiguration;
import com.spcore.di.consumer.MyApplication;

public class AnnotationClientApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = ctx.getBean(MyApplication.class);
		app.processMessage("Hexavarsity", "marikannan@hexaware.com");
		ctx.close();
	}
}
