package com.athensoft.concurrent.activity2.s1;

/**
 * Activity 2-1. Create a thread using Runnable interface
 *
 * program entrance
 */
public class TestThread {

    public static void main(String args[]) {
        RunnableDemo r1 = new RunnableDemo("Thread-1");
        r1.startThread();

        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r2.startThread();
    }
}
