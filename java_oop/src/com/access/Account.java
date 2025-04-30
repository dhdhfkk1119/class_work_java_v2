package com.access;

public class Account {

    private String name;
    private int balance;// default 클래스 내에서만 사용 가능

    // getter , setter 메서드 만들기 (메서드 일 뿐인데)
    // 외부에서 balance 값을 리턴 받을 수 있는 메서드를 만들어 보자
    // 변수앞에 get 단어를 붙인다. (매개변수를 선언할 필요가없다)

    public int getBalance() {
        return balance;
    }

    // setter 메서드 만들기
    public void setBalance(int b) {
        if(b>0){
            System.out.println("0 이하 값은 넣을 수 없습니다");
        } else {
            balance = b;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    // 입금 하다
    public void deposit(int money) {
        balance += money;
    }

    // 출금 하다
    public void withdraw(int money) {
        // TODO 방어적 코드를 작성해야 한다
        balance -= money;
    }

    public void showInfo(){
        System.out.println("현재 계좌 잔액 : " + balance + "입니다");
    }


        
}
