package com.xworkz.balmRunner;

import com.xworkz.balmclasses.Balm;
import com.xworkz.balmclasses.Vicks;
import com.xworkz.balmclasses.VicksInhaler;
import com.xworkz.balmclasses.ZanduBalm;

public class CastingBalm {
	
	public void runBalm(Balm balm)    //zandu or vicks
	{   
		System.out.println(balm.price);
		balm.aroma();
		System.out.println("----------------------------");
		
		
		if (balm instanceof ZanduBalm) {
			
			ZanduBalm zandu=(ZanduBalm)balm;
			System.out.println(zandu.price);
			zandu.aroma();
			System.out.println(zandu.color);
			zandu.painRelief();
			
		}
		else if(balm instanceof Vicks){
			Vicks vicks=(Vicks)balm;
			System.out.println(vicks.price);
			vicks.aroma();
			System.out.println(vicks.quantity);
			vicks.inflammate();
			
			if(balm instanceof VicksInhaler) {
				
			VicksInhaler vicksInhaler=(VicksInhaler)balm;
//			System.out.println(vicksInhaler.price);
//			vicksInhaler.aroma();
//			System.out.println(vicksInhaler.quantity);
//			vicksInhaler.inflammate();
			System.out.println(vicksInhaler.madeIn);
			vicksInhaler.cooling();
			
			
			}
			
			
			
		}
	}

}
