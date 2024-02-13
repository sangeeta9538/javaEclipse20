package com.xworkz.tree;

import com.xworkz.seed.Hockey;
import com.xworkz.seed.IceHockey;
import com.xworkz.seed.MobileIceHockey;
import com.xworkz.seed.Outdoor;
import com.xworkz.seed.Sport;

public class SportRunner {
	public static void main(String[] args) {
		
		CastingSport cast=new CastingSport();
		Sport sp=new Sport();
		sp.playing();
	    System.out.println("-------------------------------");

	    Outdoor out=new Outdoor();
		cast.runSport(out);
	    System.out.println("-------------------------------");
	    
	    Hockey hoc=new Hockey();
		cast.runSport(hoc);
	    System.out.println("-------------------------------");
	    
	    IceHockey ice=new IceHockey();
	    cast.runSport(ice);
        System.out.println("-------------------------------");
	    
        MobileIceHockey mob=new MobileIceHockey();
	    cast.runSport(mob);
        System.out.println("-------------------------------");
	    

	   
	}
}
