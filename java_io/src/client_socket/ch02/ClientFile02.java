package client_socket.ch02;

/*
* 클라이어트 측 코드
* 1:1 양방향 통신 구현하기
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientFile02 {
    public static void main(String[] args) {
        // 1. 연결해야 할 IP 주소와 포트 번호가 필요하다
        // 2. 소켓이 필요 하다
        // 3. 출력 스트림 필요
        // 4. 입력 스트림 필요
        Socket socket = null;
        try {
            socket = new Socket("localhost",5000);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 서버로 부터 데이터를 응답 받기
            String str = reader.readLine();
            System.out.println("서버에서 온 메세지 : " + str);

            // reader 통해서 데이터를 읽을 수 있음
            writer.write("My Name Is TransFormer");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    System.out.println("클라리언트 오류가 발생발생");
                    e.printStackTrace();
                }
            }
        }
    }
}
