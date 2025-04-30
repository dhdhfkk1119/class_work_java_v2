package com.phoymorphism;


/*
* 하나의 데이터 타입을 다양한 형태로 바로 보는 것(다형성)
* 상세히.. 한 요소 : 메서드(클래스) 여러 형태를 가질 수 있는 능력을 의미한다
* 상속 관계 ... 다형성을 살펴 보고 있다.
* */


public class AnimalTest2 {

    public static void main(String[] args) {

        // 하나의 메서드가 메서드 여러 형태를 가질 수 있는 능력을 의미한다.
        // move() -->
        // 하나의 변수에 통으로 데이터를 관리하고 싶다면 ... 자료구조(배열)
        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Human();
        animals[2] = new Tiger();

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

    }

}
