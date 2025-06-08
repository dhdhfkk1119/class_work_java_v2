package room;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class RoomInfo {
    public String name;
    public int port;
    public ServerSocket serverSocket;
    public List<Socket> clients = new ArrayList<>();

    public RoomInfo(String name, int port, ServerSocket serverSocket) {
        this.name = name;
        this.port = port;
        this.serverSocket = serverSocket;
    }
}
