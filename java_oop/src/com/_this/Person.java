package com._this;

public class Person {

    // this 에 3가지 사용법 존재한다

    private String name;
    private int age;
    private String phone;
    private String gender;

    // 1. 사용 방법 ( 문법 , 왜 )
    public Person(String name, int age) {
        // 매개변수 = 매개변수
        // 맴버변수 = 매개변수
        this.name = name;
        this.age = age;
        System.out.println("1번 생성자 호출 됨");
    }

    // 2. 사용방법
    // this는 생성자에서 다른 생성자를 호출 할 수 있다.
    public Person(String name, int age, String gender) {
        System.out.println("11111111111111111111");
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
        this(name, age); // 2번 생성자 호출 됌
        this.gender = gender;
        System.out.println("2번 생성자 호출 됨");
    }

    public Person(String name, int age, String gender, String phone) {
        this(name, age, gender); // 3번 생성자 호출햄
        this.phone = phone;
    }
}
