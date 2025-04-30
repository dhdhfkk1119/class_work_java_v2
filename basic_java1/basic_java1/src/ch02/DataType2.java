package ch02;

/*
* 문자 데이터 타입
* char 자료형에 크기는 2byte -> 16 bit
 */

public class DataType2 {
    public static void main(String[] args) {
        // 단 하나의 문자를 저장하기 위해 사용할 수 있다.

        char charBox;
        charBox = 'A'; // '' -> 문자 타입 , "" -> 문자열
        System.out.println(charBox);

        char alpthabetA = 'A';
        char alpthabetB = 'B';

        // 더 많은 글자를 담고 싶으면
        String temp = "안녕반가워";
        System.out.println(temp);

    }
}
