package com.nt.comp;

public class BlueDart implements Courior {

	public BlueDart() {
		System.out.println("BlueDart.0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return oid + " order id is assigned to DTDC for delivery.";
	}
	
	
	
}
