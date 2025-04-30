package com.dot;

public class A {

    B b;

    // 생성자 { 인스턴스화 될 떄 제일 먼저 수행하는 코드이다.
    public A() {
        System.out.println("A가 나옴");
        b = new B();

    }



}
