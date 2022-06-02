package com.nt.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Hello world!
 *
 */
public class FactoryMethodBeanInstantiationTest 
{
    public static void main( String[] args )
    {
        
    	//Create IOC container
    	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
    	
    	//get spring bean class object
    	Class clazz = factory.getBean("c1", Class.class);
    	System.out.println("clazz object data : " + clazz.toString() + " " + clazz.getClass());
    	
    	System.out.println("-----------------------------------------");
    	Calendar cal = factory.getBean("cal", Calendar.class);
    	System.out.println("Calendar object data : " + cal.toString() + " " + cal.getClass());
    	
    	System.out.println("-----------------------------------------");
    	Properties props = factory.getBean("props", Properties.class);
    	System.out.println("Props object data : " + props.toString() + " " + props.getClass());
    	
    	System.out.println("-----------------------------------------");
    	String ss = factory.getBean("s2", String.class);
    	System.out.println("ss object data : " + ss.toString() + " " + ss.getClass());
    	
    	System.out.println("-----------------------------------------");
    	String ss1 = factory.getBean("s3", String.class);
    	System.out.println("ss1 obj data : " + ss1.toString() + " " + ss1.getClass() );
    }
}
