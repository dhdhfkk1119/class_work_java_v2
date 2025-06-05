package ch03;

/*
 * 문자 기반 스트림을 사용하자.
 * 1. 키보드에서 값을 받아서 파일에 쓰기
 * 2. 다시 그 파일을 익는 함수를 만들어서 실행 하기
 * */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileStreamUserInput {
    public static void main(String[] args) {
        writeUserInputToFile("readToFile.txt");
        //readUserOutputToFile("readToFile.txt");
    }

    // 키도드에서 입력을 받아 파일에 쓰는 함수를 만들어보세요
    public static void writeUserInputToFile(String fileName) {
        System.out.println("적고싶은 문자를 적으시오 ctrl + d 를 입력하면 종료됨");
        try (InputStreamReader reader = new InputStreamReader(System.in);
             FileWriter writer = new FileWriter(fileName, true)) {
            int writeTo;
            while ((writeTo = reader.read()) != -1) {
                writer.write(writeTo);
                writer.flush();
            }
            System.out.println("파일에 정상적으로 잘 기록 하였습니다");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 파일에서 텍스트를 읽는 함수 만들어 보기
    public static void readUserOutputToFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            int readto;
            while ((readto = reader.read()) != -1) {
                System.out.print((char) readto);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
