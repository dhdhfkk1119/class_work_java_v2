package ch03;

public class Operation8 {
    public static void main(String[] args) {
        
        int number = 5;
        int index = 0;
        
        // 논리 합 (||) 에서 빠른 평가가 되는 식을 만들어 보자.
        // 빠른 평가란 ?
        // 논리 연산에처 첫 번째 조건이 결과를 결정하는 경우, 두 번째 조건을 평가 하지 않는다. !!
        // 논리 합 --> 첫번 째 조건이 true 라면 두번 째 , 세번 째 조건을 확인 안함
        // result -> true
        boolean result = ((number > 2) || (index > 1));
        System.out.println(result);

        
    }
}
