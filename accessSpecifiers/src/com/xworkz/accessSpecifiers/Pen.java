package com.xworkz.accessSpecifiers;

import java.io.IOException;


public class Pen {
	public static void main(String[] args) {
		try {
			throw new IOException();
			
		}
		catch(Exception  e) {
			System.out.println(e.getMessage());
		}
	}
	}
