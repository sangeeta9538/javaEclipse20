package com.xworkz.cake;

public class PenRunner {

	public static void main(String[] args) {
     
		Pen pen =new Pen();
		System.out.println("before check");
		try 
		{
		pen.buyPen(20);
		System.out.println("after check");
		
		}
		
		catch(PenException p)
		{
			System.err.println( p.getMessage());
			
			System.out.println(p.getClass());
			
			StackTraceElement[] ste=p.getStackTrace();
			System.out.println(ste);
		}
		
		

	}
}

		


