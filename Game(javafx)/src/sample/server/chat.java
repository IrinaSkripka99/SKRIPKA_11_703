package sample.server;

import java.util.Scanner;

public class chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SocketClient client = new SocketClient();
        client.startConnection("127.0.0.1", 6666);
        while (true) {
            String message = scanner.nextLine();
            client.sendMessage(message);
        }
    }

}
