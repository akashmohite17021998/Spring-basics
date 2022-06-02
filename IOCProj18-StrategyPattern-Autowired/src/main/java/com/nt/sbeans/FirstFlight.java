package com.nt.sbeans;

public class FirstFlight implements Courior {

	public FirstFlight() {
		System.out.println("FirstFlight.0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return oid + " order id is assigned to FirstFlight for delivery.";
	}
	
}
