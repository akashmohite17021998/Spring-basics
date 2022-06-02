package com.nt.test;

import javax.annotation.processing.Generated;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		//hold the name and location of spring bean cfg file in resource object
		FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//create beanfactory spring container(IOC container)
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		System.out.println("----------------------------");
		//get target spring bean class object injected with dependent spring bean class object
		Object object = factory.getBean("wmg");
		
		//type casting
		WishMessageGenerator generator = (WishMessageGenerator)object;
		
		System.out.println("----------------------------");
		//invoke the b.method
		String msg = generator.generateMessage("Raja");
		
		System.out.println("Wish message is : " + msg);
		System.out.println("----------------------------");
	}
}
