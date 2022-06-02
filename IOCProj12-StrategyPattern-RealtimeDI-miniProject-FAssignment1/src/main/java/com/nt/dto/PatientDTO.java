package com.nt.dto;

public class PatientDTO {

	private String pname;
	private String padd;
	private Double perdaycharge;
	private Double nodays;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPadd() {
		return padd;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public Double getPerdaycharge() {
		return perdaycharge;
	}
	public void setPerdaycharge(Double perdaycharge) {
		this.perdaycharge = perdaycharge;
	}
	public Double getNodays() {
		return nodays;
	}
	public void setNodays(Double nodays) {
		this.nodays = nodays;
	}
	
}
