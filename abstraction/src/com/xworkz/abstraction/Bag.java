package com.xworkz.abstraction;

public abstract class Bag {
	public String color;
	public int price;
	public int noOfZip;
	
	public Bag(String color) {
		this.color=color;
		
		//System.out.println("default constructor...");
	}
	 public Bag(int price,int noOfZip) {
		 this.price=price;
		 this.noOfZip=noOfZip;
	 }
	 
       public abstract void open();
}
