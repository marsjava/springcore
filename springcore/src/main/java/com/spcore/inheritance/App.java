package com.spcore.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println( "Bean Inheritance Demo!" );        
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spconfig2.xml");
        Helloworld iWorld = (Helloworld)ctx.getBean("world");
        System.out.println(iWorld.getMessage1());
        System.out.println(iWorld.getMessage2());
        
        Helloindia iIndia = (Helloindia)ctx.getBean("india");
        System.out.println(iIndia.getMessage1());
        System.out.println(iIndia.getMessage2());
        System.out.println(iIndia.getMessage3());
        
        ctx.close();
	}
}
