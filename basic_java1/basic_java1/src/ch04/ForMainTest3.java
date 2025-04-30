package ch04;

public class ForMainTest3 {
    public static void main(String[] args) {

        // 1 ~ 50 정수값을 출력 하시오. 만약 그 값이 짝수이면 출력하라
        // 반목문에 if 구문을 활용해서 실행에 흐름을 제어할 수 있다.
        for (int i = 1; i < 51; i++) {
            // i값 짝수라면 ....
            if (i % 2 == 0) {
                //짝수로 판단할 수 있다.
                System.out.println(i);
            }
        }

        // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            // sum = sum + i
            sum += i;
        }

    }
}
