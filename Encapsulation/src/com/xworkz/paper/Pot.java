package com.xworkz.paper;

public class Pot {
	private String type;
	private String color;
	private int cost;
	private boolean mud;
	private int radius;
	
	public Pot(String type,String color,int cost,boolean mud ,int radius) {
		this.type=type;
		this.color=color;
		this.cost=cost;
		this.mud=mud;
		this.radius=radius;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public boolean getMud() {
		return mud;
	}

	public void setMud(boolean mud) {
		this.mud = mud;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Pot [type=" + type + ", color=" + color + ", cost=" + cost + ", mud=" + mud + ", radius=" + radius
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running in pot class");
		System.out.println(this);
		if(obj!=null && obj instanceof Pot)
		{
			Pot po=(Pot)obj;
			System.out.println(po);
			if(this.type.equals(po.type) && this.color.equals(po.color)&& this.cost==po.cost && this.mud==po.mud && this.radius==po.radius)
			{
				return true;
			}
		}
		return false;
	}

   

}
