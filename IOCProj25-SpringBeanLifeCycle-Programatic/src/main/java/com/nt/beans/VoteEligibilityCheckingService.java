package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoteEligibilityCheckingService implements InitializingBean, DisposableBean {

	private String name;
	private int age;
	private Date verifiedOn;
	
	public VoteEligibilityCheckingService() {
		System.out.println("VoteEligibilityCheckingService.0-param constructor.");
	}
	
	public void setName(String name) {
		System.out.println("VoteEligibilityCheckingService.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VoteEligibilityCheckingService.setAge()");
		this.age = age;
	}
	
	//afterPropertiesSet init life cycle method
	@Override
	public void afterPropertiesSet() {
		System.out.println("VoteEligibilityCheckingService.afterPropertiesSet()");
		verifiedOn = new Date();	//initialization of left over property who are not in injection
		if(name==null || age<=0)	//verification of injected values
			throw new IllegalArgumentException("Invalid inputs.");
	}
	
	//destroy life cycle method
	@Override
	public void destroy() {
		System.out.println("VoteEligibilityCheckingService.destroy()");
		name=null;
		age=0;
		verifiedOn=null;
	}
	
	//b.method
	public String checkVotingEligibility() {
		System.out.println("VoteEligibilityCheckingService.checkVotingEligibility()" + verifiedOn);
		if(age>=18)
			return "Mr./Miss./Mrs. " + name + " you are eligible for voting.";
		else
			return "Master. " + name + " you are not eligible for voting.";
	}
	
}
