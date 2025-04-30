package ch02;

public class DataType4 {
    public static void main(String[] args) {
        // 1. 기본자료형 - 논리형 ( boolean ) 어떠한 사실을 관찰하고 결과값이 참 , 거짓인 판별을 할 때 사용한다
        // 상자 크기는 1byte -> 8bit
        System.out.println(true); // 논리형 타입에 값 true
        System.out.println(false); // 논리형 타입에 값 false

        boolean isMarried = true; // 변수 선언과 동시에 초기회
        System.out.println(isMarried);

        isMarried = false;

        boolean isOk; // 변수만 선언했다.
        isOk = true;
    }
}
