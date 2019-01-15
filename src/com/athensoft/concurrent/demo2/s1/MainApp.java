package com.athensoft.concurrent.demo2.s1;

import java.util.concurrent.Executor;

public class MainApp {
    public static void main(String[] args) {
        RunnableDemo R = new RunnableDemo();

        new Thread(R,"thread-1").start();
        new Thread(R,"thread-2").start();


    }
}
