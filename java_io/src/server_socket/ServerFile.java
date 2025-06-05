package server_socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 서버측 코드
* 간단한 네트워크를 통한 서버측 프로그래밍에 필요한 준비물
* 1. 서버 소켓이 필요하다
* 2. IP와 포트 번호가 필요하다 (0 ~ 65535) 번까지 설정 컴퓨터마다)
* 3. 사전 기반 지식 - 잘 알려진 포트 번호 - 주로 시스템 레벨에서 선점 포트 번호 (0 부터 1023번까지)
* */
public class ServerFile {
    public static void main(String[] args) {

        // 소켓 통신을 하기 위해서(서버측)
        // 1. 서버 소켓이 필요하다 (서버측만 가지면 됨)
        // 서버 소켓을 선언 합니다
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(5001); // 누가 서버 포트를 사용하면 오류 가 뜸
            System.out.println("서버를 시작합니다 포트번호 - 5001");
            // 클라이언트측 연결을 기다립니다 
            // 내부 적을 while 대기 타고 있음 ( 클라이언트 연결 요청 할 때 까지)
            Socket clientSocket = serverSocket.accept();
            System.out.println("클라이언트 연결을 하였습니다");
            // 클라이언트에서 보낸 데이터를 읽기 위한 입력 스트림이 필요하다.
            // 바이트 단위로 데이터를 읽을 수 있음
            // 문자 기반에 스트림으로 확장 + 보조 스트림
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            while(reader.readLine() != null){
                System.out.println("메세지입니다 : " + reader.readLine());
            }



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    System.out.println("서버 소켓 종료 중 오류 발생");
                    e.printStackTrace();
                }
            }
        }
    }
}
