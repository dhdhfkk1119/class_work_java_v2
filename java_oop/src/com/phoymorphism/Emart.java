package com.phoymorphism;

public class Emart {

    public static void main(String[] args) {

        // 배열
        // 배열을 사용할 때는 반드시 크기를 먼저 지정해야 한다
        // 배열에 길이와 요소에 길이 는 항상 동일한 것은 아니다.
        Banana banana = new Banana();

        Fruit[] fruits = new Fruit[5];

        fruits[0] = new Banana();
        fruits[1] = new Peach();
        fruits[2] = new Banana();
        fruits[3] = new Peach();

        // 도전 문제
        for (int i = 0; i < fruits.length; i++) {
            // 배열안에 들어 있는 각각의 객체 showInf() 전부 호출 하시오
            // 단 데이터 타입이 바나나일 경우 원산지 정보와 , saleBanana() 메서드를 출력하시오
            if(fruits[i] != null){
                fruits[i].showInfo();
                if(fruits[i] instanceof Banana) {
                    ((Banana) fruits[i]).saleBanana();
                    System.out.println(((Banana) fruits[i]).origin);
                }
            }
        }
    }
}
