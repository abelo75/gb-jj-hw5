package client;

public class Client3 {
    public static void main(String[] args) {
        new ChatClient("localhost", 8182, "Client_3").start();
    }
}
