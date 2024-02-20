package com.xworkz.logPrograms;

public class GreatestOfThree {

	public static void main(String[] args) {
       
		int a=40,b=60,c=30;
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("c is greater");
			}
		}
		else if(b>c) {
			System.out.println("b is gteater");
		}
		else {
			System.out.println("c is greater");
		}
		
				
	}

}
