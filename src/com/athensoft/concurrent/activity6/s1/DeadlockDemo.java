package com.athensoft.concurrent.activity6.s1;

/**
 * Activity 6-1. A demo of deadlock due to obtaining locks in different order by two threads
 *
 * To run multiple times to get various results
 */
public class DeadlockDemo {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String args[]) {
        System.out.println("Main thread started.");
        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
        T1.start();
        T2.start();
        try{
            T1.join();
            T2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread exited.");
    }

    private static class ThreadDemo1 extends Thread {

        public void run() {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}

            synchronized (Lock1) {
                System.out.println("Thread 1: Holding lock 1...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for lock 2...");

                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread {

        public void run() {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}

            synchronized (Lock2) {
                System.out.println("Thread 2: Holding lock 2...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for lock 1...");

                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}
