package com.xworkz.override;

public class WoodWindow extends Window{
	@Override
	public void open() {
		System.out.println("open  method");
	}
	@Override
	public void close() {
		System.out.println("close window method");
	}
	public void autoClose() {
		System.out.println("auto window method");
	}
	public void breakWindow() {
		System.out.println("break window method");
	}
	
	


}
