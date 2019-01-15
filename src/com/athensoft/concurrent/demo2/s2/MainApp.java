package com.athensoft.concurrent.demo2.s2;

public class MainApp {
    public static void main(String[] args) {
        Thread t1 = new ThreadDemo();
        Thread t2 = new ThreadDemo();

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

    }
}
