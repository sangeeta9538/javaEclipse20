package com.xworkz.paper;


public class Nailpolish {
	private String color;
	private String brand;
	private int cost;
	private boolean shine;
	private int durability;
	
	public Nailpolish(String color,String brand,int cost,boolean shine ,int durability) {
		this.color=color;
		this.brand=brand;
		this.cost=cost;
		this.shine=shine;
		this.durability=durability;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public boolean getShine() {
		return shine;
	}

	public void setShine(boolean shine) {
		this.shine = shine;
	}

	public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability = durability;
	}
	@Override
	public String toString() {
		return "Nailpolish [color=" + color + ", brand=" + brand + ", cost=" + cost + ", shine=" + shine
				+ ", durability=" + durability + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running in nailpolish class");
		System.out.println(this);
		if(obj!=null && obj instanceof Nailpolish)
		{
			Nailpolish na=(Nailpolish)obj;
			System.out.println(na);
			if(this.color.equals(na.color) && this.brand.equals(na.brand)&& this.cost==na.cost && this.shine==na.shine && this.durability==na.durability)
			{
				return true;
			}
		}
		return false;
	}
	

}
