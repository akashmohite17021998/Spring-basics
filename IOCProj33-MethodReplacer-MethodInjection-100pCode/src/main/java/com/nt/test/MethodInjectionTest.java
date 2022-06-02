package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.BankService;

/**
 * Hello world!
 *
 */
public class MethodInjectionTest 
{
    public static void main( String[] args )
    {
        //create container
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	//get target class
    	BankService service = ctx.getBean("bankService", BankService.class);
    	
    	//invoke b.method
    	double intrAmt = service.calculateIntrestAmount(100000, 2, 12);
    	System.out.println("Interest amount is : " + intrAmt);
    	
    	//close the container
    	ctx.close();
    }
}
