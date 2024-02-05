package com.xworkz.overriderunner;

import com.xworkz.override.CannonPrinter;
import com.xworkz.override.Printer;
import com.xworkz.override.SmartCannonPrinter;


public class PrinterRunnerr {

	public static void main(String[] args) {
		
		CannonPrinter cannonPrinter=new CannonPrinter();
		cannonPrinter.print();
		cannonPrinter.scan();
		cannonPrinter.copy();
		cannonPrinter.connectToWifi();
		System.out.println("---------------------------------");
		
		Printer printer=new CannonPrinter();
		printer.print();
		printer.scan();
		printer.copy();
		System.out.println("---------------------------------------");
		
		SmartCannonPrinter smartCannonPrinter=new SmartCannonPrinter();
		smartCannonPrinter.print();
		smartCannonPrinter.scan();
		smartCannonPrinter.copy();
		smartCannonPrinter.connectToWifi();
		smartCannonPrinter.connetToMobile();
		System.out.println("---------------------------------------");
		
		CannonPrinter cannonPrinter1=new SmartCannonPrinter();
		cannonPrinter1.print();
		cannonPrinter1.scan();
		cannonPrinter1.copy();
		cannonPrinter1.connectToWifi();
		System.out.println("-----------------------------------------");
		
		Printer printer1=new SmartCannonPrinter();
		printer1.print();
		printer1.scan();
		printer1.copy();
		System.out.println("---------------------------------------");
		
		SmartCannonPrinter smart=(SmartCannonPrinter)cannonPrinter1;
		smart.connetToMobile();
		
		CannonPrinter cannon=(CannonPrinter)printer;
		cannon.connectToWifi();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		


		
		
		
		
		
		

	}

}
