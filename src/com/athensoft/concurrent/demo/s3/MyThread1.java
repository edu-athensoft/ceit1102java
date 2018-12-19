package com.athensoft.concurrent.demo.s3;

public class MyThread1 extends Thread {
    public void run() {
        System.out.print("A");
        System.out.print("B");
    }
}
