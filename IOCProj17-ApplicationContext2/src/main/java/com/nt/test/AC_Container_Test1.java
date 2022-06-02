package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AC_Container_Test1 {

	public static void main(String[] args) throws Exception {
		//create Beanfactory container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/config/applicationContext.xml");
		
		
//		//get target spring bean class object
//		Flipkart fpkt = factory.getBean("fpkt", Flipkart.class);
//		Flipkart fpkt1 = factory.getBean("fpkt", Flipkart.class);
//		System.out.println(fpkt.hashCode() + " " + fpkt1.hashCode());
//		System.out.println("fpkt==fpkt? " + (fpkt==fpkt1));
//		
//		System.out.println("=============================================");
//		Printer p1 = factory.getBean("p1", Printer.class);
//		Printer p2 = factory.getBean("p2", Printer.class);
//		
//		System.out.println(p1.hashCode() + " " + p2.hashCode());
//		System.out.println("p1==p2? " + (p1==p2));
//		System.out.println("==============================================");
//		
//		String msg = fpkt.shopping(new String[] {"shirt", "trouser", "belt"}, new double[] {1000.0, 3000.0, 500.0});
//		
//		System.out.println(msg);
//		
	}
}
