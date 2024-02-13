package com.xworkz.peacock;

import com.xworkz.parrot.Colgate;

public class ColgateRunner {
	public static void main(String[] args) {
		Colgate col = new Colgate("mint","100 gm",true);
       
       System.out.println("Before updating");
       System.out.println(col);
       System.out.println("Hash code: " + col.hashCode());

       col.flavor ="green";        // Update properties
       col.weight ="cinamin";
       col.saltContent =false;

       System.out.println("After updating");
       System.out.println(col);
       System.out.println("Hash code: " + col.hashCode());
   }

}
