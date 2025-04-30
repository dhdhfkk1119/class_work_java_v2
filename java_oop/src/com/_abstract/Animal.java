package com._abstract;

/*
* 추상 클래스란?(abstract class)
* 하나 이상의 추상 메서드를 포함하는 클래스 이거나
* class 키워드 앞에 avstract 가지고 있으면 추상 클래스 입니다
* */
// 강제적으로 타입으로만 설계하는 기법을 말한다.
// abstract -> 강제성
public abstract class Animal {
    
    String name;

    public void move(){
        System.out.println("이동합니다");
    }
    
    // 추상 메서드를 만들어 보자
    // 클래스 내에서 단 하나라도 추상 메서드를 가지고 있다묜
    //그 클래스는 반드시 추상 클래스가 되어야 한다.
    public abstract void hunt();
    
}
