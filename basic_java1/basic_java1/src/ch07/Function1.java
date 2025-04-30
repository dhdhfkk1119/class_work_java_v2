package ch07;

public class Function1 {

    // 함수를 만들어보자 .
    // 함수 만들기 위해서는 당연히 머리속에 어떻게 코드를 만들지 들어가 있어야 한다
    // 두 개의 정수값을 받아서 덧셈 연산을 하고 그 결과를 반환 하는 함수를 만들거야.

    // static -> 아직 생략
    // int --> 반환 될 데이터의 타입
    // add --> 함수의 이름
    // 괄호 (n1,n2) --> 매개 변수 (파라메터)
    // { .... } - 함수의 몸체
    static int add(int n1, int n2) {

        // 클래스 바로 아래 쓰는 변수를 - 맴버 변수
        // 함수안에 선언하는 변수를 - 지역 변수
        int result; // 변수의 선언
        // int result = n1 + n2;
        return 0;
    }

    // 기능 묶음 (세개의 정수값을 받아서 덧셈 연산 하는 함수이다)
    static int add2(int n1, int n2 , int n3) {
        int result = n1 + n2 + n3;
        return result;
    }

    static double add3(int n1, int n2 , int n3) {
        double result = n1 + n2 + n3;
        return result;
    }

    // 함수 -> 콘솔창에 안녕 내나이는 xx 이야 출력하는 함수를 만들어 보자.
    // void -> 텅 빈
    static void sayHello(int myAge){
        System.out.println("안녕 내나이는 " + myAge + "이야");
        // void 는 리턴 값이 없다 그래서 return 키워드를 사용하지 않음
    }
}
