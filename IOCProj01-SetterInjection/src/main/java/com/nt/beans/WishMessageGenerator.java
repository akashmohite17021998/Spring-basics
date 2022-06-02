package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.0-param constructor");
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	
	public String generateMessage(String user) {
		
		System.out.println("WishMessageGenerator.generateMessage()");
		
		int hour = date.getHours();
		
		if(hour<12) {
			return "Good Morning : "+ user;
		}
		
		else if(hour<16) {
			return "Good Afternon : "+ user;
		}
		
		else if(hour<20) {
			return "Good evening : "+ user;
		}
		
		else {
			return "Good night : "+ user;
		}
		
	}
	
}
