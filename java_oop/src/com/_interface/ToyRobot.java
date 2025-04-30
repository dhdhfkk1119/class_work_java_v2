package com._interface;


// 장난감 로봇이 가전을 상속받게 된다며 의미가 맞지 않음//
// 추상 클래스보다 더 유연한 설계 기법이 인터페이스가 있다.
public class ToyRobot implements RemoteController {

    String name;

    @Override
    public void turnOn() {
        System.out.println("로봇을 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("로봇을 끕니다");
    }

}
