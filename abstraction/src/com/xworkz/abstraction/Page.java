package com.xworkz.abstraction;

public class Page extends Bag {

	public Page(int price, int noOfZip) {
		super(price, noOfZip);
	}

	public Page(String color) {
		super(color);
		}

	@Override
	public void open() {
		System.out.println("open method in Page");
	}

	

}
