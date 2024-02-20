package com.xworkz.logPrograms;

public class GrandParent {
	    public void Print() {
	        System.out.println("Grandparent's Print()");
	    }
	}
	 
	class Parent extends GrandParent {
	    public void Print1() {
//	    	super.Print();  
	        System.out.println("Parent's Print()");
	    }
	}
	 
	class Child extends Parent {
	    public void Print2() {
//	        super.Print();  
	        System.out.println("Child's Print()");
	    }
	}
	 
	
	


