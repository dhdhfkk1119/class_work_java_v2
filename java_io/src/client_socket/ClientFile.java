package client_socket;

import java.io.*;
import java.net.Socket;

public class ClientFile {
    public static void main(String[] args) {
        // 생성자 - 연결하고자 하는 컴퓨터 IP 주소 필요, 포트 번호
        Socket socket = null;
        try {
            socket = new Socket("192.168.0.136",5001);
            // 서버로 데이터를 보내기 위한 준비물 필요 하다
            // 출력 스트림이 필요하다 (문자)

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
            printWriter.println("테스트 문자입니다");
            printWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    System.out.println("오류가 발생");
                    e.printStackTrace();
                }
            }
        }
    }
}
