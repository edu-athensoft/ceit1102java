package com.athensoft.concurrent.demo.s1;

/**
 * TimeLimitPrinter -- print as many primes as it can in specified seconds
 *
 * Two thread, one is for timer, another is for working
 * How to terminate a thread
 * How to make a thread working for a specified period of time
 */
public class TimeLimitPrinter extends Thread{

    private volatile boolean isTimeUp = false;

    public void setTimeUp(boolean timeUp) {
        this.isTimeUp = timeUp;
    }

    public void run(){

        int count = 0;
        for(;;){
            if(isTimeUp){
                break;
            }
            System.out.println("Working # "+(++count));
        }
    }

    public static void main(String[] args) {

        TimeLimitPrinter tp = new TimeLimitPrinter();
        tp.start();

        try {
            Thread.sleep(10);   //timer thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tp.setTimeUp(true);     //terminate working thread
    }
}
