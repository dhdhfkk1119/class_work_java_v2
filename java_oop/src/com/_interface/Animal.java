package com._interface;

// HOW
// 여기 안에 선언된 메서드는 모두 추상 메서드가 되어야 한다.
// WHY

public interface Animal {

    // 메서드 선언부만 있고 body 가 없다
    public abstract void eat();
    // 생략이 가능하다 . abstract
    void move();
}
