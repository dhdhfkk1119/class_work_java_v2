package client_socket.ch05;

/*
* 서버와 양방향 통신하는 클라이언트 측 코드*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiNClient {
    private final String name;
    private Socket socket;
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;
    private BufferedReader keyBoardReader;

    // 누가 입력했는지 이름을 받아온다
    public MultiNClient(String name){
        this.name = name;
    }

    // 원하는 주소 소켓에 연결한다 당연히 포트 번호도 같아야지
    private void connectToServer() throws IOException {
        socket = new Socket("localhost",5000);
        System.out.println("서버에 연결되었습니다");
    }

    // 입출력 스트림을 설정하는 부분
    private void setupStreams() throws IOException {
        printWriter = new PrintWriter(socket.getOutputStream());
        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 소켓에서 오는 문자를 바이트로 읽음
        keyBoardReader = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력을 읽어 냄
    }
    
    // 서버로 부터 온 메세지를 실제로 읽는 행위
    private Thread createdReadThread() {
        return new Thread(() -> {
            try {
                String serverMessage;
                while ((serverMessage = bufferedReader.readLine()) != null){
                    System.out.println("서버에서 온 메시지 :" + serverMessage);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    // 자신이 작성한 글 입력하고 키보드 입력이 있는동안에 문자를 연결된 서버 소켓으로 보낸다 
    private Thread createWriteThread() {
        return new Thread(() -> {
            try {
                String keyMessage;
                while ((keyMessage = keyBoardReader.readLine()) != null){
                    printWriter.println("[" + name +  "] :" + keyMessage);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    // 메모리 자원 종료 처리
    private void cleanup() {
        try {
            if(socket != null) socket.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
    // 읽기 // 쓰기 스레드를 생성하여 양방향 통신 시작
    private void startedThread() throws InterruptedException {
        Thread readThread = createdReadThread();
        Thread writeThread = createWriteThread();

        readThread.start();;
        writeThread.start();
        readThread.join();
        writeThread.join();

    }
    // 행위
    public void ChatRun(){
        try {
            connectToServer();
            setupStreams();
            startedThread();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            cleanup();
        }
    }

    public static void main(String[] args) {
        System.out.println("클라이언트 프로그램 시작");
        MultiNClient multiNClient = new MultiNClient("이승민");
        multiNClient.ChatRun();
    }
}
