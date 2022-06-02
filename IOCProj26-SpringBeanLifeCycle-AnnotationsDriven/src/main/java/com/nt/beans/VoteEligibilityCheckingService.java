package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voting")
@PropertySource("com/nt/commons/info.properties")
public class VoteEligibilityCheckingService {

	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
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
	
	
	//init life cycle method
	@PostConstruct
	public void myInit() {
		System.out.println("VoteEligibilityCheckingService.myInit()--@PostConstruct");
		verifiedOn = new Date();	//initialization of left over property who are not in injection
		if(name==null || age<=0)	//verification of injected values
			throw new IllegalArgumentException("Invalid inputs.");
	}
	
	//myDestroy life cycle method
	@PreDestroy
	public void myDestroy() {
		System.out.println("VoteEligibilityCheckingService.myDestroy()--@PreDestroy");
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
