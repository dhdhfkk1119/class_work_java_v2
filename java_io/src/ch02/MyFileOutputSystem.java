package ch02;

/*
 * 파일 출력 스트림을 사용해 보자*/

import java.io.FileOutputStream;

public class MyFileOutputSystem {
    public static void main(String[] args) {
        String data = "Hello, Java FileOutputSystem abc abc 안녕 반가워";
        try (FileOutputStream fos = new FileOutputStream("output.txt",true)) {
            byte[] dataBytes = data.getBytes();
            fos.write(dataBytes);
            
            // 참고 : output.txt 파일을 열었을 때 텍스트로 보이는 이유는 에디터가  
            // 문자로 해석해서 보여 줬기 때문이다
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
