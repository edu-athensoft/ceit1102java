package com.athensoft.concurrent.demo2.s1;

public class RunnableDemo implements Runnable{


    @Override
    public void run() {
        System.out.println("Running " +  Thread.currentThread().getName() );

        try {

            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);

                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println("Thread " +  Thread.currentThread().getName() + " exiting.");
    }


}
