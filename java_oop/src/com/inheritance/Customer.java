package com.inheritance;

public class Customer {

    int customerId;
    String CustomerName;
    String CustomerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        
    }

    public int calcPrice(int price) {
        return this.bonusPoint += price * 0.01;
    }

    public void showCustomerInfo(){
        System.out.println("----------------현재 고객의 상태----------------");
        System.out.println("고객 아이디:" + customerId);
        System.out.println("고객 이름 : " + CustomerName);
        System.out.println("고객 등급 : " + CustomerGrade);
        System.out.println("고객 포인트 : " + bonusPoint);
        System.out.println("고객 비율 : " + bonusRatio);
    }
}
