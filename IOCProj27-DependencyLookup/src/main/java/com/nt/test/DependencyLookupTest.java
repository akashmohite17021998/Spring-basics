package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class DependencyLookupTest 
{
    public static void main( String[] args )
    {
        //create IOC container
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        
    	//get target class obj
    	Cricketer cktr = ctx.getBean("cktr", Cricketer.class);
    	
    	cktr.batting();
    	cktr.bowling();
    	cktr.fielding();
    	
    	//close the container
    	ctx.close();
    	
    }
}
