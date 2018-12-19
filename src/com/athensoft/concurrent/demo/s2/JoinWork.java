package com.athensoft.concurrent.demo.s2;

public class JoinWork implements Runnable{

    @Override
    public void run() {
        for(int i=20; i>0; i--){
            String msg = Thread.currentThread().getName()+" : "+i;
            System.out.println(msg);
        }
    }
}
