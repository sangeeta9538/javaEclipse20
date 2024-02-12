package com.xworkz.instance;

	class Test {
		// main function
		public static void main(String[] args)
		{
			Parent pobj = new Child();
			if (pobj instanceof Object)
				System.out.println("pobj is instance of Child");
			else
				System.out.println(
					"pobj is NOT instance of Child");
			
		}

}
