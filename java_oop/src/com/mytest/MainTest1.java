package com.mytest;

import com.access.Bank;

public class MainTest1 {

    public static void main(String[] args) {
        Bank bank2 = new Bank();
        // 이 Bank 는 패키지 com.access 에 존재하는 녀석이다
        // 현재 우리 패키지는 mytest에 존재하고 있다
        // bank2.number; 해당 클래스 내에서만 사용 가능


        bank2.name = "홍길동"; // public 어디에서나 접근 가능하다
    }

}
