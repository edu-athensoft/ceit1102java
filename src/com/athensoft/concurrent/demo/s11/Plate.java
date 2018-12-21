package com.athensoft.concurrent.demo.s11;

import java.util.ArrayList;
import java.util.List;

/**
 * Define a plate with which we can put eggs on or get egg from
 */
public class Plate {
    /** The plate which contains egg(s) */
    List eggs = new ArrayList();

    /** Get egg(s) */
    public synchronized Object getEgg() {
        while (eggs.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Object egg = eggs.get(0);
        eggs.clear();       // Clear the plate
        notify();           // notify a certain thread in the blocking queue to get into runnable/ready queue
        System.out.println("    Get an egg");
        return egg;
    }

    /** Put egg(s) */
    public synchronized void putEgg(Object egg) {
        while (eggs.size() > 0) {
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
        private Plate plate;
        private Object egg = new Object();
        public AddThread(Plate plate) {
            this.plate = plate;
        }
        public void run() {
            plate.putEgg(egg);
        }
    }

    /** Consumer */
    static class GetThread implements Runnable  {
        private Plate plate;
        public GetThread(Plate plate) {
            this.plate = plate;
        }
        public void run() {
            plate.getEgg();
        }
    }

    /** Main thread */
    public static void main(String args[]) {
        Plate plate = new Plate();
        for(int i = 0; i<10; i++) {
            new Thread(new AddThread(plate)).start();
            new Thread(new GetThread(plate)).start();
        }
    }
}
