package com.books;

/*
 * 모든 프로그래밍 기본은 CRUD 이다
 * */

import com.Array.Book;

import java.util.Scanner;

public class MyBookStore {

    // 메인 함수
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 배열준비
        Book[] books = new Book[100];

        // TODO - 추후 삭제하기
        // 샘플 데이터 미리 만들어 두기
        books[0] = new Book("플러터UI실전","김근호");
        books[1] = new Book("무궁화 꽃이 피었습니다","김진명");
        books[2] = new Book("흐르는 강물 처럼","파을로 코엘로");
        books[3] = new Book("리딩으로 리드하라","이지성");
        books[4] = new Book("사피엔스","유발하라리");
        books[9] = new Book("홍길동전","허균");

        boolean flag = true;

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String END = "5";



        while (flag) {

            System.out.println(" ** 메뉴 선택 ** ");
            System.out.println("1. 저장 , 2. 전체조회 , 3. 선택 조회 , 4. 전체 삭제 , 5. 종료");
            String selected = sc.nextLine();
            // 숫자 비교할 떄 == 사용한다
            // 문자열 비교할 댸 "문자열".equals("문자열") --> true , 다르다면 false 반환
            if (selected.equals(SAVE)) {
                System.out.println(">> 저장하기 <<");
                //동작
                save(sc,books);
            } else if (selected.equals(SEARCH_ALL)) {
                System.out.println(">> 전체 조회 <<");
                readAll(books);
            } else if (selected.equals(SEARCH_BY_TITLE)) {
                System.out.println(">> 선택 조회 <<");
                readByTitle(sc,books);
            } else if (selected.equals(DELETE_ALL)) {
                System.out.println(">> 전체 삭제 <<");
            } else if (selected.equals(END)) {
                System.out.println(">> 프로그램 종룔종료 <<");
                flag = false;
            } else {
                System.out.println("잘못된 선택입니다");
            }
        }
    }


    // 저장 하기
    public static void save(Scanner sc,Book[] books) {
        System.out.println("-------sav-------");

        System.out.println("저장할 번호를 적어주세요");
        int i = sc.nextInt();
        System.out.println("책 타이틀 및 이름을 적어주세요");
        String title = sc.nextLine();
        String author = sc.nextLine();

        if(books[i] == null) {
            books[i] = new Book(title,author);
        }

    }

    // 전체 조회 하기
    public static void readAll(Book[] books){
        System.out.println(" ---- READ ALL ---- ");
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null){
                System.out.println(books[i].getTitle() + "," +books[i].getAuthor());
            }
        }
    }

    // 책 제목으로 조회하기 (선택조회)
    public static void readByTitle(Scanner sc,Book[] books) {
        boolean isFind = false;

        System.out.println("-------readTitle-------");
        String title = sc.nextLine();
        for (int i = 0; i < books.length; i++) {
            if(books[i].getTitle().equals(title.trim())) {
                if(books[i] != null){
                    System.out.println(books[i].getTitle());
                    isFind = true;
                    break;
                }
            }
        }
        if(!isFind) {
            System.out.println("해당 제목에 책은 존재하지 않습니다.");
        }

    }



    // 전체 삭제하기
    public static void deleteAll(Book[] books) {
        System.out.println("-------deleteAll-------");
        // 전체 삭제 중
        // 1. 배열 주소가져와서 반복문 100 = null
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
    }

}
