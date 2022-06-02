package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {

	@Autowired
	@Qualifier("dtdc")
	private Courior courior;	//field autowiring
	
	@Autowired
	public Flipkart(@Qualifier("bDart") Courior courior) {
		System.out.println("Flipkart.0-param constructor");
	}
	
	@Autowired
	@Qualifier("dhl")
	public void assign(Courior courior) {			//arbitory method autowiring
		System.out.println("Flipkart.assign()");
		this.courior = courior;
	}

	@Autowired
	@Qualifier("fFlight")
	public void setCourior(Courior courior) {			//setter method autowiring
		System.out.println("Flipkart.setCourior()");
		this.courior = courior;
	}
	
	public String shopping(String[] items, double[] prices) {
		
		System.out.println("Flipkart.shopping()");
		
		double billAmount = 0.0;
		for(double d:prices) {
			billAmount += d;
		}
		
		int oid = new Random().nextInt(100000);
		
		String msg = courior.deliver(oid);
		
		return Arrays.toString(items) + " are purchased having billamount " + billAmount + "---->" + msg;
	}
}
