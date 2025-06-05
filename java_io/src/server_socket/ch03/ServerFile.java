package server_socket.ch03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile extends Thread {
    public static void main(String[] args) {
        // 1. 서버 소켓이 필요 포트 번호 5000번
        // 2. 입력 스트림 필요 함 (클라리언트에 메세지 수신)
        // 3. 출력 스트림 필요 함 (클라이언트에 데이터 전송)

        // 서버 소켓 설정
        ServerSocket serverSocket = null;
        try {

            // 클라이언트 연결 대기
            serverSocket = new ServerSocket(5000);
            Socket clientSocket = serverSocket.accept();
            System.out.println("클라이언트가 연결 했습니다");
            // 클라이언트로 부터 데이터를 입력 받을 스트림이 필요 --> Socket
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            // reader <-- 데이터를 읽을 수있다
            // 내가 입력 한 내용을 클라이언트측으로 보내기
            // 클랄이언트 측과 연결된 소켓에서 출력 스트림을 뽑고 + 문자 기반 스트림을 확장했음

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(bufferedWriter, true);

            // 클라이언트 데이터 받기
            String message;
            if ((message = reader.readLine()) != null){
                System.out.println("클라이언트에게 온 메세지 : " + message);
            }

            // 서버에서 데이터 송신해보기
            String line;
            if ((line = br.readLine()) != null && !line.isEmpty()){
                writer.println(line);
                writer.flush();
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
