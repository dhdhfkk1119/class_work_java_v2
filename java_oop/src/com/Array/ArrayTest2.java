package com.Array;

public class ArrayTest2 {

    public static void main(String[] args) {

        // char 타입은 원래 정수 값이다.
        // 컴퓨터는 0,1 이진수로 데이터를 표현한다.
        // 문자 , 문자열을 아주 많이 다루고 있다
        // 컴퓨터에서 문자를 표현하기 위해서 문자표라는 것을 사용한다
        // 아스키코드, EUC-KR 유니코드 문자표를 전세계 공통으로 사용하기 위해 만들어음
        // 아스키코드 1바이트 안에 하나의 문자를 다 표현 할 수있다.

        char[] alphabets = new char[26];
        char reload = 'A';
        for(int i = 0 ; i < alphabets.length; i++){
            alphabets[i] = reload;
            reload++;
        }
        System.out.println(alphabets);
    }

}
