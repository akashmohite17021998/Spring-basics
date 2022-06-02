package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements Courior {

	public DHL() {
		System.out.println("DHL.DHL()");
	}
	
	@Override
	public String deliver(int oid) {
		return oid + " order id is assigned to DHL for delivery.";
	}

}
