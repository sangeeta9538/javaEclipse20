package com.xworkz.balmRunner;

import com.xworkz.balmclasses.Vicks;
import com.xworkz.balmclasses.VicksInhaler;
import com.xworkz.balmclasses.ZanduBalm;

public class BalmRunner {

	public static void main(String[] args) {
		
		 CastingBalm cast=new CastingBalm();
		 ZanduBalm zandu=new ZanduBalm();
		 cast.runBalm(zandu);
	     System.out.println("-------------------------------");
	     
	     Vicks vicks=new Vicks();
	     cast.runBalm(vicks);
	     System.out.println("-------------------------------");
	     
	     VicksInhaler vicksInhaler=new VicksInhaler();
	     cast.runBalm(vicksInhaler);
	     System.out.println("-------------------------------");
	     
	     
	}

}
