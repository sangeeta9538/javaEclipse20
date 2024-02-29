package com.xworkz.cake;

public class BusRunner {

	public static void main(String[] args) {
           Bus bus =new Bus();
           Pen pen =new Pen();
           try {
        	System.out.println("before");

       		bus.buyTicket(600);
       		System.out.println("after bag check");
       		
       		System.out.println("before pen check");
       		pen.buyPen(150);
       		System.out.println("after pen check");
           }
           
           catch(BusException  e) 
       	{
            System.err.println(e.getMessage());
       		
       		System.err.println(e.getClass());
       		
       		
       	}
           
           catch(PenException  p) 
          	{
                  System.err.println(p.getMessage());
          		
          		System.err.println(p.getClass());
          		
         	}
           
        	   
           
	}

}
