package com.xworkz.parrot;

public class Ring {
	public String material;
    public int size;
    public double price;

    public Ring( String material,int size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "material is:"+material+" ,size is:"+size+" ,price is:"+ price;
    }

}


