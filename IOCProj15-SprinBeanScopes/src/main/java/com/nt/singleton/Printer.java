package com.nt.singleton;

public class Printer {

	private static Printer INSTANCE;	//constant will be in uppercase
	
	private Printer() {
		System.out.println("Printer.0-param constructor");
	}
	
	//static factory method
	public static Printer getInstance() {
		
		if(INSTANCE==null)
			INSTANCE = new Printer();
		
		return INSTANCE;
		
	}
	
	public void message(String msg) {
		System.out.println(msg);
	}
	
}
