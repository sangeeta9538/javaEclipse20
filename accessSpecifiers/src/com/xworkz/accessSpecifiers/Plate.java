package com.xworkz.accessSpecifiers;

public class Plate {
	
      String shape;
	protected Plate(String shape) {
		this.shape=shape;

}
	protected void display(){
		System.out.println("this is display");
	}
}