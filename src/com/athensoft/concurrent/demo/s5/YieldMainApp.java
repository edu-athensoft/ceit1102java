package com.athensoft.concurrent.demo.s5;

public class YieldMainApp {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Work(), "T1");
        Thread t2 = new Thread(new Work(), "T2");
        Thread t3 = new Thread(new Work(), "T3");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        t1.yield();
    }
}
