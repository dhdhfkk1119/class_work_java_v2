package com.inheritance;

public class Hero {

    String name;
    int hp;


    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void attack(){
        System.out.println(name  + "공격합니다" + "피는 " + hp);
    }
}
