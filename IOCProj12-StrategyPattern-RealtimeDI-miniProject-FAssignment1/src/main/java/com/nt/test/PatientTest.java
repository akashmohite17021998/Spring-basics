package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.PatientController;
import com.nt.vo.PatientVO;

/**
 * Hello world!
 *
 */
public class PatientTest 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        
        String name = null, add = null, perdaycharge = null, nodays = null;
        
        if(sc!=null) {
        	
        	System.out.println("Enter Patient name : ");
        	name = sc.next();
        	
        	System.out.println("Enter Patient address : ");
        	add = sc.next();
        	
        	System.out.println("Enter charges per day : ");
        	perdaycharge = sc.next();
        	
        	System.out.println("Enter Patient staying number of days : ");
        	nodays = sc.next();
        		
        }
        
        PatientVO vo = new PatientVO();
        
        vo.setPname(name);
    	vo.setPadd(add);
    	vo.setPerdaycharge(perdaycharge);
    	vo.setNodays(nodays);
        
    	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
    	PatientController p = factory.getBean("pController", PatientController.class);
    	try {
			System.out.println(p.processCustomer(vo));
			
		} catch (Exception e) {
			
			System.out.println("Problem in customer registration : " + e.getMessage());
			e.printStackTrace();
			
		}
    	
    }
}
