package client;

public class Client2 {
    public static void main(String[] args) {
        new ChatClient("localhost", 8182, "Client_2").start();
    }
}
