package com.spcore.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Maven Hello world!
 * Spring Core - Welcome message
 */
public class App {
    public static void main( String[] args )   {
        System.out.println( "Singleton Scope Demo!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spconfig.xml");
        WelcomeBean beanObj1 = (WelcomeBean)ctx.getBean("single");
        beanObj1.setMessage("Welcome to Singleton bean representation.");
        System.out.println(beanObj1.getMessage());  
        
        WelcomeBean beanObj2 = (WelcomeBean)ctx.getBean("single");
        //beanObj1.setMessage("Welcome to Singleton bean representation.");
        System.out.println(beanObj2.getMessage());
        
        System.out.println( "\nPrototype Scope Demo!" );
        WelcomeBean beanObj3 = (WelcomeBean)ctx.getBean("proto");
        beanObj3.setMessage("Welcome to Prototype bean representation.");
        System.out.println(beanObj3.getMessage());  
        
        WelcomeBean beanObj4 = (WelcomeBean)ctx.getBean("proto");
        //beanObj1.setMessage("Welcome to Singleton bean representation.");
        System.out.println(beanObj4.getMessage());
    }
}
