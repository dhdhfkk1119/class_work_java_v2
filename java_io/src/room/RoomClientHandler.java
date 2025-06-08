package room;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class RoomClientHandler extends Thread {
    private Socket socket;
    private RoomInfo room;
    private PrintWriter out;
    private BufferedReader in;

    public RoomClientHandler(Socket socket, RoomInfo room) {
        this.socket = socket;
        this.room = room;
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            String msg;
            while ((msg = in.readLine()) != null) {
                out.println(msg);
                for (Socket s : room.clients) {
                    if (s != socket) {
                        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
                        pw.println("[방 " + room.name + "] " + msg);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("클라이언트 연결 해제됨");
        }
    }
}
