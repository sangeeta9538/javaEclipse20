package com.xworkz.peacock;

import com.xworkz.parrot.Battery;

public class BatteryRunner {
public static void main(String[] args) {
	
         Battery b = new Battery("2 years","lithium",true);
	        System.out.println("Before updating");
	        System.out.println(b);
	        System.out.println("Hash code: " + b.hashCode());

	        b.lifeCycle ="3 years";        // Update properties
	        b.type ="lithium polymer";
	        b.selfRecharge =false;

	        System.out.println("After updating");
	        System.out.println(b);
	        System.out.println("Hash code: " + b.hashCode());
	}
}

