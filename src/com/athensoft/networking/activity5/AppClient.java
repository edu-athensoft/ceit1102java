package com.athensoft.networking.activity5;

public class AppClient {
    public static void main(String[] args) {
        EchoClient ec = new EchoClient();
        Thread t1 = new Thread(ec,"thread-client-1");

        t1.start();
    }
}
