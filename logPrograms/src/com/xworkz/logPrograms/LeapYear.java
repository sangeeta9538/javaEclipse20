package com.xworkz.logPrograms;

public class LeapYear {

	public static void main(String[] args) {
         

		        int year = 2065; // You can change this value to test different years
		        
		        if (year % 4 == 0) {
		            if (year % 100 == 0) {
		                if (year % 400 == 0) {
		                    System.out.println(year + " is a leap year.");
		                } else {
		                    System.out.println(year + " is not a leap year.");
		                }
		            } else {
		                System.out.println(year + " is a leap yearrrrr.");
		            }
		        } else {
		            System.out.println(year + " is not a leap yearrrrrr.");
		        }
		    }
		}


