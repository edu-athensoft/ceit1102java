package com.athensoft.concurrent.activity2.s2;

/**
 * Activity 2-2. Create a thread by Thread class
 *
 */
class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    public ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );

        try {

            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);

                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void startThread () {
        System.out.println("Starting " +  threadName );

        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

