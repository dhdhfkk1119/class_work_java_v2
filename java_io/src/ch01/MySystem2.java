package ch01;

/*
* 입력 스트림 키보드에서 프로그램으로 데이터가 들어온다 (스트림을 통해서)
* 기능에 확장을 해보자
* */

public class MySystem2 {
    public static void main(String[] args) {
        System.out.println("알파벳 열 개 쓰고 Enter 를 누르세요");
        int i;
        try{
           while ((i = System.in.read()) != '\n'){
               //읽은 바이트의 정수값을 출력
               System.out.println(i);
           }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
