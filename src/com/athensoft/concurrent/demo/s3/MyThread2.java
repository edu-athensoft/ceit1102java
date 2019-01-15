package com.athensoft.concurrent.demo.s3;

public class MyThread2 extends Thread {
    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("1");
        System.out.print("2");
    }
}
