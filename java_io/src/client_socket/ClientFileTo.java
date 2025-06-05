package client_socket;

import java.io.*;
import java.net.Socket;

public class ClientFileTo {
    public static void main(String[] args) {
        // 생성자 - 연결하고자 하는 컴퓨터 IP 주소 필요, 포트 번호
        try {
            Socket socket = new Socket("192.168.0.136",5001);
            // 서버로 데이터를 보내기 위한 준비물 필요 하다
            // 출력 스트림이 필요하다 (문자)

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            // 사용자 입력 받기
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
