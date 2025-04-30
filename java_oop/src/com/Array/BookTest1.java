package com.Array;

/*
* 배열 테스트 코드 작성
* */

public class BookTest1 {

    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new Book("플러터UI실전","김근호");
        books[1] = new Book("무궁화 꽃이 피었습니다","김진명");
        books[2] = new Book("흐르는 강물 처럼","파을로 코엘로");
        books[3] = new Book("리딩으로 리드하라","이지성");
        books[4] = new Book("사피엔스","유발하라리");
        books[9] = new Book("홍길동전","허균");


        for (int i = 0; i < books.length; i++) {
            // 만약 배열안에 요소가 null 이 아니라면 출력 때 - 방적 코드 각성
            if(books[i] != null){
                // null 이 아닐때만 출력한다
                System.out.println(books[i].getTitle());
            }
        }

        // int[]
        // double[]
        // String[]
    }

}
