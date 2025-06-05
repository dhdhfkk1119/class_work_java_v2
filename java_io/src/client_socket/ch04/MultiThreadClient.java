package client_socket.ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiThreadClient {
    public static void main(String[] args) {
        System.out.println("#### 클라이언트 측 실행 #####");
        Socket socket = null;
        try{
            socket = new Socket("localhost",5000);
            // 서버와 통신을 하기 위한 스트림 준비 하기
            // 서버측에 문자열 기반으로 데이터를 보내기 위한 스트림을 준비함
            PrintWriter writerStream = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 키보드에서 값을 입력 받기 위한 스트링
            BufferedReader KeyBoardReader = new BufferedReader(new InputStreamReader(System.in));
            
            // 서버로 부터 데이터를 읽는 쓰레드 생성
            Thread readThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while((serverMessage = bufferedReader.readLine()) != null){
                        System.out.println("서버로 온 메세지 : " + serverMessage);
                        if("exit".equalsIgnoreCase(serverMessage)){
                            System.out.println("서버가 정상적으로 채팅을 종료함");
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("서버로 부터 채팅이 종료되었습니다");
                }
            });
            
            // 서버로 데이터로 보내기
            Thread writeThread = new Thread(() -> {
                try {
                    String serverSpanMessage;
                    while((serverSpanMessage = KeyBoardReader.readLine()) != null){
                        writerStream.println(serverSpanMessage);
                        writerStream.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("서버로 부터 채팅이 종료되었습니다");
                }
            });

            readThread.start();
            writeThread.start();
            // 쓰레드가 종료 될때까지 메인 쓰레드 종료 하지마 (main)
            readThread.join();
            writeThread.join();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("오류 발생 ...");
        } finally {
            try{
                if(socket != null) socket.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
