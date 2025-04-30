package com.function;

/**
 * 함수란 ? 데이터를 받아서 처리하고 결과를 돌려주는 코드 블록이야
 * static -> 객체 없이 바로 호출 가능
 */

public class CalculatorMain {

    public static void main(String[] args) {
        double result = divide(10 ,0);
        System.out.println("result : " + result);
        int num1 = 10;
        int num2 = 20;

        // 더하기 함수 호출
        int sum = add(num1,num2);
        System.out.println(num1 + "+" +  num2 + "=" + sum);

        // 빼기 함수 호출
        int sub = subtract(num1,num2);
        System.out.println(num1 + "-" +  num2 + "=" + sum);

        // 곱하기 함수 호출
        int mul = multiply(num1,num2);
        System.out.println(num1 + "*" +  num2 + "=" + sum);

        // 나누기 함수 호출
        int div = divide(num1,num2);
        System.out.println(num1 + "/" +  num2 + "=" + sum);

        // 짝수 함수 호출
        System.out.println(isEven(num1));
    }

    // 두 숫자를 더하는 함수
    static int add(int a, int b) {
        return a + b;
    }

    // 두 숫자를 뺴는 함수
    static int subtract(int a, int b) {
        return a - b;
    }

    // 두 숫자를 곱하는 함수
    static int multiply(int a, int b) {
        return a * b;
    }

    // 두 숫자를 나누는 함수 ->
    static int divide(int a, int b) {
        // 방어적 코드를 잘 작성해야 한다
        if(b == 0){
            System.out.println("0으로 나눌 수 없습니다");
            return  0;
        }
        return a / b;
    }
    
    // 짝수인지 판별하는 함수
    static boolean isEven(int number){
        return number % 2 == 0;
    }

    // 홀수인지 판별하는 함수
    static boolean isOdd(int number){
        return number % 2 != 0;
    }
}
