package ch02;

/*
* 부호 연산자 ( + , - )
*/
public class Operation1 {

    public static void main(String[] args) {

        //부호 연산자는 사용하는 당시 부호를 변경할 뿐
        //실제 값이 변경되는 것은 아니다
        int intData = 1000;
        System.out.println(+intData);
        System.out.println(-intData);
        System.out.println("--------------------");
        System.out.println(intData);

        //실제 값을 변경하려면 코드를 어떻게 작성해야 할까요?
        //inData 상자 안에 값을 -1000 으로 변경하려면 어떤 연산자를 사용해야 될까요?
        //답) 메모리 공간안에 실제 값을 변경하려면 대입 연산자를 사용해야 된다.

        //절대값이란?
        //절대값은 어떤 수의 크기를 나타내는 것으로 그 수가 0에서 얼마나 떨어져 있는지를 표시한다
        //즉, 어떤 수의 절대값은 그 수 가 양수이든 음수이든 상관없이 항상 양수이다

        //연습
        int oneStepDistance = 1;
        final int ZERO_POINT = 0;
        int currentPosition = 0;

        //제로 포인트에서 왼쪼긍로 3칸 이동한 값을 출력하시오
        currentPosition = ZERO_POINT - (oneStepDistance * 3);
        System.out.println(currentPosition);
        // 절대 값으로 구하시요

        //자바는 풍부한 기능을 제공하는 언어 입니다.
        //자바 개발자들이 수학관련 식을 거의 다 만들어 두었다.
        //Math.abs() 절대값 구해주는 기능이다
        System.out.println(Math.abs(currentPosition));




    }


}
