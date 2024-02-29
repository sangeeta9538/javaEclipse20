package com.xworkz.cake;

public class Pen {
public void buyPen(int price)throws PenException {
		
        if(price>0 && price<=10) {
			
			System.out.println("buy pen");
		}
		else {
			
			throw new PenException("pen price is high");
			
		}

}
}
