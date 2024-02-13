package com.xworkz.penRun;

import com.xworkz.pen.Chair;
import com.xworkz.pen.Furniture;
import com.xworkz.pen.Sofa;
import com.xworkz.pen.Table;

public class CastFurniture {
	public void runFurniture(Furniture fur)   	{   
	        
		   fur.move();
	        if (fur instanceof Table) {
			
	        Table tab=(Table)fur;
			tab.breaks();
			
		}
		else if(fur instanceof Sofa){
			Sofa sofa=(Sofa)fur;
			sofa.fall();
		}
			
		else if(fur instanceof Chair) {
				
			Chair chair=(Chair)fur;
		    chair.tearOff();
			
			
			}
			
			
			
		}
	}



