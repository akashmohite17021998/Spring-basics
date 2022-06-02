package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalculateIntrestAmountMethodReplacer implements MethodReplacer  {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("CalculateIntrestAmountMethodReplacer.reimplement(-,-,-)(Simple intrest amount)");
		double pamt = (double)args[0];
		double rate = (double)args[1];
		double time = (double)args[2];
		double intramount = pamt*rate*time/100.0f;
		return intramount;
	}
	
}
