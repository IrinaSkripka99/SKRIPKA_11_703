package sample.server;

public class StartServer {
    public static void main(String[] args) {
        Server server = new Server();
        server.start(6666);

    }
}
