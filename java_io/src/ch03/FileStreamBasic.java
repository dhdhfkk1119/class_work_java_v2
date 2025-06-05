package ch03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileStreamBasic {
    public static void main(String[] args) {
        //writeToFile("basic_output.txt");
        readFromFile("basic_output.txt");
    }

    // 파일에 텍스트를 쓰는 함수(문자 기반 스트림)
    public static void writeToFile(String fileName) {
        /*
         * FileWriter 는 문자 기반 출력 스트림으로, 텍스트를 파일에 기록할 수 있다
         * */
        try (FileWriter writer = new FileWriter(fileName);) {
            String text = "자바 문자 기반 스트림예제\n";
            writer.write(text); // 파일이 없ㄷ가면 새로운 파일생성, 텍스트를 파일에 쓴다
            writer.write("문자열을 기록합니다");
            // 스트림을 비워 주자. 물을 내리다.
            writer.flush();
            System.out.println("파일에 텍스트를 잘 기록 하였습니다");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static  void readFromFile(String fileName){
        /*
        * FileReader 는 문자 기반 입력 스트림으로, 파일에서 텍스트를 읽음*/
        try(FileReader reader = new FileReader(fileName)){
            int readto;
            while ((readto = reader.read()) != - 1 ){
                System.out.print((char) readto);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
