package com.phoymorphism;

public class Banana extends Fruit {

    String origin; // 원산지를 담을 수 있는 공간 선언
    
    public Banana() {
        origin = "한국";
        name = "델몬트 바나나";
        price = 3000;
    }
    
    public void saleBanana() {
        System.out.println("지금은 할인 행사입니다");
        System.out.println("이 방송이 나간 이후 바나나 가격을 천원 할인 합니다");
        price -= 1000;
    }
}
