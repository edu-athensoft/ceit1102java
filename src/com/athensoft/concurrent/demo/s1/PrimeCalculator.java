package com.athensoft.concurrent.demo.s1;

/**
 * PrimeCalculator -- calculate as many primes as it can in ten seconds
 *
 * Two thread, one is for timer, another is for working
 * How to terminate a thread
 * How to make a thread working for a specified period of time
 */
public class PrimeCalculator extends Thread{

    public static final int MAX_PRIMES = 50000;
    public static final int TEN_SECONDS = 200;

    public volatile boolean finished = false;   //explain volatile keyword

//    private volatile int[] primesResult = new int[MAX_PRIMES] ;

    public static void main(String[] args) {
        PrimeCalculator calculator = new PrimeCalculator();

        calculator.start();

        try{
            Thread.sleep(TEN_SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        calculator.finished = true;  //terminate the work thread
    }

    public void run(){
        int[] primes = new int[MAX_PRIMES];
        int count = 0;

        for(int i=2; count<MAX_PRIMES; i++){
            // Check to see if the timer has expired
            if (finished) {
                System.out.println("count="+count);
                break;
            }

            boolean isPrime = true;
            for(int j=0; j<count; j++){
                if(i % primes[j] == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes[count++] = i;
                System.out.println("Found prime: " + i);
            }

        }
    }

}
