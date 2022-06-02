package com.nt.test;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.Employee;

public class PropertiesFileTest {

	public static void main(String[] args) {
		//Application context container
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//Get spring bean class object
		Employee emp = ctx.getBean("emp", Employee.class);
		
		//Display spring bean class obj
		System.out.println("emp data : " + emp);
		
		//get environment obj 
		Environment env = ctx.getEnvironment();
		
		System.out.println(env.getProperty("emp.id"));
		System.out.println("-----------------------------------------------------");
		System.out.println(System.getProperties());
		System.out.println("-----------------------------------------------------");
		Date date = ctx.getBean("dt", Date.class);
		System.out.println(date);
		
		ctx.close();
	}
	
}
