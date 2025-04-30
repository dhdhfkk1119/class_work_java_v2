package ch04;

public class ContinueTest1 {
    public static void main(String[] args) {

        //continue 구문은 보통 반복문 내부에서 조건문(if)와 함께 사용하며,
        // 조건이 맞는 경우(true) 이후 반복문 내부의 다른 수행문을 수행하지 않습니다.
        // - 무시하고 진행하는 continue 이다

        // 1부터 100까지 숫자중에 3의 배수만을 출력
        int num;
        for (num = 1;num<=100;num++){
            //만약 num 값이 3의 배수가 아니라면 ??
            // 3 / 3 != 0 --> F
            if(num % 3 != 0){
                continue;
            }
            System.out.println("num :" + num);
        }

    }// end of main
}// end of class
