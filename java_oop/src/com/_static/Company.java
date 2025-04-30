package com._static;

public class Company {

    static int emSerialNumber = 1;

    public static void main(String[] args) {
        Employee employee = new Employee("야스오");
        Employee employee1 = new Employee("티모");
        Employee employee2 = new Employee("샤코");
        Employee employee3 = new Employee("홍길동");

        System.out.println("야스오 : " + employee.getEmployeeId());
        System.out.println("티모 : " + employee1.getEmployeeId());
        System.out.println("샤코 : " + employee2.getEmployeeId());
        System.out.println("홍길동 : " + employee3.getEmployeeId());

    }
}
