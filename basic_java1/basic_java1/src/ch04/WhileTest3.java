package ch04;

import java.util.Scanner;

public class WhileTest3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true; // 깃발

        // 특정 조건이 만족한다면 flag = false
        while (true){
            int a = sc.nextInt();
            if ( a == 0 ){
                System.out.println("프로그램 종료합니다");
                break;
            }
            System.out.print("...");

        }

    } // end of main
} // end of class
