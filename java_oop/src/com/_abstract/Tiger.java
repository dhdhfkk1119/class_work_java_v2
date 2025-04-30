package com._abstract;

/*
* 추상 클래스를 활용하는 이유
* */

public abstract class Tiger extends Animal{
    
    @Override
    public void hunt(){
        System.out.println("호랑이가 앞발로 사냥을 합니다");
    }

    @Override
    public void move() {
        System.out.println("살금살금 조용히 이동합니다");
    }
}
