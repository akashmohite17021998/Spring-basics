package com.nt.factory;

import com.nt.comp.AadharDetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

//Factory pattern
public class PersonFactory {
	
	//static factroy method
	public static Person getPerson(String type) {
		
		Person per = null;
		AadharDetails details = null;
		if(type.equalsIgnoreCase("emp")) {
			details = new AadharDetails(123456L, 20, 9454354L);
			per = new Employee("raja", "hyd", details, "HCL", 56788.0);
		}
		else if(type.equalsIgnoreCase("cust")) {
			details = new AadharDetails(2234216L, 21, 99215454L);
			per = new Customer("anil", "vizag", details, 1234, 9000.0);
		}
		else if(type.equalsIgnoreCase("stud")) {
			details = new AadharDetails(123456L, 22, 921154354L);
			per = new Student("ramesh", "hyd", details, "java", 12456);
		}
		else {
			throw new IllegalArgumentException("Invalid person type");
		}
		
		return per;
		
	}

}
