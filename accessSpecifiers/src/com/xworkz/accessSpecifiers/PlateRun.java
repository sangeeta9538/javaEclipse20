package com.xworkz.accessSpecifiers;

public class PlateRun {

	public static void main(String[] args) {
		Plate plate=new Plate("round"); //protected
        System.out.println(plate.shape);
        plate.display();

	}

}
