package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource(value="classpath:com/nt/commons/info.properties")
public abstract class Cricketer {

	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jersyNo}")
	private int jersyNo;
	
	public Cricketer() {
		System.out.println("Cricketer.0-param constructor.");
	}
	
	public void fielding() {
		System.out.println(name + " with jersy number " + jersyNo + " is fielding.");
	}
	
	public void bowling() {
		System.out.println(name + " with jersy number " + jersyNo + " is bowling.");
	}
	
	public void wicketKeeping() {
		System.out.println(name + " with jersy number " + jersyNo + " is keeping the wicket.");
	}
	
	public void batting() {
		//create container
		CricketBat bat = getBat();
		//perform dependency lookup to get bat object(Dependent class obj)
//		CricketBat bat = ctx.getBean("bat", CricketBat.class);
//		CricketBat bat = ctx.getBean(CricketBat.class);	//this approach is only when the dependent class bean id will change then we need not to change the bean id of dependent spring bean class obj here
		
		int run = bat.scoreRuns();
		System.out.println(name + " with jersy number " + jersyNo + " has scored " + run);
	}

	@Lookup
	public abstract CricketBat getBat();
	
}
