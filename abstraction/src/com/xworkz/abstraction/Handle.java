package com.xworkz.abstraction;

public class Handle extends Cycle {

	@Override
	public void move() {
		System.out.println("move method in handle");
	}

	@Override
	public void stop() {
		System.out.println("stop method in handle");
		
	}

}
