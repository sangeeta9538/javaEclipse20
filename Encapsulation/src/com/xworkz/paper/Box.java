package com.xworkz.paper;

public class Box {
	private String material;
	private String shape;
	private int length;
	private int breadth;
	private String color;
	
	public Box(String material,String shape, int length,int breadth,String color){
		this.material=material;
		this.shape=shape;
		this.length=length;
		this.breadth=breadth;
		this.color=color;
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Box [material=" + material + ", shape=" + shape + ", length=" + length + ", breadth=" + breadth
				+ ", color=" + color + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running in box class");
		System.out.println(this);
		if(obj!=null && obj instanceof Box)
		{
			Box box=(Box)obj;
			System.out.println(box);
			if(this.material.equals(box.material) && this.shape.equals(box.shape)&& this.length==box.length && this.breadth==box.breadth && this.color.equals(box.color))
			{
				return true;
			}
		}
		return false;
	}

	

	

}
