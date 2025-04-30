package com.inheritance;

public class GoldCustomer extends Customer {

    int agentID;
    double salesRatio;

    public GoldCustomer() {
        this.salesRatio += salesRatio * 0.01;
    }

    public int getAgentID() {
        return agentID;
    }
}
