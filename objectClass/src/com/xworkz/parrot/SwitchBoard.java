package com.xworkz.parrot;

public class SwitchBoard {
	
	public String type;
    public int voltageRate;
    public boolean protectionAgainstDust;

    public  SwitchBoard( String type,int voltageRate, boolean protectionAgainstDust) {
        this.type = type;
        this.voltageRate = voltageRate;
        this.protectionAgainstDust = protectionAgainstDust;
    }

    @Override
    public String toString() {
        return "type is:"+type+" ,voltage rate is:"+voltageRate+" ,protection Against Dust ?:"+ protectionAgainstDust;
    }


}
