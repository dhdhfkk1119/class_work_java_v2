package com._abstract;

public abstract class Computer {

    public void turnOn(){
        System.out.println("컴퓨터를 킨다");
    }
    public void turnOff(){
        System.out.println("컴퓨터를 끊다");
    }

    public abstract void display();
    public abstract void typing();


}
