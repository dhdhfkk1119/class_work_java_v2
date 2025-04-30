package com.inheritance;

public class Wizard extends Hero{


    public Wizard() {
        super("Wizard", 20);
    }
    public void freezing(){
        System.out.println("마법사가 마법을 쓴다");
    }

}
