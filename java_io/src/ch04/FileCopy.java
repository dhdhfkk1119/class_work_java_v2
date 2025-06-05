package ch04;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        // 파일 경로 지정
        String sourceURL = "employees.zip";
        String destinationFileURL = "employees_copy_to.zip";

        // 소요 시간 측정 시작
        long startTime = System.nanoTime();

        // 바이트 기반 스트림으로 테이터를 다룰 수 있다
        try(FileInputStream fis = new FileInputStream(sourceURL);
            FileOutputStream fos = new FileOutputStream(destinationFileURL)){

            // 한 바이트 씩 읽어서 한 바이트 씩 써야한다
            byte[] buffer = new byte[8192]; // 8KB 버퍼
            int data;
            while ((data = fis.read(buffer)) != -1){
                fos.write(data); // 읽은 한 바이트를 한 파일에다가 출력
            }

            System.out.println("입력스트림에서 --> 출력 스트림으로 -> 파일 복사완료");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 소요 시간 측정 종료
        long endTime = System.nanoTime();
        // endTime - startTime
        long duration = endTime - startTime;
        // 소요 시간을 나노초와 초 단위로 출력
        double seconds = duration / 1_000_000_000.0;
        System.out.println("나노초 값 : " + duration);
        System.out.println("소요시간 값 : " + seconds);
    }
}
