package ch02;


/*
* 증감 , 감소 연산자 ++ , -- (변수에 접근해서 그 값을 오직 1을 증가 , 감소 시킨다)
*/

public class Operator2 {

    public static void main(String[] args) {
        int a = 1;
        a++; // 오직 1을 증가 시킨다.
        System.out.println("a : " + a);

        int b = 1;
        b--; // 오직 1을 감소 시킨다.
        System.out.println("b : " + b);

        int c = 100;
        // 감소 연산자를 앞에 사용하면 (전위 감소 연산자)
        // 감소 연산자를 뒤에 사용하면 (후워 감소 연산자)
        // ; -> 기준으로 연산하는 시점이 달라 질 수 있다.
        System.out.println(--c);
        System.out.println(c);
    }

}
