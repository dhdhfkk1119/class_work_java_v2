package server_socket.ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

/**
 * 약속
 *
 * 방 개념 /
 * 클리언트 --> 방 생성
 * 서버 ---> 모든 클라이언트에 생성 된 방 이름을 알려 줘야 하고
 * 특정 생성 1번 들가겠다.. 1 번 --- 클라이언트 주고 받아야 함
 * // 누가 접속 유저 목록
 * // 쪽지 보내기
 * /// 대깃길
 * 하나의 서버에 여러명이 들어온다 // 선택 메뉴 1 방에 입장 , 2 방을 생성 , 3생성된 방의 목록
 * 1.  해당 방에 대한 이름을 입력 방에 입장
 * 2. 문구입력 방을 만드시겠습니까? 이름을 입력시 해당 방이 만들어짐
 * 3. 생성된 방의 목록을 보여줌 (이름)
 * // 하나의 서버에 클라이언트가 들어오는데 ? 이 방을 어떻게 만들지?
 *
 */

public class RoomServer {

    private static final int PORT = 5000;
    // 자료 구조가 필요함
    private static Vector<PrintWriter> clientWriters = new Vector<>();
    private static int connectedCount = 0;

    public static void main(String[] args) {
        try (ServerSocket socket = new ServerSocket(PORT)){
            System.out.println("클라이언트 연결");
            Scanner scanner = new Scanner(System.in);
            while(true){
                new ClientHandler(socket.accept()).start();
                connectedCount++;
                System.out.println("소켓 생성완료");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class ClientHandler extends Thread{
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;
        private int numberS;


        public ClientHandler(Socket socket){
            this.socket = socket;
        }
        // 번호 선택
        private void selectNumber(int number){
            System.out.println("번호를 선택해 주세요 1.방입장 , 2.방생성, 3.방목록");

            if(number == 1){
                createRoom();
            } else if (number == 2) {
                visitRoom();
            } else {
                listRoom();
            }
        }

        private void createRoom(){
            System.out.println("방을 생성 : 이름입력");
        }

        private void visitRoom(){
            System.out.println("방에 들어감 : 방이름");
        }

        private void listRoom(){
            System.out.println("방목록: 방이름");
        }


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
                    selectNumber(numberS);
                    for(PrintWriter writer : clientWriters){
                        selectNumber(Integer.parseInt(message));
                        writer.println("방송 : " + message);
                    }
                }

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
