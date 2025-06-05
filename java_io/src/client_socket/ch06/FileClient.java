package client_socket.ch06;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
    private static final int PORT = 5000;
    private final String name;
    private Socket socket;
    private OutputStream out;
    private InputStream in;
    private final Scanner scanner = new Scanner(System.in);

    public FileClient(String name) {
        this.name = name;
    }

    private void connectToServer() throws IOException {
        socket = new Socket("localhost", PORT);
        System.out.println("서버에 연결되었습니다");
    }

    private void setupStreams() throws IOException {
        out = socket.getOutputStream();
        in = socket.getInputStream();
        System.out.println("소켓과 연결된 바이트 기반 스트림 준비 완료");
    }

    /* 키보드에소 파일 경로를 입력 받아서 서버로 파일 보내기 */
    private void uploadFile() throws IOException {
        System.out.println("보내고 싶은 파일 경로를 입력하세요 ");
        String filePath = scanner.nextLine();
        // 방저적 코드 작성
        // 파일이 정말 있는지 확인
        File file = new File(filePath);
        if (!file.exists() && !file.isFile()) {
            System.out.println("그 파일은 없습니다");
            return;
        }
        // 서버측과의 약속
        // 서버측에서 먼저 in.read(100byte) , 클라이언트가 100먼저 보내기로 함
        System.out.println("보낼 파일을 선택하시오");
        String fileName = file.getName();
        byte[] nameBytes = fileName.getBytes(); // 우리가 작성하는 파일이름을 가져옴
        byte[] nameBuffer = new byte[100]; // 해당 파일의 길이를 100으로 제한함(byte)
        // 파일이름이 100칸보다 길면 안됨
        if (nameBytes.length > 100) {
            System.out.println("파일 이름이 너무 길니다");
            return;
        }
        for (int i = 0; i < nameBytes.length; i++) {
            nameBuffer[i] = nameBytes[i];
        }
        // 서버측으로 파일 이름부터 보내기
        out.write(nameBuffer);
        out.flush();

        // 파일 내용을 바이트로 변환 해서 보내주어야 한다
        try (FileInputStream fis = new FileInputStream(file)) {
            while (true){
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                out.flush();

                // 서버측에 바이트를 다 받으면 메세지를 보내기로 함
                byte[] responseBuffer = new byte[1024];
                int responseLength = in.read(responseBuffer);
                String response = new String(responseBuffer, 0, responseLength);
                System.out.println("서버가 말해요 : " + response);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cleanup() {
        try {
            if (socket != null) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 실행에 흐름 지정하는 메서드 만들기
    public void fileStart() {
        try {
            connectToServer();
            setupStreams();
            uploadFile();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            cleanup();
        }

    }

    public static void main(String[] args) {
        FileClient fileClient = new FileClient("오승운");
        while (true) {
            fileClient.fileStart();
        }
    }


}
