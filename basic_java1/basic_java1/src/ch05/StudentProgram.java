package ch05;

// 2. 코드를 실행하는 측
public class StudentProgram {

    // 코드의 진입점(메인 함수)
    public static void main(String[] args) {


        // Student 클래스를 메모리에 올려보자.
        // s1 이라는 클래스를 인스턴스화 했다.
        // 인스턴스화란 메모리에 올리는 행위를 말한다.
        Student s1 = new Student();

        int a = 10;

        System.out.println("student :" + s1);
        System.out.println("a :" + a);

        // 변수에 가장 큰 2가지 종류
        // - 기본 데이터 타입 -> 상자에 값이 담긴다
        // - 참조 데이터 타입 -> 주소 값이 담긴다
    }
}
