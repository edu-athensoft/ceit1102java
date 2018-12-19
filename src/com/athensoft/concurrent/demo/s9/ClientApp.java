package com.athensoft.concurrent.demo.s9;

/**
 * Implement a simple cache with HashMap
 *
 * applying synchronized map
 *
 * DataMap contains source data
 *
 * SimpleCache is the core unit for caching
 *
 * WorkThread is a user of cache
 *
 * ClientApp is the program entrance and has the main flow
 */
public class ClientApp {
    public static void main(String[] args) {

        DataMap.showData();

        SimpleCache scache = new SimpleCache();
        scache.showData();

        Thread t1 = new Thread(new WorkThread(scache),"Work1");     //simulate user 1
        Thread t2 = new Thread(new WorkThread(scache),"Work2");     //simulate user 2
        //Thread t3 = new Thread(new WorkThread(scache),"Work3");     //simulate user 3


        try{
            t1.start();
            t2.start();
           // t3.start();
            t1.join();
            t2.join();
            //t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scache.showData();

    }
}
