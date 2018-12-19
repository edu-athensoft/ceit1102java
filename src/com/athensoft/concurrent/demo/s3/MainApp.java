package com.athensoft.concurrent.demo.s3;

public class MainApp {
    public static void main(String[] args) {
        new MyThread1().start();
        new MyThread2().start();
    }
}
