package com.composition;

public class Computer {
    String CpuName = "인텔";
    int ram = 1;

    Cpu cpu;

    public Computer() {
        cpu = new Cpu();

    }



    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.CpuName);
        System.out.println(computer.ram);
    }

}
