package com._interface;

public class Television extends HomeAppliances implements RemoteController{

    @Override
    public void turnOn() {
        System.out.println("TV전원을 켭니다");
    }
    
    @Override
    public void turnOff() {
        System.out.println("TV전원을 끕니다");
    }

}
