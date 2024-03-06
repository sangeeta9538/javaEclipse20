package com.xworkz.abstraction;

public class AbstractRunner {

	public static void main(String[] args) {
                
		Cap cap=new Cap();
		cap.display();
		System.out.println("-----------------------------------------");
		
		Handle handle=new Handle();
		handle.move();
		handle.stop();
		System.out.println("-----------------------------------------");

	    Switch sw=new Switch();
		sw.write();
		Wire wire=new Wire();
		wire.write();
		wire.erase();
		System.out.println("-----------------------------------------");

		Page page=new Page(500, 5);
		System.out.println(page.price);
		System.out.println(page.noOfZip);
		Page p=new Page("red");
		System.out.println(p.color);
        page.open();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
