package com.athensoft.concurrent.demo.s5;

/**
 * yield does not work due to synchronized
 */
public class WorkSync implements Runnable{

    @Override
    public void run() {
        for(int i=10; i>0; i--){

            synchronized (this) {
                String msg = Thread.currentThread().getName() + " : " + i;
                System.out.println(msg);

                if (i % 4 == 0) {
                    System.out.println(Thread.currentThread().getName() + " yield");
                    Thread.yield();
                }
            }

        }
    }
}
