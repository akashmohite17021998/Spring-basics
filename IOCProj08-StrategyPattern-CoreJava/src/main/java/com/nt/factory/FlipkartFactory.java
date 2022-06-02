package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courior;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {

	
	public static Flipkart getInstance(String type) {
		Courior courior = null;
		
		if(type.equalsIgnoreCase("dtdc")) {
			courior = new DTDC();
		}else if(type.equalsIgnoreCase("bluedart")) {
			courior = new BlueDart();
		}else {
			throw new IllegalArgumentException(" invalid courier type.");
		}
		
		Flipkart flk = new Flipkart();
		flk.setCourior(courior);
		return flk;
	}
}
