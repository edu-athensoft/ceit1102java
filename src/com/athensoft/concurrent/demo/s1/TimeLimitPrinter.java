package com.athensoft.concurrent.demo.s1;

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
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tp.setTimeUp(true);
    }
}
