package com.athensoft.concurrent.activity2.s2;

import com.athensoft.concurrent.activity2.s1.RunnableDemo;

/**
 * Activity 2-2. Create a thread by Thread class
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
