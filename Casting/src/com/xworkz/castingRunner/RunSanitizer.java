package com.xworkz.castingRunner;

import com.xworkz.castingClass.Handwash;
import com.xworkz.castingClass.Sanitizer;

public class RunSanitizer {

	public void runHandwash(Handwash handwash)//Soap or Sanitizer
	{
	
    //casting 
	if(handwash instanceof Sanitizer)
	{
	 Sanitizer sanitizer=(Sanitizer)handwash;
	 System.out.println(sanitizer.aroma);
     sanitizer.clean();
	 System.out.println(sanitizer.quantity);
	 sanitizer.disinfect();
	}
	
	
	}
}



