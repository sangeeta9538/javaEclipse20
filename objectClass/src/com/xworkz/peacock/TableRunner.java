package com.xworkz.peacock;

import com.xworkz.parrot.Table;

public class TableRunner {
	public static void main(String[] args) {
		Table tab = new Table("square","Red",1000);
       
       System.out.println("Before updating");
       System.out.println(tab);
       System.out.println("Hash code: " + tab.hashCode());

       tab.shape ="round";        // Update properties
       tab.color ="blue";
       tab.price =200;

       System.out.println("After updating");
       System.out.println(tab);
       System.out.println("Hash code: " + tab.hashCode());
   }

}
