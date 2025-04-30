package com._interface;

public class Refrigerator extends HomeAppliances implements RemoteController , SoundEffect {
    @Override
    public void turnOn() {
        System.out.println("냉장고전원을 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("냉장고전원을 끕니다");
    }

    @Override
    public void soundOn() {
        System.out.println("띠리리링");
    }

}
