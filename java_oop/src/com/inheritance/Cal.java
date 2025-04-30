package com.inheritance;

public class Cal {

    public int sum (int a, int b) {
        return a + b;
    }

    public int multiply (int a, int b) {
        return a * b;
    }


}

// xxx.java 하나의 자바 파일에 여러개의 클래스를 선언 할수 있다
// 단 스코프는 분명히 구분이 되어 진다
// 중요. 단하나의 자바파일에 public 클래스는 오직 하나만 존재 할 수 있다.
class ChildCal extends Cal {

    // 마이너스 기능을 추가해 주세요

    //곱하기 기능에서 n1 과 n2 에 0이 들어온다묜 0 을 입력하지 마시오
    // 라는 문구를 나올수 있게 수정하시오.

    public int minus (int a, int b) {
        return a - b;
    }

    // 상속을 사용했을 때 메서드 오버라이드 라는 개념이 있다
    // 부모 클래스의 메서드를 재정의할 수 있다. 이것을 메서드 오버라이드라고 한다
    // 문법 - 부모 클래스에 매서드 이름과 매개변수 개수 및 타입 즉 모양이 동일해야 한다
    
    public int multiply (int a, int b) {
        if(a == 0 || b == 0){
            System.out.println("0을 입력하짐 마시오");
        }
        return a * b;
    }
    
} // end of class

