package ch02;

public class ConstantTest {

    public static void main(String[] args) {
        // int num = 10;
        // 상수를 선언해 보자

        // final 키워드를 사용하고 , 변수명에 이름을 작성할 떄 대문자 _를 사용한다
        final int MAX_NUM = 100;
        // MAX_NUM = 1; 상수는 한번 값을 초기화 하면 변경할 수 없다

        final int MIN_NUM; // 선언 까지는 가능하다
        // MIN_NUM = 20; -> 변경이 불가능하다

        System.out.println("----------------------------------");

        // 원주율 상수 선언
        final double PI = 3.14159;
        // 원의 반지름을 상수로 선언
        final int RADIUS = 10;

        // 원의 둘레 계산해보자
        // 2 * PI * 원의 반지름
        double circle = 2 * PI * RADIUS;
        System.out.println(circle);

        // 원의 면적 계산 공식 (반지름 * 반지름 * PI)
        double half_cicle = PI * PI * RADIUS;

    }


}
