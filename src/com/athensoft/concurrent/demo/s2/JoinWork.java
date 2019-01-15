package com.athensoft.concurrent.demo.s2;

/**
 * Demo : join
 *
 * the current thread comes to block and wait for the threads (t.join()) to finish their work
 */
public class JoinWork implements Runnable{

    @Override
    public void run() {
        for(int i=20; i>0; i--){
            String msg = Thread.currentThread().getName()+" : "+i;
            System.out.println(msg);
        }
    }
}
