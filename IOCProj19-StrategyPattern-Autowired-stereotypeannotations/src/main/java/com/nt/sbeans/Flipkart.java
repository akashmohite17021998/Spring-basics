package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {

	//Has-A property
	@Autowired
//	@Qualifier("bDart")
	private Courior courior;	//field autowiring
	
	
	public Flipkart() {
		System.out.println("Flipkart.0-param constructor");
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
