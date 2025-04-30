package ch07;


/*
* 함수 호출과 스택 메모리
* */
public class FunctionMainTest3 {
    public static void main(String[] args) {
        int num1 = 23320230;
        int num2 = 12;
        System.out.println(add(num1,num2));
        System.out.println(subtraction(num1,num2));
        System.out.println(divide(num1,num2));
        System.out.println(multiply(num1,num2));
    }
    
    // 함수를 만들어 보세요
    
    // 덧셈 연산 가능
    static int add(int num1,int num2){
        return num1 + num2;
    }
    // 뺄셈 연산 가능
    static int subtraction(int num1,int num2){
        return num1 - num2;
    }
    // 나눗셈 연산 가능
    static int divide(int num1,int num2){
        return num1 / num2;
    }
    // 곱하는 연산 가능
    static int multiply(int num1,int num2){
        return num1 * num2;
    }
}
