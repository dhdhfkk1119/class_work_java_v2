package room;

import java.io.IOException;
import java.net.Socket;

public class RoomThread extends Thread {
    private RoomInfo room;

    public RoomThread(RoomInfo room) {
        this.room = room;
    }

    @Override
    public void run() {
        try {
            System.out.println("방 [" + room.name + "] 대기 시작 (포트: " + room.port + ")");
            while (true) {
                Socket client = room.serverSocket.accept();
                room.clients.add(client);
                new RoomClientHandler(client, room).start(); // 방 내부 채팅 핸들러
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

