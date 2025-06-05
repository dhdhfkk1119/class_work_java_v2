package ch04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyBuffered {
    public static void main(String[] args) {
        // 파일 경로 지정
        String sourceFilePath = "employees.zip";
        String destinationFilePath = "employees_copy.zip";

        long startTime = System.nanoTime();
        try(FileInputStream fls = new FileInputStream(sourceFilePath);
            FileOutputStream fos = new FileOutputStream(destinationFilePath);
            BufferedInputStream bfis = new BufferedInputStream(fls);
            BufferedOutputStream bfos = new BufferedOutputStream(fos)){

            byte[] bytes = new byte[1024];
            int data;
            while ((data =bfis.read(bytes)) != -1){
                bfos.write(bytes,0,data);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // 소요시간
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("억분에 1초(나노 초 : )" + duration);
        System.out.println("초 :" + duration/1_000_000_000);

    }
}
