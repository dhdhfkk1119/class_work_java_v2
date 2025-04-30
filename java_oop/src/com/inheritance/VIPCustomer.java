package com.inheritance;

public class VIPCustomer extends Customer{

    int agentID;
    double salesRatio;

    public VIPCustomer() {
        this.salesRatio += salesRatio * 0.01;
    }

    public int getAgentID() {
        return agentID;
    }
}
