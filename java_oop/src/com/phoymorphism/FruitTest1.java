package com.phoymorphism;

public class FruitTest1 {

    public static void main(String[] args) {
        //다향한 형태로 바라볼 수 있다. - 다형성 -
        Fruit peach = new Peach();
        Fruit banana = new Banana();
        String bananaOrigin = ((Banana) banana).origin; // 다운 캐스팅

        peach.showInfo();
        banana.showInfo();

        // 사전 기반 지식 - 컴파일 , 런타임
        // 위 상황에서 바나나의 원산지 정보를 출력하시오
        // 업캐스팅된 상태 : 컴파일 시점에 부모에 있는 변수나 , 메서드만 확인을 할 수 있다

        System.out.println("바나나 원산지" + bananaOrigin);
        
        // 키워드 - 인스턴스 오브 연산자
        // instanceof --> 예약어

        if (banana instanceof Peach) {
            System.out.println("여기들어올까? 1");
        }

        if (banana instanceof Banana) {
            System.out.println("여기들어올까? 2");
        }

        // 도전 문제
        // 바나나에 saleBanana() 메서드르 호출 하시오.

        ((Banana) banana).saleBanana();
        banana.showInfo();

    }

}
