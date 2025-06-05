package ch02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyTestFileIO {
    public static void main(String[] args) {
        String data = "data to update";
        try(FileOutputStream fos = new FileOutputStream("my1.txt")){
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("bytes 파일 업로드 완료");

            FileInputStream fin = new FileInputStream("my1.txt");
            int i;
            while((i = fin.read()) != -1){
                System.out.print((char) i);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
