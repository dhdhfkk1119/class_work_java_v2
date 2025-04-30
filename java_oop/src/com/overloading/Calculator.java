package com.overloading;

/*
* 메서드 오버로딩이란?
* 같은 이름의 메서드를 여러개 정의하는 것을 말한다.
* */
public class Calculator {
    
    // 덧셈 메서드
    public int add(int a, int b) {
        return a + b;
    }

    // 매개변수에 데이터 타입이 다르다면 컴파일러는 구분할  수 있다.
    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // main 함수 - 코드의 진입점
    public static void main(String[] args) {
        // println ->> 메소드 오버로딩 기법이 적용된 메서드
        System.out.println();
    }
    
}
