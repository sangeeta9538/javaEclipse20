package com.xworkz.cake;


public class Bus {
	public void buyTicket(int price)throws BusException {
		
        if(price>0 && price<=500) {
			
			System.out.println("buy ticket");
		}
		else {
			
			throw new BusException("ticket price is high");
			
		}
		

}
	
	
	
}
