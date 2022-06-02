package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

/**
 * Hello world!
 *
 */
public class JavaConfigAppTest 
{
    public static void main( String[] args )
    {
       //create IOC container
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
    	
    	String result = generator.generateWishMessage("Raja");
    	
    	System.out.println("Result is : " + result);
    	
    	ctx.close();
    }
}
