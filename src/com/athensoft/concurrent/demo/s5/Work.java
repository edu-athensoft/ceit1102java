package com.athensoft.concurrent.demo.s5;

public class Work implements Runnable{

    @Override
    public void run() {
        for(int i=10; i>0; i--){
            String msg = Thread.currentThread().getName()+" : "+i;
            System.out.println(msg);
        }
    }
}
