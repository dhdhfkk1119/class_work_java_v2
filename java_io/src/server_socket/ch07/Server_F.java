package server_socket.ch07;

import server_socket.ch05.MultiNServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
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
 *
 */

public class Server_F {

    private static final int PORT = 5000;
    private static final String UPLOAD_URL = "Uploads/";
    // 자료 구조가 필요함
    private static int connectedCount = 0; // 서버에 연결된 수


    // 테스트 코드
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT);) {
            System.out.println("Server Start ------ ");
            // 메인 쓰레드는 무한 루프를 돌면서 클라이언트 연결 요청을 기다린다
            while (true) {
                // 서버에 들어오는 클라이언트 수많큼 서버가 생김
                new Server_F.ClientHandler(serverSocket.accept()).start();
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
    public static class ClientHandler extends Thread {
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        /* 클라이언트와 통신을 처리한다
         * 메시지를 수신하여 모든 클라이언트에게 브로드캐스트학 , 연결시 자원 종료
         * */

        @Override
        public void run() {
            try {
                InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream();

                byte[] nameBuffer = new byte[100];
                in.read(nameBuffer);
                String fileName = new String(nameBuffer).trim();
                System.out.println("파일 이름 수신 : " + fileName);

                // 1. 자료구조에 서버 -- 클라이언트 연결된 출력 스트림을 저장
                // 2. 클라이언트 측과 연결된 출력스트림(PrintWriter)을 자료구조에 저장
                //clientWriters.add(out);

                // 파일을 만드는 방법 -> 메모리상에서 new File(파일경로 + 파일이름);
                // 파일 객체를 메모리에 띄움
                while (true){
                    File file = new File(UPLOAD_URL + fileName);
                    FileOutputStream fos = new FileOutputStream(file);
                    // 파일 내용을 읽고 쓰기 위한 버퍼 (4KB)
                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    // EOF 를 -1로 표현 함
                    while ((bytesRead = in.read(buffer)) != -1) {
                        fos.write(buffer, 0, bytesRead);
                    }
                    System.out.println("서버 컴퓨터에 파일 저장 완료 : " + fileName);
                    out.write("파일 업로드 완료".getBytes());
                    out.write(fileName.getBytes());
                    out.flush();
                }

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("소켓 연결 중 오류 발생");
            } finally {
                try {
                    if (socket != null) socket.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
