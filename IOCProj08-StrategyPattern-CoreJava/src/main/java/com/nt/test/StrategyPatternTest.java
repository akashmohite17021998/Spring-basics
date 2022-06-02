package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyPatternTest {

	public static void main(String[] args) {
		Flipkart f = FlipkartFactory.getInstance("dtdc");
		String s = f.shopping(new String[] {"candles", "flowers", "cake", "wine"} , new double[] {1000.0, 2000.0, 1000.0, 3000.0});
		System.out.println(s);
	}
}
