package com.xworkz.instance;

public class RunAnimal {

	public static void main(String[] args) {
          
		Animal myAnimal=new Dog();
		myAnimal.name="bruno";
		System.out.println(myAnimal.name);
		myAnimal.makeNoice();
		System.out.println("--------------------------------");
		
		Dog myDog=new Dog();
		myDog.name="bruno";
		System.out.println(myDog.name);
		myDog.makeNoice();
		System.out.println("---------------------------------");
		
		Cat myCat=new Cat();
		myCat.makeNoice();
		System.out.println("---------------------------------");
		Animal myAnimal2=new Cat();
		myAnimal2.makeNoice();
		System.out.println("---------------------------------");
		
		//((Dog) myAnimal).growl()
        Dog dog=(Dog)myAnimal;
        dog.growl();
		
	}
}
