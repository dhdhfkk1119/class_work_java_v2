package server_socket.ch02;

/*
* 서버측 코드
* 양방향 통신 ( 1 : 1 채팅 )
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile02 {
    public static void main(String[] args) {
        // 1. 서버 소켓이 필요 포트 번호 5000번
        // 2. 입력 스트림 필요 함 (클라리언트에 메세지 수신)
        // 3. 출력 스트림 필요 함 (클라이언트에 데이터 전송)

        // 서버 소켓 설정
        ServerSocket serverSocket = null;
        try{

            // 클라이언트 연결 대기
            serverSocket = new ServerSocket(5000);
            Socket clientSocket = serverSocket.accept();
            System.out.println("클라이언트가 연결 했습니다");
            // 클라이언트로 부터 데이터를 입력 받을 스트림이 필요 --> Socket
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            // reader <-- 데이터를 읽을 수있다
            // 클랄이언트 측과 연결된 소켓에서 출력 스트림을 뽑고 + 문자 기반 스트림을 확장했음
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(),true);
            // writer <-- 데이터를 클라이언트로 보낼 수 있다


            // 데이터 송신해보기
            writer.println("안녕 나는 뭘까? : \n");
            writer.flush();


            // 데이터 수신해보기
            String message = reader.readLine();
            System.out.println("클라이언트에게 온 메세지 " + message);

            
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if(serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
