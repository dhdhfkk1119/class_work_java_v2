package ch04;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {

        // for 문 사용했을 때 1 ~ 10 까지의 총합 : 55
        // 위 내용을 while 구문으로 만들어서 총합을 출력하시오.
        // 무한 루프 조심 !

        Scanner sc = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        System.out.println("종료하고 싶은 정수값을 입력하시요");
        final int END = sc.nextInt();

        while(i <= END){

            sum += i;
            // 조건식에 대한 처리를 잘 확인하자
            i++;

        }
        System.out.println("sum : 총합 : " + sum);
    }
}
