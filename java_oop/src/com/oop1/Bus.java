package com.oop1;

public class Bus {

    private int busNumber;
    private int count;
    private int money;

    // 생성자
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    // 승객을 태운다
    public void take(int money){
        this.money = money;
    }


    //상태창
    public void showInfo(){
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Count: " + count);
        System.out.println("Money: " + money);

    }
}
