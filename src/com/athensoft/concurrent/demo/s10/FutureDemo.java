package com.athensoft.concurrent.demo.s10;

import java.util.concurrent.*;

public class FutureDemo {
    static int f0 = 1;
    static int f1 = 1;
    static int f2 = 0;

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();

        for(int i=2; i<10; i++) {
            Future<Integer> future = threadPool.submit(new Callable<Integer>() {
                public Integer call() throws Exception {
                    return f0 + f1;
                }
            });
            try {
                f2 = future.get();
                f0 = f1;
                f1 = f2;
                System.out.println(f2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
