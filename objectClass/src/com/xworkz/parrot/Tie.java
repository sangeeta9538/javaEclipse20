package com.xworkz.parrot;

public class Tie {
	public String color;
    public String length;
    public boolean formal;

    public Tie( String color,String length, boolean formal) {
        this.color = color;
        this.length = length;
        this.formal = formal;
    }

    @Override
    public String toString() {
        return "color is:"+color+" ,length is:"+length+" ,formal?:"+ formal;
    }


}
