package ch04;

/*
 * 보조 기반 스트림에 대해서 알아 보자
 * 기반 스트림이 있어야 사용할 수 있다
 * (InputStream , InputStreamReader, outputStream, OutputStreamWriter)
 * */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;

public class ByteBufferedKeyboardConsole {
    public static void main(String[] args) {
        // 바이트 기반 스트림 + 버퍼드 스트림
        // System.in read()

        try (BufferedInputStream bis = new BufferedInputStream(System.in);
             BufferedOutputStream bos = new BufferedOutputStream(System.out);) {
            /*
            * 보조 스트림을 확용해서 한번에 1024바이트 크기의 버퍼 배열로 데이터를 읽자 */
            byte[] buffer = new byte[1024];
            int bytesRead;
            // bis.read(); // 1 바이트 씩 읽음
            // bis.read(buffer); // 1024 바이트 씩 읽음
            while((bytesRead = bis.read(buffer)) != -1){
                // System.out.println()
                bos.write(buffer,0,bytesRead);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
