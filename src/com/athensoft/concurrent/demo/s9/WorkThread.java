package com.athensoft.concurrent.demo.s9;

public class WorkThread implements Runnable{

    public SimpleCache scache;

    public WorkThread(SimpleCache scache){
        this.scache =  scache;
    }

    @Override
    public void run() {
       // Object lock = new Object();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName() + " - obj" + i + ":" + (Integer) scache.getObject("obj" + i));

         }
    }
}
