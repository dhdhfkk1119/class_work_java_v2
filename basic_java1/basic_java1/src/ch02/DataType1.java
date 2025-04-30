package ch02;

/*
 * 데이터 타입이란?
 * 변수라는 상자에 담을 수 있는 값의 종류와 크기를 정의하는 것
 * 상자의 크기에 따라서 담을 수 있는 값의 범위가 달라짐
 *
 */

public class DataType1 {

    public static void main(String[] args) {

        // 자바에서 데이터 타입에 가장 큰 분류 체게 딱 2
        // 1. 기본 자료형 (Primitive Data Type)
        // --> 정수형 , 문자형 , 실수형 , 논리형
        // 2. 참조 자료형 (Reference Data Type)


        // 정수형 : 소수점이 없는 숫자(-10,0,55)
        byte smallBox; // 1바이트 --> 8비트
        short mediumBox; // 2바이트 --> 16비트
        int standarBox; // 4바이트 --> 32비트
        long largeBox; // 8바이트  --> 64비트
        // 변수를 선언했다. 데이터 타입 -> 정수형을 담을 수 있는 메모리 공간 1바이트
        // 컴퓨터는 이진수를 사용 -> 0 또는 1로만 데이터를 표시
        // [][][][][][][][] 8bit -> 1byte

        smallBox = -128;
        smallBox = 127;

        mediumBox = -32768;
        mediumBox = 32767;

        standarBox = -2147483648;
        standarBox = 2147483647;

        // largeBox = 9경까지 표현 가능
        // 접미사 L -> long 데이터 타입을 알려준다
        largeBox = 9L;
    }

}
