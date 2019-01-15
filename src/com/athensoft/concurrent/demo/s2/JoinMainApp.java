package com.athensoft.concurrent.demo.s2;

/**
 * Demo : join
 *
 * the current thread comes to block and wait for the threads (t.join()) to finish their work
 */
public class JoinMainApp {
    public static void main(String[] args) {
        Thread t1 = new Thread(new JoinWork(),"Thread-1");
        Thread t2 = new Thread(new JoinWork(),"  Thread-2");
        Thread t3 = new Thread(new JoinWork(),"     Thread-3");

        System.out.println("Thread-main started.");

        t1.start();
        t2.start();
        t3.start();

        try{
            Thread.sleep(100);

            t1.join();
            t2.join();
            t3.join();

            System.out.println("Thread-main exited.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
