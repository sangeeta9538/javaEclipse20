package com.xworkz.peacock;

import com.xworkz.parrot.SwitchBoard;

public class SwitchBoardRunner {

	public static void main(String[] args) {
        SwitchBoard s = new SwitchBoard("steel",600,false);
        
        System.out.println("Before updating");
        System.out.println(s);
        System.out.println("Hash code: " + s.hashCode());

        s.type ="aluminium";        // Update properties
        s.voltageRate =650;
        s.protectionAgainstDust =true;

        System.out.println("After updating");
        System.out.println(s);
        System.out.println("Hash code: " + s.hashCode());
    }
	}


