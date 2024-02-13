package com.xworkz.tree;

import com.xworkz.seed.Hockey;
import com.xworkz.seed.IceHockey;
import com.xworkz.seed.MobileIceHockey;
import com.xworkz.seed.Outdoor;
import com.xworkz.seed.Sport;

public class CastingSport {
	public void runSport(Sport sport)   	{   
	
	sport.playing();        
		
	if (sport instanceof Outdoor) {
		Outdoor hoc=(Outdoor)sport;
		hoc.training();
		
			
			if(sport instanceof Hockey) {
				
			Hockey out=(Hockey)sport;
			out.competing();
			
			 if(sport instanceof IceHockey) {
				
				IceHockey ice=(IceHockey)sport;
				ice.organizing();
				
				if(sport instanceof MobileIceHockey) {
					
					MobileIceHockey mob=(MobileIceHockey)sport;
					mob.promoting();
			
			
			
			
			}
			
			
			
		}
	}

	}
	
}
}