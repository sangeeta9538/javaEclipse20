package com.xworkz.exception.mango;

public class MovieRunner {
	public static void main(String[] args) {
		
		try {
		Movie movie =new Movie();
			 System.out.println("before buying");
			 movie.buy(600);
			 System.out.println("after buying");
		}
		catch(MyException e) {
			System.out.println("message: "+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println("continue execution");
		
	
	}

}
