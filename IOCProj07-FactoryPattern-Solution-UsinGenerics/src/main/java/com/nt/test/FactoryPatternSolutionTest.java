package com.nt.test;

import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.factory.PersonFactoryGenerics;

public class FactoryPatternSolutionTest {

	public static void main(String[] args) {
		
		//use factoryto create employee class object
//		Person emp = PersonFactory.getPerson("emp");
//		System.out.println(emp);
//		
//		System.out.println("========================");
//		
//		Person stud = PersonFactory.getPerson("stud");
//		System.out.println(stud);
//		
//		System.out.println("========================");
//		
//		Person cust = PersonFactory.getPerson("cust");
//		System.out.println(cust);
		
		try {
			Employee emp = PersonFactoryGenerics.getPerson(Employee.class);
			System.out.println(emp);
			System.out.println(emp.sayHello("raja"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("=====================");
		try {
			Customer cust = PersonFactoryGenerics.getPerson(Customer.class);
			System.out.println(cust);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
