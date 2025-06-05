package server_socket.ch05;

/*
 * 1:N 양뱡향 통신을 구현하는 서버 측 코드
 * 여러 클라이언트와 연결하여 메시지를 수신하고, 모든 클라이언트에게
 * 브로드캐스트 처리 한다
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MultiNServer {

    private static final int PORT = 5000;
    // 자료 구조가 필요함
    private static Vector<PrintWriter> clientWriters = new Vector<>();
    private static int connectedCount = 0;


    // 테스트 코드
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(PORT);) {
            System.out.println("Server Start ------ ");
            // 메인 쓰레드는 무한 루프를 돌면서 클라이언트 연결 요청을 기다린다
            while(true){
                // 서버에 들어오는 클라이언트 수많큼 서버가 생김
                new ClientHandler(serverSocket.accept()).start();
                connectedCount++;
                System.out.println("프라이머리 연결됨");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
     * 각 클라이언트와 통신을 처리하는 쓰레드 내부 클래스
     * */
    public static class ClientHandler extends Thread{
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;

        public ClientHandler(Socket socket){
            this.socket = socket;
        }

        /* 클라이언트와 통신을 처리한다
        * 메시지를 수신하여 모든 클라이언트에게 브로드캐스트학 , 연결시 자원 종료
        * */

        @Override
        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(),true);

                // 1. 자료구조에 서버 -- 클라이언트 연결된 출력 스트림을 저장
                // 2. 클라이언트 측과 연결된 출력스트림(PrintWriter)을 자료구조에 저장
                clientWriters.add(out);
                
                // 클라이언트로 부터 메세지를 수신하고 방송할 예정
                String message;
                while((message = in.readLine()) != null){
                    System.out.println("클라이언트로 부터 받은 메시지 : " + message);
                    for(PrintWriter writer : clientWriters){
                        writer.println("방송 : " + message);
                    }
                }
                // 예시 1
                // 1 사람이라면 out.println("message")

                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("소켓 연결 중 오류 발생");
            } finally {
                try{
                    if(socket != null) socket.close();
                    // static 자료 구조에 저장된 나의 출력 스트림을 제거 하기
                    clientWriters.remove(out);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
