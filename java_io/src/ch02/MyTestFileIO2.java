package ch02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyTestFileIO2 {
    public static void main(String[] args) {
        try(FileInputStream fil = new FileInputStream("my1.txt")){
            int i;
            FileOutputStream fout = new FileOutputStream("my2.txt");
            while ((i = fil.read()) != -1){
                fout.write(i);
                System.out.print((char)i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
