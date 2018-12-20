package com.athensoft.concurrent.activity3.s1;

/**
 * Activity 3-1. Major concurrency operation
 *
 * suspend -> wait() with a signal
 * resume -> notify() with a signal
 * join()
 * Thread.sleep()
 */
public class MainApp {

    public static void main(String args[]) {
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();

        try {
            Thread.sleep(1000);
            R1.suspend();
            System.out.println("Suspending First Thread");

            Thread.sleep(1000);
            R1.resume();
            System.out.println("Resuming First Thread");

            R2.suspend();
            System.out.println("Suspending thread Two");

            Thread.sleep(1000);
            R2.resume();
            System.out.println("Resuming thread Two");

        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        try {
            System.out.println("Waiting for threads to finish.");
            R1.t.join();
            R2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
