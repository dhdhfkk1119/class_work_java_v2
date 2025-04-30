package com.Array;

public class ArrayTest1 {

    public static void main(String[] args) {
        // 배열이란 ?  -
        // 연관된 데이터 타입을 한번에 모아서 통으로 관리하기 위해 사용할수있다

        // 배열을 선언하는 문법
        // 규칙 1. 배열은 반드시 먼저 몇 개의 데이터가 들어갈지 크기를 지정해야 사용할 수 있다.

//        int[] array;  // 배열의 선언
//        array = new int[3]; // 4바이트 네모칸 3개 초기화

        int[] array = new int[10]; // 데이터 타입에 대괄호 문법 허용
        int array2[] = new int[10]; // 변수 뒤에 대괄호 문법 허용

        // [][][] ---> 값이 아직 안들어간 상태이다
        // 배열 선언과 동시에 값을 초기화 해보자
        int[] grads = new int[] {1,2,3};
        // [1][2][3]
        int[] grads2 = {1,2,3,4,5,};
        
        // 모든 인덱스의 길이는 n - 1 이다
        int[] array1 = new int[57];
    }
}
