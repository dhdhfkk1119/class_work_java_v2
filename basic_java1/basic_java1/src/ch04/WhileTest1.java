package ch04;

public class WhileTest1 {
    public static void main(String[] args) {

        int i = 1;
        // 괄호안에 - 조건식 (true , false)
        while (i <= 3){
            System.out.println(i);
            // while 구문을 작성을 할 때 무한 루프를 조심하자!
            // 조건식에 처리가 없다면 무한히 반복한다
            i ++;

        }
        // 1 회차 - 출력, 1에 값 1 증가, while (조건식 확인) -> 1
        // 2 회차 - 출력, 1에 값 1 증가, while (조건식 확인) -> 2
        // 3 회차 - 출력, 1에 값 1 증가, while (조건식 확인) -> 3

        System.out.println("while 종료 후 i 값이 : " + i);
    }
}
