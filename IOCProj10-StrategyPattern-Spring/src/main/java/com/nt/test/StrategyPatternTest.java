package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public class StrategyPatternTest {

	public static void main(String[] args) throws Exception {
		//create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/config/applicationContext.xml");
		
		//get target spring bean class object
		Flipkart fpkt = factory.getBean("fpkt", Flipkart.class);
		String msg = fpkt.shopping(new String[] {"shirt", "trouser", "belt"}, new double[] {1000.0, 3000.0, 500.0});
		
		System.out.println(msg);
		
	}
}
