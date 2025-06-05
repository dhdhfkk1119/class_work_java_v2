package client_socket.ch03;

import java.io.*;
import java.net.Socket;

public class ClientFile extends Thread{
    public static void main(String[] args) {
        // 1. 연결해야 할 IP 주소와 포트 번호가 필요하다
        // 2. 소켓이 필요 하다
        // 3. 출력 스트림 필요
        // 4. 입력 스트림 필요
        Socket socket = null;
        try {
            socket = new Socket("localhost",5000);

            // 서버로 들어온 값을 읽기 
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 내가 입력 한 내용을서버측으로 보내기
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(bufferedWriter,true);

            // 데이터 보내기
            String line;
            if ((line = br.readLine()) != null && !line.isEmpty()){
                writer.println(line);
                writer.flush();
            }

            // 데이터 받기
            String message;
            while ((message = reader.readLine()) != null){
                System.out.println("서버측으로 부터 메세지 받기 : " + message);
            }
            


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    System.out.println("클라리언트 오류가 발생발생");
                    e.printStackTrace();
                }
            }
        }
    }
}
