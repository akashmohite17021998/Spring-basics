package com.nt.test;

import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;

public class SpringI18nTest {

	public static void main(String[] args) {
		
		//create AC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Get messages from properties file according to the locale we submit
		Locale locale = new Locale(args[0], args[1]);
		
		String msg1 = ctx.getMessage("wish.msg", new String[] {}, locale);
		String msg2 = ctx.getMessage("bye.msg", new String[] {}, locale);
		
		System.out.println(msg1 + " " + msg2);
	}
	
}
