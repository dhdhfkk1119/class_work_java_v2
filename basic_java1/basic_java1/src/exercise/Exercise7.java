package exercise;

public class Exercise7 {
    public static void main(String[] args) {
        
        // 1. for 구문 1 부터 100 까지 반복하는 반복문 작성
        // 만약 i 값이 33이라면 반복문을 멈추는 코드를 작성하시오.

        for (int i=1;i<=100;i++){
            if(i == 34){
                break;
            }
            System.out.println("i = " + i);
        }

        // 2. 1부터 10까지 숫자중에서 홀수면 건너뛰고 짝수만 출력하시오
        for (int i=1;i<=10;i++){
            if(i % 2 != 0){
                System.out.println("홀수 패스 = " + i);
                continue;
            }
            System.out.println("짝수 = " + i);
        }
        
    }
}
