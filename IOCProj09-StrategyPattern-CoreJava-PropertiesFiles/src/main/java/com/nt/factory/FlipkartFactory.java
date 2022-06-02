package com.nt.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comp.Courior;
import com.nt.comp.Flipkart;

public class FlipkartFactory {

	private static Properties props;
	
	static {
		
		System.out.println("FlipkartFactory.static block");
		try {
			//locate properties file through stream
			InputStream is = new FileInputStream("src/main/java/com/nt/commons/info.properties");
			
			//Load properties file content to java.util.properties class object
			props = new Properties();
			
			props.load(is);
			
		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Flipkart getInstance() throws Exception {
		
		System.out.println("FlipkartFactory.getInstance()");
		
		//get dependent class name
		String couriorClassname = props.getProperty("courior.classname");
		
		//load the dependent class
		Class c = Class.forName(couriorClassname);
		
		//create the object for loaded class
		Constructor<Courior> cons[] = c.getDeclaredConstructors();
		
		Courior courior = cons[0].newInstance();
		
		//create target class object
		Flipkart flk = new Flipkart();
		
		//assign dependent class object to target class object
		flk.setCourior(courior);
		return flk;
	}
}
