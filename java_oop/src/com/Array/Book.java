package com.Array;

/*
 * 도서를 저장하고 관리할 수 있는 간단한 프로그램 만들어 보자
 * */

public class Book {

    private String title;
    private String author;
    private int totalPage;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int totalPage) {
        this(title, author);
        this.totalPage = totalPage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }


    public void showInfo(){
        System.out.println(" 현 재 상 태 를 보 여 주 는 곳 ");
        System.out.println("책 제목 : " + title);
        System.out.println("책 작성자 : " + author);
        System.out.println("책 전체 페이지 : " + totalPage);
    }
}
