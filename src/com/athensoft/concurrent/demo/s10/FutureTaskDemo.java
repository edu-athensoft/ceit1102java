package com.athensoft.concurrent.demo.s10;


import java.util.Random;
import java.util.concurrent.*;

public class FutureTaskDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        //create 5 tasks by a loop，and put them into FutureTask
        for(int i=0; i<5; i++) {
            Callable<String> c = new Task();
            MyFutureTask ft = new MyFutureTask(c);
            executor.submit(ft);
        }
        executor.shutdown();
    }

}

class MyFutureTask extends FutureTask<String> {

    public MyFutureTask(Callable<String> callable) {
        super(callable);
    }

    //callback, called as the task is done
    @Override
    protected void done() {
        try {
            System.out.println(get() + " Thread executed！");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}

//create a task, and sleep for a few second within 10s randomly
class Task implements Callable<String> {

    public String call() throws Exception {
        Random rand = new Random();
        Thread.sleep(rand.nextInt(10));
        return Thread.currentThread().getName();
    }
}

