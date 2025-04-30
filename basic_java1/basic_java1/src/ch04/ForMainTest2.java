package ch04;

public class ForMainTest2 {
    public static void main(String[] args) {

        // 2 * 1 = 2
        // 2 * 2 = 4
        // 2 * 3 = 6
        // 2 * 4 = 8
        // ...
        // 2 * 9 = 18
        // 화면에 구구단 2단에 모양을 출력하시오.
        // 1. 변수에 활용(효용)

        int num = 2;

        System.out.println(num + " * 1 = " + (num * 1));
        System.out.println(num + " * 2 = " + (num * 2));
        System.out.println(num + " * 3 = " + (num * 3));
        System.out.println(num + " * 4 = " + (num * 4));
        System.out.println(num + " * 5 = " + (num * 5));
        System.out.println(num + " * 6 = " + (num * 6));
        System.out.println(num + " * 7 = " + (num * 7));
        System.out.println(num + " * 8 = " + (num * 8));
        System.out.println(num + " * 9 = " + (num * 9));
        System.out.println("--------------------------");

        // 화면에 3 단을 출력하시오

        num = 3;
        System.out.println(num + " * 1 = " + (num * 1));
        System.out.println(num + " * 2 = " + (num * 2));
        System.out.println(num + " * 3 = " + (num * 3));
        System.out.println(num + " * 4 = " + (num * 4));
        System.out.println(num + " * 5 = " + (num * 5));
        System.out.println(num + " * 6 = " + (num * 6));
        System.out.println(num + " * 7 = " + (num * 7));
        System.out.println(num + " * 8 = " + (num * 8));
        System.out.println(num + " * 9 = " + (num * 9));
        System.out.println("--------------------------");

        // 화면에 4 단을 출력하시오

        num = 4;
        System.out.println(num + " * 1 = " + (num * 1));
        System.out.println(num + " * 2 = " + (num * 2));
        System.out.println(num + " * 3 = " + (num * 3));
        System.out.println(num + " * 4 = " + (num * 4));
        System.out.println(num + " * 5 = " + (num * 5));
        System.out.println(num + " * 6 = " + (num * 6));
        System.out.println(num + " * 7 = " + (num * 7));
        System.out.println(num + " * 8 = " + (num * 8));
        System.out.println(num + " * 9 = " + (num * 9));
        System.out.println("--------------------------");

        // 5단을 출력하시오
        num = 5;
        for (int i = 1; i < 10; i++) {
            System.out.println(num + "X" + i + "=" + (num * i));
        }
        System.out.println("--------------------------");

        // 6단을 출력하시오
        num = 6;
        for (int i = 1; i < 10; i++) {
            System.out.println(num + "X" + i + "=" + (num * i));
        }
        System.out.println("--------------------------");

        // 7단을 출력하시오
        num = 7;
        for (int i = 1; i < 10; i++) {
            System.out.println(num + "X" + i + "=" + (num * i));
        }
        System.out.println("--------------------------");

        // 8단을 출력하시오
        num = 8;
        for (int i = 1; i < 10; i++) {
            System.out.println(num + "X" + i + "=" + (num * i));
        }
        System.out.println("--------------------------");

        // 9단을 출력하시오
        num = 9;
        for (int i = 1; i < 10; i++) {
            System.out.println(num + "X" + i + "=" + (num * i));
        }
        System.out.println("--------------------------");
    }
}
