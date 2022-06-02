package com.nt.comp;

public class BlueDart implements Courior {

	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}

	@Override
	public String deliver(int oid) {
		return oid + " order id is assigned to DTDC for delivery.";
	}
	
	
	
}
