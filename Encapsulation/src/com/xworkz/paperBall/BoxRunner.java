package com.xworkz.paperBall;

import com.xworkz.paper.Basket;
import com.xworkz.paper.Box;
import com.xworkz.paper.Frame;
import com.xworkz.paper.Nailpolish;
import com.xworkz.paper.Pot;

public class BoxRunner {

	public static void main(String[] args) {
         Box box=new Box("plastic", "rectangle", 10, 20, "Red");
         System.out.println(box.getMaterial());
         System.out.println(box.getShape());
         System.out.println(box.getLength());
         System.out.println(box.getBreadth());
         System.out.println(box.getColor());

         box.setMaterial("Steel"); //modify
         System.out.println("matirial after madifing:" + box.getMaterial());
         box.setColor("blue");
         System.out.println("color after madifing:" + box.getColor());
         
         
         Box box1=new Box("Steel","rectangle",10,20,"blue");
         System.out.println(box.getMaterial());
         System.out.println(box.getShape());
         System.out.println(box.getLength());
         System.out.println(box.getBreadth());
         System.out.println(box.getColor());
         
         
         boolean s=box.equals(box1);
         System.out.println(s);
         
         System.out.println("----------------------------------------------------");

         Nailpolish nail=new Nailpolish("red", "dazzler", 100, true, 10);
         System.out.println(nail.getColor());
         System.out.println(nail.getBrand());
         System.out.println(nail.getCost());
         System.out.println(nail.getShine());
         System.out.println(nail.getColor());
         
         Nailpolish nail1=new Nailpolish("black", "maybellin", 120, false, 10);
         System.out.println(nail1.getColor());
         System.out.println(nail1.getBrand());
         System.out.println(nail1.getCost());
         System.out.println(nail1.getShine());
         System.out.println(nail1.getColor());
         
         boolean a=nail.equals(nail1);
         System.out.println(a);
         
         System.out.println("----------------------------------------------------------");
         
         
         Basket basket=new Basket("green","wildcraft",1500,true,5);
         System.out.println(basket.getColor());
         System.out.println(basket.getBrand());
         System.out.println(basket.getCost());
         System.out.println(basket.getFormal());
         System.out.println(basket.getNoOfPockets());
         
         Basket basket2=new Basket("green","american tourister",1500,true,5);
         System.out.println(basket2.getColor());
         System.out.println(basket2.getBrand());
         System.out.println(basket2.getCost());
         System.out.println(basket2.getFormal());
         System.out.println(basket2.getNoOfPockets());
         
         basket2.setBrand("wildcraft"); //modify
         System.out.println("brand after madifing:" + basket2.getBrand());
         
         boolean d=basket.equals(basket2);
         System.out.println(d);
         System.out.println("---------------------------------------------------");
         
         
         Pot pot=new Pot("flower","red",50,false,25);
         System.out.println(pot.getType());
         System.out.println(pot.getColor());
         System.out.println(pot.getCost());
         System.out.println(pot.getMud());
         System.out.println(pot.getRadius());
         
         Pot pot2=new Pot("flower","red",50,false,90);
         System.out.println(pot2.getType());
         System.out.println(pot2.getColor());
         System.out.println(pot2.getCost());
         System.out.println(pot2.getMud());
         System.out.println(pot2.getRadius());
         
         pot2.setRadius(25); //modify
         System.out.println("matirial after madifing:" + pot2.getRadius());
         
         boolean res=pot.equals(pot2);
         System.out.println(res);
         
         System.out.println("---------------------------------------------------");
         
         Frame frame =new Frame("brown","plastic",50,"matte",true);
         System.out.println(frame.getColor());
         System.out.println(frame.getMaterial());
         System.out.println(frame.getSize());
         System.out.println(frame.getFinish());
         System.out.println(frame.getGlass());
         
         Frame frame2 =new Frame("brown","plastic",50,"matte",true);
         System.out.println(frame2.getColor());
         System.out.println(frame2.getMaterial());
         System.out.println(frame2.getSize());
         System.out.println(frame2.getFinish());
         System.out.println(frame2.getGlass());
         
         boolean res1=frame.equals(frame2);
         System.out.println(res1);
         


         
         
         
         
         
         
         




         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
	}

}
