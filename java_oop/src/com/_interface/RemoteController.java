package com._interface;

public interface RemoteController {

    // 인터페이스란 ?
    // 구현된 것이 아무것도 없는 밑 그림만 있는 기본 설계도이다

    // 모든 변수는 -> 상수가 된다. public static final int N
    // 모든 메서드는 추상 메서드가 된다. 심지어 abstract 키워드도 생략 가능하다

    // 추상클래스보다 추상화가 더 높다.
    // 중요! 인터페이스를 사용할때 무언가 동작 중심에 클래스를 선언해야 할 때 사용한다

    // 인터페이스는 표준이다. 또는 강제성이 있는 규약이다.
    public static final int SERIAL_NUMBER = 100;

    public abstract void turnOn();
    public abstract void turnOff();
}
