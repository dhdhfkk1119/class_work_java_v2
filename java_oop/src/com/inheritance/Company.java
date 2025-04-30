package com.inheritance;

public class Company {
    public static void main(String[] args) {
        VIPCustomer vip = new VIPCustomer();
        GoldCustomer gold = new GoldCustomer();

        vip.customerId = 1;
        vip.CustomerName = "정우";
        vip.CustomerGrade = "vip";
        vip.calcPrice(10000);

        gold.customerId = 1;
        gold.CustomerName = "우정";
        gold.CustomerGrade = "gold";
        gold.calcPrice(10000);
        
        vip.showCustomerInfo();
        gold.showCustomerInfo();


    }
}
