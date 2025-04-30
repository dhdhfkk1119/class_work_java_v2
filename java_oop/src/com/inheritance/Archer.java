package com.inheritance;

public class Archer extends Hero{

    public Archer() {
        super("Archer", 20);
    }

    public void fireArrow(){
        System.out.println("활을 쏜다");
    }
}
