package server_socket.ch04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer extends Thread {
    public static void main(String[] args) {
        // 메인쓰레드
        System.out.println("=========== 서버 실행 ===========");
        ServerSocket serverSocket = null;
        Socket clientSocket = null;

        try {
            serverSocket = new ServerSocket(5000);
            clientSocket = serverSocket.accept();
            System.out.println("------- client connected --------");

            // 1. 키보드에서 값을 받는 스트림
            // 2. 클라이언트측과 연결된 출력 스트림이 필요하다. ( 데이터를 보낼 예정 )
            // 3. 클라이언트 측과 연결된 입력 스트림이 필요하다 ( 데이터를 받을 예정 )

            // 1. 바이트 , 문자기반 + 보조 스트림
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            // 2. clientSocket 소켓에서 출력 스트림을 뽑아 보자
            // 바이트 기반 스트림은 -> 문자 기반 스트림으로 확장
            PrintWriter writeStream = new PrintWriter(clientSocket.getOutputStream(),true);

            // 3. 클라이언트 소켓에서 문자 받기
            BufferedReader readerStream = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // 1.1 동작 고민하기

            // 메인 작업자가 계속 키보드 입력을 받아서 코드로 가져 오는 것은 너무 바쁨

            // 익명 구현 클래스는 반복적인 코드 블록이 많이 생깁니다.
            // 람다 표현식 (사용하는 방법 기준으로 학습)
            Thread keyboardThread = new Thread(() -> {
                try{
                    String SKeyboardMessage;
                    while ((SKeyboardMessage = bufferedReader.readLine()) != null) {
                        /// todo - 클라이언트와 연결된 출력 스트림을 통해서 write, println 처리 예정
                        writeStream.println(SKeyboardMessage);
                        writeStream.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("메세지 전송중 오류가 발생했습니다");
                }
            });


            Thread readThread = new Thread(() -> {
                try{
                    // 클라이언트 측으로 부터 데이터를 계속 받는 작업
                    String clientMessage;
                    while ((clientMessage = readerStream.readLine()) != null) {
                        if("exit".equalsIgnoreCase(clientMessage)){
                            System.out.println("클라이언트가 채팅을 종료 했습니다");
                            break;
                        }
                        System.out.println("클라이언트 측으로부터 데이터입니다 : " + clientMessage);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("메세지 전송중 오류가 발생했습니다");
                }
            });
            keyboardThread.start();
            readThread.start();

            // 쓰레드가 종료 될때까지 메인 쓰레드 종료 하지마 (main)
            readThread.join();
            keyboardThread.join();



        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("서버실행중 오류 발생");
        } finally {
            try {
                if (clientSocket != null) clientSocket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("자원 해제 중 오류 발생");
            }
        }
    }
}
