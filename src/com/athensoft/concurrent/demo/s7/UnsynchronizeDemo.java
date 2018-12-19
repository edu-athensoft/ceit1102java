package com.athensoft.concurrent.demo.s7;

/**
 * non-synchronized
 * 00 or 11 would appear
 */

public class UnsynchronizeDemo {
    private static Object lockObject = new Object();
    private static int x,y;

    private static class Thread1 extends Thread {
        public void run() {
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             {
                x = y = 0;
                 System.out.print("x="+x+" ");
            }
        }
    }

    private static class Thread2 extends Thread {
        public void run() {
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             {
                x = y = 1;
                 System.out.print("y="+y+" ");
            }
        }
    }

    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            System.out.print("Round #"+(i+1)+"\t");
            Thread t1 = new Thread1();
            Thread t2 = new Thread2();

            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
