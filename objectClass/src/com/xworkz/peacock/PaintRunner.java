package com.xworkz.peacock;

import com.xworkz.parrot.Paint;

public class PaintRunner {

	public static void main(String[] args) {
         Paint paint = new Paint("Red",10000,true);
        
        System.out.println("Before updating");
        System.out.println(paint);
        System.out.println("Hash code: " + paint.hashCode());

        paint.color ="green";        // Update properties
        paint.cost =11000;
        paint.goodResistance =false;

        System.out.println("After updating");
        System.out.println(paint);
        System.out.println("Hash code: " + paint.hashCode());
    }
	}


