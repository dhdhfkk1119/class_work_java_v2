package com.startcraft_v02;

import java.util.Scanner;

public class GameTest {

    //코드의 진입점
    public static void main(String[] args) {
        Zealot zealot = new Zealot("질럿1");
        Zegling zegling = new Zegling("저글링1");
        Marine marine = new Marine("마린1");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. 질럿 선택 ,  2. 마린 선택 3. 저글링 선택 , 0. 종료");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("누구를 공격 하시겠습니까? , 1. 마린 , 2. 저글링 , 3. 이전으로");
                int choice2 = scanner.nextInt();
                if (choice2 == 1) {
                    zealot.attack(marine);
                    marine.showInfo();

                } else if (choice2 == 2) {
                    zealot.attack(zegling);
                    zegling.showInfo();

                } else if (choice2 == 3) {

                } else {
                    System.out.println("다시 선택해주세여");
                }
            } else if (choice == 2) {

                System.out.println("누구를 공격 하시겠습니까? , 1. 질럿 , 2. 저글링 , 3. 이전으로");
                int choice2 = scanner.nextInt();
                if (choice2 == 1) {
                    marine.attackZealot(zealot);
                    zealot.showInfo();

                } else if (choice2 == 2) {
                    marine.attackZergling(zegling);
                    zegling.showInfo();

                } else if (choice2 == 3) {

                } else {
                    System.out.println("다시 선택해주세여");

                }


            } else if (choice == 3) {

                System.out.println("누구를 공격 하시겠습니까? , 1. 질럿 , 2. 마린 , 3. 이전으로");
                int choice2 = scanner.nextInt();
                if (choice2 == 1) {
                    zegling.attackZelot(zealot);
                    zealot.showInfo();

                } else if (choice2 == 2) {
                    zegling.attackMarine(marine);
                    marine.showInfo();

                } else if (choice2 == 3) {

                } else {
                    System.out.println("다시 선택해주세여");

                }

            } else if (choice == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 선택입니다 다시 선택해주십시요");

            }

        }

    }// end of main
}
