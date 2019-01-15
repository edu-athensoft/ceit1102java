package com.athensoft.concurrent.demo.s3;

public class MyThread1 extends Thread {
    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("A");
        System.out.print("B");
    }
}
