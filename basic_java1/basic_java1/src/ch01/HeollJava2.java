package ch01;

// 모든 자바파일에 코드는 클래스라는 녀석 안에서 작성한다
public class HeollJava2 {

    // 코드의 진입점 main 함수
    public static void main(String[] args) {

        //...println() -> 출력 후 자동으로 콘솔에서 줄바꿈 해줌
        System.out.println("hello java1");
        System.out.println("hello java2");
        System.out.println("hello java3");
        System.out.println("hello java4");

        System.out.println("------------------------------");

        //printf는 포멧팅된 출력을 위해 사용되며, 자동을 줄 바꿈하지 않습니다.
        //printf에 줄바꿈을 원한다면 \n 을 추가해야 합니다 .
        System.out.printf("text1");
        System.out.printf("/");
        System.out.printf("text2 \n");
        System.out.printf("안녕");

        // 이스케이프 시퀀스 \n 으로 줄 바꿈 추가
        // \(백슬래시) -> 시퀀스 라고 부르는 특수 문자 중에 하나 이다.
        // 백슬래시 뒤에 나오는 문자가 특별한 의미를 가지게 된다.

        System.out.printf("HelloWorld");

    }// end of main

}// end of class
