package com.athensoft.concurrent.activity4.s1;

public class ClientApp {
    public static void main(String[] args) {
        Chat m = new Chat();
        new T1(m);
        new T2(m);
    }
}
