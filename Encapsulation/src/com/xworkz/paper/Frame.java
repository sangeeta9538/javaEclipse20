package com.xworkz.paper;


public class Frame {
	private String color;
	private String material;
	private int size;
	private String finish;
	private boolean glass;
	
	public Frame(String color,String material,int size,String finish ,boolean glass) {
		this.color=color;
		this.material=material;
		this.size=size;
		this.finish=finish;
		this.glass=glass;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public boolean getGlass() {
		return glass;
	}

	public void setGlass(boolean glass) {
		this.glass = glass;
	}

	@Override
	public String toString() {
		return "Frame [color=" + color + ", material=" + material + ", size=" + size + ", finish=" + finish + ", glass="
				+ glass + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running in Frame class");
		System.out.println(this);
		if(obj!=null && obj instanceof Frame)
		{
			Frame na=(Frame)obj;
			System.out.println(na);
			if(this.color.equals(na.color) && this.material.equals(na.material)&& this.size==na.size && this.finish==na.finish && this.glass==na.glass)
			{
				return true;
			}
		}
		return false;
	}
}
