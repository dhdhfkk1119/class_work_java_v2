package com.phoymorphism;


/*
* 하나의 데이터 타입을 다양한 형태로 바로 보는 것(다형성)
* 상세히.. 한 요소 : 메서드(클래스) 여러 형태를 가질 수 있는 능력을 의미한다
* 상속 관계 ... 다형성을 살펴 보고 있다.
* */


public class AnimalTest1 {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.move();
        animal.eat();
        System.out.println("-----------------");

        // 다형성에 장점
        // 부모 타입으로 자식 클래스를 인스턴스화 할 수 있다
        Animal tiger = new Tiger();
        tiger.move();
        System.out.println("-----------------");


        // 코드를 작성하는 시점은 --> 컴파일 시점
        // 프로그램을 실해시키는 시점은 --> 런타임 시점
        Animal human = new Human();
        human.move();

    }
}
