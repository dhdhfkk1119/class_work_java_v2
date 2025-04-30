package com.inheritance;

public class Child1 extends Super1 {
    
    int age;

    // 상속 관계에 있어서 !!!
    // 부모가 존재해야 자식이 존재할수 있다
    public Child1(String name) {
        super(name);
        this.age = age;
    }
}
