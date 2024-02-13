package com.xworkz.parrot;

public class Table {
	public String shape;
    public String color;
    public int price;

    public Table( String shape,String color, int price) {
        this.shape = shape;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "shape is:"+shape+" ,color is:"+color+" ,price ?:"+ price;
    }


}
