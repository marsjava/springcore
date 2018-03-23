package com.spcore.processor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Maven Hello world!
 * Spring Core - BeanProcessor Demo
 */
public class App {
    public static void main( String[] args )   {
        System.out.println( "Bean PostProcessor Demo!" );        
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spconfig.xml");
        WelcomeBean beanObj = (WelcomeBean)ctx.getBean("processor");
        System.out.println(beanObj.getMessage()); 
        ctx.registerShutdownHook();
        ctx.close();        
    }
}
