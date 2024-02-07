package com.xworkz.castingRunner;
import com.xworkz.castingClass.Handwash;
import com.xworkz.castingClass.Lux;
import com.xworkz.castingClass.Sanitizer;
import com.xworkz.castingClass.Soap;

public class HandwashRunner {

	public static void main(String[] args) {
		Handwash handwash=new Handwash();
		System.out.println(handwash.aroma);
	    handwash.clean();
		System.out.println("-------------------------------------");
		
		RunSanitizer runSanitizer =new RunSanitizer();
        Handwash handwash1=new Sanitizer();
		runSanitizer.runHandwash(handwash1);
		System.out.println("-------------------------------------");
		
		RunSoap runSoap=new RunSoap();
		Handwash handwash2=new Soap();
		runSoap.runHandwash(handwash2);
		System.out.println("-------------------------------------");
		
		RunLux runLux=new RunLux();
		Handwash handwash3=new Lux();
		runLux.runHandwash(handwash3);
		System.out.println("-------------------------------------");
		
		
		
		

		
		
		
		
		
		


	}

	
}
