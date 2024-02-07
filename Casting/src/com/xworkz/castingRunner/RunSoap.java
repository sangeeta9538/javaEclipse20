package com.xworkz.castingRunner;

import com.xworkz.castingClass.Handwash;
import com.xworkz.castingClass.Soap;

public class RunSoap {

		public void runHandwash(Handwash handwash)
		{
//		System.out.println(handwash.aroma);
//		handwash.clean();
		if(handwash instanceof Soap) {
			Soap soap=(Soap)handwash;
			System.out.println(soap.aroma);
            soap.clean();
			System.out.println(soap.name);
			soap.foam();
		}

		}
}
