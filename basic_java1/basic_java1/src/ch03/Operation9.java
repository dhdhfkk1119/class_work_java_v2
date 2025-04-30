package ch03;

public class Operation9 {

    public static void main(String[] args) {
        int number = 1;
        // 1. 삼항 연산자로 홀/짝수 판단
        // String --> 문자열 --> "안녕 반가워"
        String result = number % 2 == 0 ? "작수" : "홀수";
        System.out.println("result : " + result);

        boolean isOK = (5 > 3) ? true : false;
        System.out.println("isOk : " + isOK);
        
        //두 수 중에 큰 수를 max 라는 변수에 담고 출력 하시오
    }


}
