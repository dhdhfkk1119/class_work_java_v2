package room;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * 약속
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
 * 방을 생성시 port 증가 , 소켓 생성  -> 방이름 , port 번호 , 소켓
 * 1. 기존에 서버를 열고 port에 서버로 들어오는 유저들을 각 소켓에 저장해서 연결해준다 .
 * 2. 해당 port에 들어온 유저는 3개를 선택할수있게 해줌
 * - 1. 방생성 : 해당 클라이언트가 방이름을 입력하면 방이름 및 prot 로 서버가 열린다 새롭게 소켓에 연결이된다
 * - 2. 방입장 : 해당 방이름을 입력하면 해당 방으로 입장하기 port로 socket 가 accept 해주면되고
 * - 3. 방 목록 : 현재 생성된 모든 socketList 를 보여준다
 */

public class RoomServer {
    // 자료 구조가 필요함
    private static int PORT = 5001;
    private static Vector<PrintWriter> clientWriters = new Vector<>();

    public static List<List<Socket>> socketList = new ArrayList<List<Socket>>(); // 해당 방 별로 소켓을 연결해준다
    public static List<RoomInfo> rooms = new ArrayList<>(); // 방에 대한 정보를 담는다 (방이름 , 소켓 포트 , 해당 방의 서버 소켓)

    public static void main(String[] args) {
        Socket clientSocket = null; // 소켓 연결
        // 서버 소켓을 연결한다 ( 서버는 계속 열려있어여한다)
        try (ServerSocket socket = new ServerSocket(5000)) {
            System.out.println("5000 포트 연결완료");
            List<Socket> list = new ArrayList<>();
            while (true) {
                clientSocket = socket.accept(); // 클라이언트 요청 대기 및 수락 해당 소켓을 clientSocket에 저장
                // 각 유저마다 clientSocket에 저장한다 유저마다 clientSocket이 생기는거다 
                list.add(clientSocket); // 들어온 유저들을 list 배열에 다시 저장
                System.out.println("소켓 생성완료");
                new ClientHandler(clientSocket, list).start(); // 해당 유저랑 소켓방을 저장
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("서버 소켓 생성 중에 오류발생");
        }
    }

    public static class ClientHandler extends Thread {
        Socket socket;
        List<Socket> CclientList = new ArrayList<>();
        PrintWriter out; // 전체 공지 문구 메세지
        BufferedReader in;
        BufferedReader keyBoardReader; // 키보드 입력을 읽어 냄
        String numberS;


        public ClientHandler(Socket socket, List<Socket> clientList) throws IOException {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 소켓에서 오는 문자를 바이트로 읽음
            keyBoardReader = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력을 읽어 냄
            this.CclientList = clientList;
            this.socket = socket;
        }

        // 클라이언트 입장시 번호 선택
        private void selectNumber(String number) {
            switch (number) {
                case "1":
                    createRoom();
                    break;
                case "2":
                    visitRoom();
                    break;
                case "3":
                    listRoom();
                    break;
                default:
                    out.println("잘못된 번호입니다. 1~3 중 선택해주세요.");
            }
        }

        private void createRoom() {
            out.println("방 이름을 입력하세요:");
            try {
                String roomName = in.readLine(); // 클라이언트 입력 받기
                ServerSocket roomSocket = new ServerSocket(RoomServer.PORT++); // 선언시 방생성
                RoomInfo room = new RoomInfo(roomName, roomSocket.getLocalPort(), roomSocket); // 만들어진 방이름 , 서버 소켓 포트 , 새로운 룸 소켓
                RoomServer.rooms.add(room); // 방 리스트에 추가
                new RoomThread(room).start(); // 이 방의 accept 스레드 시작

                out.println("방 [" + roomName + "] 생성 완료! 포트: " + roomSocket.getLocalPort());
            } catch (IOException e) {
                e.printStackTrace();
                out.println("방 생성 중 오류가 발생했습니다.");
            }
        }

        private void visitRoom() {
            out.println("방을 입장 : 이름입력");
            try {
                String visitName = in.readLine();

                out.println(visitName);
                for (RoomInfo room : RoomServer.rooms) {
                    if (room.name.equals(visitName)) {
                        try {
                            int port = room.port;
                            out.println("방 입장 가능. 포트 번호: " + room.port);
                            Socket roomSocket = new Socket("localhost", port);
                            room.clients.add(roomSocket);
                            out.println(visitName + " 방에 입장하였습니다.");
                            break;
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                    out.println("해당 방이 존재하지 않습니다.");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        private void listRoom() {
            out.println("방목록: 방이름");
            try {
                for (RoomInfo room : RoomServer.rooms) {
                    out.print("방 이름" + room.name); // 방이름
                    out.print("포트 이름" + room.port); // 포트 이름
                    out.print("서버 소켓 정보" + room.serverSocket); // 서버 소켓 정보
                    out.print("현재 접속 유저 수" + room.clients.size()); // 방 들어온 유저 수
                    out.println();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("생성된 방이 없습니다");
            }
        }


        @Override
        public void run() {
            try {

                // 클라이언트의 출력 스트림을 리스트에 저장
                clientWriters.add(out);

                out.println("번호를 선택해 주세요 1.방생성, 2.방입장, 3.방목록");

                String message;
                while ((message = in.readLine()) != null) {
                    numberS = message.trim(); // ✅ 공백 제거
                    selectNumber(numberS);    // 선택 처리

                    for (PrintWriter writer : clientWriters) {
                        writer.println("어떤 사용자가 [" + numberS + "]번을 선택했습니다.");
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("소켓 연결 중 오류 발생");
            } finally {
                try {
                    if (socket != null) socket.close();
                    clientWriters.remove(out);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
