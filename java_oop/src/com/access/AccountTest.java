package com.access;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(20000);
        account.withdraw(1600);
        account.showInfo();
        
        // 접근 제어지사 문법 , 왜 사용하는가??
        
        // 신입 개발자가 실수로 메서를 통해서 코드를 작성한게 아니라
        // 바로 멤버변수에 접근해서 수정하는 코드를 자성해 버렸다
        // account.balance = 10000;
        account.showInfo();
        // 실수 할 수 있는 가능성이 있다..
        // balance 변수를 외부에서 안보여 접근 차단해 보자
        // private 를 선언해서 외부에서 접근 차단
        
        // 외부에서는 오직 출금 기능 , 입금 기능 메서드로만사용이 가능해 졌다
        // >>> 현재 잔액 <<<< -> 출력하고 있다
        int balance = account.getBalance();
        System.out.println(">>>> 현재 잔액 : " + balance);

        // 자바에서 멤버 변수 값을 초기화 하지 않으면 Stirng -> null , int = 0;
        System.out.println(account.getName());
        
        // setter 메서드 사용해 보자
        account.setBalance(0);
        account.showInfo();
    }
}
