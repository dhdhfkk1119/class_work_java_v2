package com.inheritance;

/*
* 상속이란 기법을 배운 개발자라면
* A 클래스에 속성과 상태를 물려 받을 수 있다
* */

/*
* // 자바에서는 단일 상속만을 지원한다
* 부모클래스 A 가 되고 C 클래스가 자식 클래스가 된다
* */

public class C extends A {
    // C extends A
    // 여기 코드에는 보이지 않지만 자동으로 A에 선언된
    // 필드를 물려 받는다.

    int level;
    String nickName;
}
