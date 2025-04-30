package com.oop1;

public class MainTest {

    public static void main(String[] args) {
        Student s1 = new Student("티모",10000);
        Bus bus1 = new Bus(113);
        Bus bus2 = new Bus(97);

        s1.takeBus(bus1);
        s1.showInfo();


        bus1.showInfo();
    }
}
