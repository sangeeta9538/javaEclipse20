package com.xworkz.instance;

public class Animal {
	String name;
	public void makeNoice() {
		System.out.println("im just an animal");
	}

}
class Dog extends Animal{
	@Override
	public void makeNoice() {
		System.out.println("woof woof");
	}
	public void growl() {
		System.out.println("grrrrrr");
	}
}
class Cat extends Animal{
	public void makeNoice() {
		System.out.println("meow");
	}

	
}
