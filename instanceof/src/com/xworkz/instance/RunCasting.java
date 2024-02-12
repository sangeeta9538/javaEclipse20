package com.xworkz.instance;

public class RunCasting {

	public static void main(String[] args) {
		
		Casting cast=new Casting();
		Dog myDog=new Dog();
		cast.doAnimalStuff(myDog);
		System.out.println("--------------------------");
		
		Cat myCat=new Cat();
		cast.doAnimalStuff(myCat);
		

	}

}
