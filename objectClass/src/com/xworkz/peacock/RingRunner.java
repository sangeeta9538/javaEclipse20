package com.xworkz.peacock;
import com.xworkz.parrot.Ring;

public class RingRunner {
	public static void main(String[] args) {
        Ring ring = new Ring("gold",17,75000);
        
        System.out.println("Before updating");
        System.out.println(ring);
        System.out.println("Hash code: " + ring.hashCode());

        ring.material ="silver";        // Update properties
        ring.size =18;
        ring.price =25000;

        System.out.println("After updating");
        System.out.println(ring);
        System.out.println("Hash code: " + ring.hashCode());
    }
}



