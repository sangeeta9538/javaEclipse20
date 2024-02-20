package com.xworkz.paper;


public class Basket {
	private String color;
	private String brand;
	private int cost;
	private boolean formal;
	private int noOfPockets;
	
	public Basket(String color,String brand,int cost,boolean formal ,int noOfPockets) {
		this.color=color;
		this.brand=brand;
		this.cost=cost;
		this.formal=formal;
		this.noOfPockets=noOfPockets;
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

	public boolean getFormal() {
		return formal;
	}

	public void setFormal(boolean formal) {
		this.formal = formal;
	}

	public int getNoOfPockets() {
		return noOfPockets;
	}

	public void setNoOfPockets(int noOfPockets) {
		this.noOfPockets = noOfPockets;
	}

	@Override
	public String toString() {
		return "Basket [color=" + color + ", brand=" + brand + ", cost=" + cost + ", formal=" + formal
				+ ", noOfPockets=" + noOfPockets + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running in basket class");
		System.out.println(this);
		if(obj!=null && obj instanceof Basket)
		{
			Basket ba=(Basket)obj;
			System.out.println(ba);
			if(this.color.equals(ba.color) && this.brand.equals(ba.brand)&& this.cost==ba.cost && this.formal==ba.formal && this.noOfPockets==ba.noOfPockets)
			{
				return true;
			}
		}
		return false;
	}



}
