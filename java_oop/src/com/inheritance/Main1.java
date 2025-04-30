package com.inheritance;

class Animal{
    protected String name;
    
    void eat(){
        System.out.println(name + "이(가) 밥을 먹습니다");
    }

    void bark(){
        System.out.println( name + "이가 짖는다");
    }
    
}

// 자식 클래스
class Dog extends Animal{

    @Override // @Override <-- 어노테이션 / 주석 + 힌트
    void eat() {
        super.eat(); // 부모의 eat 을 가져옴
    }
}

// xxx.java 단 하나의 자바 파일에는 public 가진 클래스는 오직 하나만 존재할 수 있다 .
public class Main1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "강아지";

        dog.eat();
        dog.bark();
    }
}


class Cat extends Animal{

    @Override
    void eat() {
        super.eat();
    }
}