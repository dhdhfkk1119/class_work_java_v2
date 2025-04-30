package com.access;

public class MainTest1 {
    
    public static void main(String[] args) {
        Bank bank = new Bank(); // 인스턴스 화
        // bank.number; 이 변수는 private 이기 때문에 외부서 안보인다
        // bank.balace = 1000; 이 변수는 default 같은 패키지 내부에서 접근 가능하다
    }
}
