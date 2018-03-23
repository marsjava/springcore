package com.spcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Maven Hello world!
 * Spring Core - Impl. Life cycle method
 */
public class App {
    public static void main( String[] args )   {
        System.out.println( "Hello World!" );        
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spconfig.xml");
        WelcomeBean beanObj = (WelcomeBean)ctx.getBean("lifecycle");
        System.out.println(beanObj.getMessage()); 
        ctx.registerShutdownHook();
        ctx.close();        
    }
}
