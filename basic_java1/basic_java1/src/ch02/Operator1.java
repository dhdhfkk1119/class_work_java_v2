package ch02;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int mulit = a * b;
        System.out.println("a * b = " + mulit);

        // 나누기
        // 실수 / 실수를 해줘야 정확한 값이 나온다
        // double div = 5.0 / 2.0;
        double div =  (double) a / b;
        // 두개 중에 하나라도 실수면 션산에 결괴는 실수로 처리 된다
        System.out.println("a / b = " + div);

        //나머지
        double lat = (double) a % b;
        System.out.println("a % b = " + lat);

        //연습 문제
        // 1. (12 + 3) / 3 값을 화면에 출력해 보세요
        System.out.println((12 + 3) / (double)3);

        // 2. (25 % 2) 값을 화면에 출력해 보세요
        // 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수 나머지가 1이면 홀수 이다
        System.out.println(25%(double)2); // 1 --> 홀수로 판별 할 수 있다.
        System.out.println(26%(double)2); // 0 --> 짝수로 판별 할 수 있다.


    }
}
