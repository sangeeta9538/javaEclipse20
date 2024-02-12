package com.xworkz.instance;

public class Casting {
	
	
	
	public void doAnimalStuff(Animal animal) {
		
		//animal.makeNoice();
		
		if(animal instanceof Dog) {
		Dog dog=(Dog)animal;
		dog.growl();
		
		
	}else if(animal instanceof Cat){
		Cat myCat=(Cat)animal;
		myCat.makeNoice();
		
		
	}

}
}

