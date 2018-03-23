package com.spcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Maven Hello world!
 * Spring Core - Welcome message
 */
public class App {
    public static void main( String[] args )   {
        System.out.println( "Hello World!" );
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spconfig.xml");
        //WelcomeBean beanObj = (WelcomeBean)ctx.getBean("welcome");
        //System.out.println(beanObj.getMessage());
        
        @SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(WelcomeBeanConfig.class);
        WelcomeBean beanObj = ctx.getBean(WelcomeBean.class);
        beanObj.setMessage("Welcome to Spring Annotation world.");
        System.out.println(beanObj.getMessage());
        
    }
}
