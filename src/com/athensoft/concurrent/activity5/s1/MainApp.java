package com.athensoft.concurrent.activity5.s1;

import com.athensoft.concurrent.activity5.s1.WorkThread;

public class MainApp {
    public static void main(String args[]) {
        PrintDemo PD = new PrintDemo();

        WorkThread T1 = new WorkThread("Thread - 1 ", PD);
        WorkThread T2 = new WorkThread("Thread - 2 ", PD);

        T1.start();
        T2.start();

        // wait for threads to end
        try {
            T1.join();
            T2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
