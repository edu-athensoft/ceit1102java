package com.athensoft.concurrent.demo.s11;

import java.util.ArrayList;
import java.util.List;

/**
 * Define a plate with which we can put eggs on or get egg from
 */
public class Plate2 {
    /** The plate which contains egg(s) */
    List eggs = new ArrayList();
    private final static int MAX_EGG_NUM = 5;

    /** Get egg(s) */
    public synchronized Object getEgg() {
        while (eggs.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Object egg = eggs.get(0);   //get the first one
        eggs.remove(0);             //remove right after the first one was taken

        //eggs.clear();       // Clear the plate
        notify();           // notify a certain thread in the blocking queue to get into runnable/ready queue
        System.out.println("    Get an egg");
        return egg;
    }

    /** Put egg(s) */
    public synchronized void putEgg(Object egg) {
        while (eggs.size() >= MAX_EGG_NUM) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        eggs.add(egg);      // Put an egg on the plate
        notify();           // notify a certain thread in the blocking queue to get into runnable/ready queue
        System.out.println("Put an egg");
    }

    /** Producer */
    static class AddThread implements Runnable  {
        private Plate2 plate;
        private Object egg = new Object();
        public AddThread(Plate2 plate) {
            this.plate = plate;
        }
        public void run() {
            plate.putEgg(egg);
        }
    }

    /** Consumer */
    static class GetThread implements Runnable  {
        private Plate2 plate;
        public GetThread(Plate2 plate) {
            this.plate = plate;
        }
        public void run() {
            plate.getEgg();
        }
    }

    /** Main thread */
    public static void main(String args[]) {
        Plate2 plate = new Plate2();
        for(int i = 0; i<20; i++) {
            new Thread(new AddThread(plate)).start();
            new Thread(new GetThread(plate)).start();
        }

    }
}
