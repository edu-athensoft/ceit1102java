package com.athensoft.concurrent.activity4.s1;

public class Chat {
    boolean flag = false;

    public synchronized void question(String msg) {

        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" : \t"+msg);
        flag = true;
        notify();
    }

    public synchronized void answer(String msg) {

        if (!flag) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" : \t"+msg);
        flag = false;
        notify();
    }
}
