package com.athensoft.concurrent.activity4.s1;

/**
 * Client App
 *
 * Program entrance
 */
public class ClientApp {
    public static void main(String[] args) {
        Chat m = new Chat();
        new T1(m);  //question thread
        new T2(m);  //answer thread
    }
}
