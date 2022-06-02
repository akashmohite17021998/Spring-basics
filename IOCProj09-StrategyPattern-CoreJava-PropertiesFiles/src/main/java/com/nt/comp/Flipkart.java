package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

	private Courior courior;
	
	
	
	public void setCourior(Courior courior) {
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
