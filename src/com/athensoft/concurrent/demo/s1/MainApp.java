package com.athensoft.concurrent.demo.s1;

public class MainApp {
    public static void main(String[] args) {
        WorkThread wt = new WorkThread();
        WorkThread wt2 = new WorkThread();
        wt.start();
        wt2.start();

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WorkThread.isWork = false;
    }
}
