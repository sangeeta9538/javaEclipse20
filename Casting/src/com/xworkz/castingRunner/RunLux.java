package com.xworkz.castingRunner;

import com.xworkz.castingClass.Handwash;
import com.xworkz.castingClass.Lux;

public class RunLux {
	public void runHandwash(Handwash handwash)
	{

	if(handwash instanceof Lux) {
		Lux lux=(Lux)handwash;
		System.out.println(lux.aroma);
		lux.clean();
		System.out.println(lux.name);
        lux.foam();
		System.out.println(lux.price);
		lux.makeYoung();
	}

	}

}
