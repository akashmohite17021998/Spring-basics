package com.nt.comp;

public class DTDC implements Courior {

	
	
	public DTDC() {
		System.out.println("DTDC.0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return oid + " order id is assigned to DTDC for delivery.";
	}

	
	
}
