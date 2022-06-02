package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoteEligibilityCheckingService;

public class BeanlifeCycleTest 
{
    public static void main( String[] args )
    {
    	
    	//create application context container
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	
    	//get spring bean object
    	VoteEligibilityCheckingService vote = ctx.getBean("voting", VoteEligibilityCheckingService.class);
    	System.out.println(vote.checkVotingEligibility());
    	
    	//close container
    	ctx.close();
    }
}
