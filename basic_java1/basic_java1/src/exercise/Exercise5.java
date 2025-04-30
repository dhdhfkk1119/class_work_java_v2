package exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        // 자바 특징 -> 풍부한 라이브러리(기능을) 제공하고 있다
        // 자바 표준 라이브러리 - 스캐너
        Scanner sc = new Scanner(System.in);

        //명령어 ----> 사용사가 입력한 키보드 값을 받기 위한 명령어 이다
        // 그 중에 정수값을 받기 위한 명령어 이다
        System.out.println("1. 정수값을 입력하시오 : ");
        int x = sc.nextInt();
        System.out.println();

        System.out.println("2. 정수값을 입력하시오 : ");
        int y = sc.nextInt();
        System.out.println(); // 한줄 내림

        System.out.println("x : " + x);
        System.out.println("y : " + y);
        
        // 사용자가 입력한 두 값을 받아서 덧셈 연산을 시켜보자
        System.out.println("결과1 :" + (x + y));



    }
}
