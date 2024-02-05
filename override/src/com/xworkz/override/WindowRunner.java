package com.xworkz.override;

public class WindowRunner {

	public static void main(String[] args) {
        WoodWindow a=new WoodWindow();
        a.open();  //jvm dicision:run time polymorphism invokes from subclass
        a.close();
        a.autoClose();
        a.breakWindow();
        


        Window b=new Window();
        b.open();
        b.close();
        b.semiClose();

        
        Window c=new WoodWindow();
        c.open();
        c.close();
        c.semiClose();
       //c.breakWindow();
        
        WoodWindow a1=(WoodWindow)c;
        a1.autoClose();
        
	}

}
