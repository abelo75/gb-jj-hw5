package client;

public class Client1 {
    public static void main(String[] args) {
        new ChatClient("localhost", 8182, "Client_1").start();
    }
}
