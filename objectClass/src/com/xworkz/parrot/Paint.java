package com.xworkz.parrot;

public class Paint {
	public String color;
    public int cost;
    public boolean goodResistance;

    public Paint( String color,int cost, boolean goodResistance) {
        this.color = color;
        this.cost = cost;
        this.goodResistance = goodResistance;
    }

    @Override
    public String toString() {
        return "color is:"+color+" ,cost is:"+cost+" ,good resistance ?:"+ goodResistance;
    }

}
