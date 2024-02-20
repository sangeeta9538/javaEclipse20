package com.xworkz.equals;

public class BeltRunner {
	
	public static void main(String[] args) {
		
	
	Belt belt=new Belt();
	
    belt.brand="Zoro";
	belt.apparelMaterial="Cotton";
	belt.color="Black";
	belt.occasion="Casual";
	belt.price=250;
	belt.size='s';
	
	Belt belt1=new Belt();
	belt1.brand="Zoro";
	belt1.apparelMaterial="Cotton";
	belt1.color="Black";
	belt1.occasion="Casual";
	belt1.price=250;
	belt1.size='s';
	
	Belt belt2=new Belt();
	belt2.brand="Van Heusen";
	belt2.apparelMaterial="Rayon";
	belt2.color="White";
	belt2.occasion="Casual";
	belt2.price=200;
	belt2.size='X';
	
	boolean s1=belt.equals(belt1);
	System.out.println(s1);
	System.out.println("----------------------------");
	
	
	boolean s2=belt.equals(belt2);
	System.out.println(s2);
	System.out.println("----------------------------");
	
	
	boolean s3=belt1.equals(belt2);
	System.out.println(s3);
	System.out.println("*************************************");
	

}
}
