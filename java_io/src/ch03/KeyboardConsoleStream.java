package ch03;

import java.io.*;

/*
 * 바이트 단위 스트림에 이름 형태
 * InputStream(System.in), OutputStream(System.out)
 * 문자 기반 스트림에 이름 형태
 * xxxReader, xxxWrite (문자 기반 형태 네이밍 형식)
 * */

public class KeyboardConsoleStream {
    public static void main(String[] args) {
        /*
        * InputStreamReader 의 read() 메서드는 하나의 문자를 읽어서 그 문자의 유니코드 값으로
        * 그 문자의 유니코드(UTF-8) 값으로(정수값) 반환합니다.
        * */

        // 입력을 받으면  // 콘솔창에 출력을해줌
        try(InputStreamReader reader = new InputStreamReader(System.in);
            PrintWriter writer = new PrintWriter(System.out);){
            System.out.println("텍스트를 입력하세요 (종료 하러면 ctrl + D");
            int charCode;
            while ((charCode  = reader.read()) != -1){
                //System.out.print((char) charCode);
                writer.println((char) charCode);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
