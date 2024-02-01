package com.xworkz.table;


public class Runner {

	public static void main(String[] args) {
		Tree tree=new Tree();
		tree.noOfLeaves=1000;
		tree.treeName="orange";
		System.out.println(tree.noOfLeaves);
		System.out.println(tree.treeName);

		 tree.monkey=new Monkey();
        tree.monkey.age=5;
        System.out.println(tree.monkey.age);
        tree.monkey.type="wild";
        System.out.println(tree.monkey.type);

       Monkey monkey=new Monkey();
        monkey.biscuit=new Biscuit();
        monkey.biscuit.brand="parle";
        System.out.println(monkey.biscuit.brand);
        
        Location location=new Location();
        location.name="btm";
       System.out.println(location.name);
        location.population=500000;
        System.out.println(location.population);
        
        location.biscuit=new Biscuit();
        location.biscuit.brand="oreo";
       System.out.println(location.biscuit.brand);
       location.biscuit.cost=15;
      System.out.println(location.biscuit.cost);
        
        
		
	}

}
