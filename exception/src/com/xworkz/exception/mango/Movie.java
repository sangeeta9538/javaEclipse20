package com.xworkz.exception.mango;

public class Movie {
	
	public void buy(int ticketPrice) throws MyException {
		
		if(ticketPrice>0 && ticketPrice<=500) {
			
			System.out.println("buy ticket");
		}
		else {
			
			throw new MyException("ticket price is high");
			
		}
		
		
		
		
		
		
	}

}
