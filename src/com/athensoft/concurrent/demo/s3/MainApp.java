package com.athensoft.concurrent.demo.s3;

/**
 * Undeterminable executing order
 *
 * Please run it for multiple times to check the results
 */
public class MainApp {
    public static void main(String[] args) {
            new MyThread1().start();
            new MyThread2().start();
    }
}
