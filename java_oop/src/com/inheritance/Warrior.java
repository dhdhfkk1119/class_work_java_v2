package com.inheritance;

public class Warrior extends Hero{


    public Warrior(){
        super("Warrior", 20);
    }

    // 부모의 메서드를 재정의 한다면 --> 메서드 오버라이드
    // 어노 테이션 주석 + 힌트
    @Override
    public void attack() {
        System.out.println("전사가 공격을 합니다");
        super.attack();
    }

    public void comboAttack(){
        System.out.println("전사가 공격을 한다");
    }
}
