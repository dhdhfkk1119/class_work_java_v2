package exercise;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        // 프로그래밍에서는 C R U D 개념이 있다
        // 생셩 , 조회 , 삭제 , 삭제
        // 실행에 흐름을 만들어 보는 연습 1단계 


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("메뉴 선택");
            System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
            System.out.print("선택 : ");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (num == 1) {
                System.out.println("등록을 선택했습니다");
                break;
            } else if (num == 2) {
                System.out.println("조회를 선택했습니다");
                break;
            } else if (num == 3) {
                System.out.println("수정를 선택했습니다");
                break;
            } else if (num == 4) {
                System.out.println("삭제를 선택했습니다");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요");
            }

        }

    } // end of main
} // end of class
