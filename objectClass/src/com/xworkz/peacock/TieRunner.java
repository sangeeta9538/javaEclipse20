package com.xworkz.peacock;

import com.xworkz.parrot.Tie;

public class TieRunner {
	public static void main(String[] args) {
		Tie tie = new Tie("red","59 cm",true);
       
       System.out.println("Before updating");
       System.out.println(tie);
       System.out.println("Hash code: " + tie.hashCode());

       tie.color ="green";        // Update properties
       tie.length ="60 cm";
       tie.formal =false;

       System.out.println("After updating");
       System.out.println(tie);
       System.out.println("Hash code: " + tie.hashCode());
   }
}
