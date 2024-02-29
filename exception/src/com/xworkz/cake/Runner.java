package com.xworkz.cake;

public class Runner {
	public static void main(String[] args) throws PenException {
		
	
	Bus bus = new Bus();
      Pen pen= new Pen();
	try 
	{
		System.out.println("before");

		bus.buyTicket(100);
		System.out.println("after bag check");
		
		
		
		System.out.println("before pen check");
		pen.buyPen(150);
		System.out.println("after pen check");
		
	} 
	catch (BusException | PenException  e) 
	{
        System.err.println(e.getMessage());
		
		System.err.println(e.getClass());
		
		StackTraceElement[] ste=e.getStackTrace();
		System.out.println(ste);
		
	}
	

}
}
