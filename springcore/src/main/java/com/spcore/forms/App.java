package com.spcore.forms;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
		Resource res1 = new ClassPathResource("spconfig1.xml");
		BeanFactory factory1 = new XmlBeanFactory(res1);
		
		Resource res2 = new ClassPathResource("spconfig2.xml");
		BeanFactory factory2 = new XmlBeanFactory(res2, factory1);
		
		Journey j = (Journey) factory2.getBean("travelBy");
		j.startJourney();
	}
}
