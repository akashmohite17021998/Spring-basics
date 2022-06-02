package com.nt.test;

import com.nt.comp.AadharDetails;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;
import com.nt.factory.PersonFactory;

public class FactoryPatternSolutionTest {

	public static void main(String[] args) {
		
		//use factoryto create employee class object
		Person emp = PersonFactory.getPerson("emp");
		System.out.println(emp);
		
		System.out.println("========================");
		
		Person stud = PersonFactory.getPerson("stud");
		System.out.println(stud);
		
		System.out.println("========================");
		
		Person cust = PersonFactory.getPerson("cust");
		System.out.println(cust);
		
	}
	
}
