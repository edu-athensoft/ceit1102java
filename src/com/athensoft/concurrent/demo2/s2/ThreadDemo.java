package com.athensoft.concurrent.demo2.s2;

public class ThreadDemo extends Thread{

    @Override
    public void run(){
        for(int i=0; i<5; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}
