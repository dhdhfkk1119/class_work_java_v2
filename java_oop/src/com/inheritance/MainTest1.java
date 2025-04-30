package com.inheritance;

public class MainTest1 {

    public static void main(String[] args) {
        // Cal 클래스와 ChildCal 관계는 부모 자식 관계에 놓여 있다

        ChildCal c = new ChildCal();
        int sum1 = c.sum(10,20);
        System.out.println(sum1);

        int minus1 = c.minus(40,12);
        System.out.println(minus1);

        // 곱하는 기능
        // 부모 클래스의  메서드를 자식 클래스에서 재정의를 한다면
        // 메서드 오버라이드라고 한다
        int mult = c.multiply(0,14);
        System.out.println(mult);

        // 상속돤계에 있어서 부모 클래스가 먼저 존재해야
        // 자식 클래스가 존재할 수 있다.
    }
    
}
