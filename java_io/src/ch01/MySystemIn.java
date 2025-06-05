package ch01;

/*
* 표준 입출력이란 ?
* 자바에서 표준 입출력은 프로그램과 사용자 간의 기본적인 데이터 교환 방법을 제공 합니다
* */

import java.io.IOException;

public class MySystemIn {
    public static void main(String[] args) {
        // 표준 입출력 - 키보드 , 모니터
        // System.in , System.out , System.err

        // 키보드에서 값 입력 받기 (Scanner)
        System.out.println("알파벳 하나를 쓰고 Enter 키를 누르세요");
        int i; // 입력된 바이트를 저장할 변수
        try {
            // system in read() 는 키보드에서 1바이트를 읽어 ASCII 코드(0~255) 값으로 반환 처리
            // 주의 한글(3바이트)는 처리 불가 깨진 문자나 의미 없는 정수값을 출력 함
            i = System.in.read();
            System.out.println(i);
            System.out.println((char)i);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
