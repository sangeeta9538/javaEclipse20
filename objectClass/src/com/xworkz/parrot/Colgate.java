package com.xworkz.parrot;

public class Colgate {
	public String flavor;
    public String weight;
    public boolean saltContent;

    public Colgate( String flavor,String weight, boolean saltContent) {
        this.flavor = flavor;
        this.weight = weight;
        this.saltContent = saltContent;
    }

    @Override
    public String toString() {
        return "flavor is:"+flavor+" ,weight is:"+weight+" ,saltContent ?:"+ saltContent;
    }

}
