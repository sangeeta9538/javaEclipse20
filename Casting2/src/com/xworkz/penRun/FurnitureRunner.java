package com.xworkz.penRun;

import com.xworkz.pen.Chair;
import com.xworkz.pen.Furniture;
import com.xworkz.pen.Sofa;
import com.xworkz.pen.Table;

public class FurnitureRunner {
	public static void main(String[] args) {
		
		CastFurniture cast=new CastFurniture();
		Furniture fur=new Furniture();
		fur.move();
	    System.out.println("-------------------------------");

	    Table tab=new Table();
		cast.runFurniture(tab);
	    System.out.println("-------------------------------");
	    
	    Sofa hoc=new Sofa();
		cast.runFurniture(hoc);
	    System.out.println("-------------------------------");
	    
	    Chair ch=new Chair();
	    cast.runFurniture(ch);
        System.out.println("-------------------------------");
		
	}

}
