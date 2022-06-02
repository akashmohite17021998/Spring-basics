package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;
	
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.WishMessageGenerator()"+date);
		System.out.println("WishMessageGenerator.1-param constructor");
		this.date = date;
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()"+date);
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
		
	}
	
	public String generateMessage(String user) {
		
		System.out.println("WishMessageGenerator.generateMessage()"+date);
		
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
