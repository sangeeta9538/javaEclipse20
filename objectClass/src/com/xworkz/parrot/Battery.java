package com.xworkz.parrot;

public class Battery {
	public String lifeCycle;
    public String type;
    public boolean selfRecharge;

    public Battery( String lifeCycle,String type, boolean selfRecharge) {
        this.lifeCycle = lifeCycle;
        this.type = type;
        this.selfRecharge = selfRecharge;
    }

    @Override
    public String toString() {
        return "LifeCycle is:"+lifeCycle+" ,type is:"+type+" , selfRecharge ?:"+ selfRecharge;
    }

}
