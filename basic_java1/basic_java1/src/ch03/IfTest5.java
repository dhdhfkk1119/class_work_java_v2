package ch03;

import java.util.Scanner;

public class IfTest5 {

    public static void main(String[] args) {
        //키보드에서 값을 받을 고두 준비
        Scanner sc = new Scanner(System.in);

        System.out.printf("성적을 입력하세여 : (0 ~ 100)");
        int score = sc.nextInt();
        char grade = 'X';

        // 100 ~ 90 --> A 학점 입니다.
        // 89 ~ 80 --> B 학점 입니다.
        // 79 ~ 70 --> C 학점 입니다.
        // 69 ~ 60 --> D 학점 입니다.
        // 59 이하는 --> F 입니다.
        // 단, 100 ~ 0 값이 아닌 사용자가 다른 값을 입력했다면
        // 잘못된 입력 입니다 출력하기

        if (score > 100 || score < 0) {
            System.out.println("잘못된 입력입니다.");
        } else if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else if (score <= 59) {
            grade = 'F';
            System.out.println(grade + "학점 입니다");
        } else if(grade != 'X'){
            // 만약 잘못된 값이 들어 왔다면 아래 구문 출력 안할 수 있도록 코드를 수정하시오
            System.out.println("당신의 학접은 : " + grade + "입니다.");
        }

    }
}
