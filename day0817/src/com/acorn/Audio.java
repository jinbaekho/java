package com.acorn;

public class Audio {

    private boolean power;
    private int volumn;

    public Audio() {
    }
    
    public boolean getPower() {
        return power;
    }

    public void setPower(boolean power) {
    	this.power = power;
    }

     public int getVolumn() {
        return volumn;
    }

    public void setVolumn(int volumn) {
    	this.volumn = volumn;
    }

    public void tune() {
    	String sOnOff = power ?  "ha ha ha..." : "turn it on";
        System.out.println(sOnOff);
    }
}