package com.xworkz.detergenrunner;

import com.xworks.detergentex.Detergent;
import com.xworks.detergentex.LiquidDetergent;
import com.xworks.detergentex.PowderDetergent;
import com.xworks.detergentex.TabletDetergent;

public class DetergentRunner {

	public static void main(String[] args) {
		Detergent detergent=new Detergent();
		detergent.clean();
		detergent.whiten();
		detergent.deodorize();
		System.out.println("---------------------------------------");
		
		PowderDetergent powderDetergent=new PowderDetergent();
		powderDetergent.clean();
		powderDetergent.whiten();
		powderDetergent.deodorize();
		powderDetergent.disinfect();
		System.out.println("---------------------------------------");

		
		Detergent deter=new PowderDetergent();
		deter.clean();
		deter.whiten();
		deter.deodorize();
		PowderDetergent powder=(PowderDetergent)deter;
		powder.disinfect();
	    System.out.println("------------------------------------------------");
	    
	    LiquidDetergent liquidDetergent=new LiquidDetergent();
	    liquidDetergent.clean();
	    liquidDetergent.whiten();
	    liquidDetergent.deodorize();
	    liquidDetergent.disinfect();
	    liquidDetergent.brighten();
		System.out.println("---------------------------------------");

	    
	    PowderDetergent pow=new LiquidDetergent();
	    pow.clean();
	    pow.whiten();
	    pow.deodorize();
	    pow.disinfect();
	    LiquidDetergent liquid=(LiquidDetergent)pow;
	    liquid.disinfect();
		System.out.println("---------------------------------------");

	    
	    Detergent deter1=new LiquidDetergent();
	    deter1.clean();
	    deter1.whiten();
	    deter1.deodorize();
	    LiquidDetergent liquid1=(LiquidDetergent)deter1;
	    liquid1.disinfect();
	    liquid1.brighten();
	    System.out.println("-----------------------------------------------------------");
	    
	    TabletDetergent tabletDetergent=new TabletDetergent();
	    tabletDetergent.clean();
	    tabletDetergent.whiten();
	    tabletDetergent.deodorize();
	    tabletDetergent.disinfect();
	    tabletDetergent.brighten();
	    tabletDetergent.soften();
		System.out.println("---------------------------------------");

	    
	    LiquidDetergent liquid2=new TabletDetergent();
	    liquid2.clean();
	    liquid2.whiten();
	    liquid2.deodorize();
	    liquid2.disinfect();
	    liquid2.brighten();
	    TabletDetergent tab=(TabletDetergent)liquid2;
	    tab.soften();
		System.out.println("---------------------------------------");

	    
	    PowderDetergent pow2=new TabletDetergent();
	    pow2.clean();
	    pow2.whiten();
	    pow2.deodorize();
	    pow2.disinfect();
	    TabletDetergent tab2=(TabletDetergent)pow2;
	    tab2.brighten();
	    tab2.soften();
		System.out.println("---------------------------------------");

	    
	    Detergent det2=new TabletDetergent();
	    det2.clean();
	    det2.whiten();
	    det2.deodorize();
	    TabletDetergent tab3=(TabletDetergent)det2;
	    tab3.disinfect();
	    tab3.brighten();
	    tab3.soften();
	    System.out.println("--------------------------------------------------------------");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
