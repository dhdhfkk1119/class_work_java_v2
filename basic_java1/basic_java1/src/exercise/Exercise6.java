package exercise;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        // 스캐너 도구를 사용해서
        // 뺄셈 , 곱셈 , 나눗셈 연산하는 프로그램을 직접 만들어 보자
        // 사용자에게 값 2개를 받아서 연산 하시오


        Scanner sc = new Scanner(System.in);
        System.out.printf("정수를 입력하세요 A:");
        int a = sc.nextInt();
        System.out.printf("정수를 입력하세요 B:");
        int b = sc.nextInt();

        int max;

        max = (a>b) ? a : b;
        System.out.println(max);
    }
}
