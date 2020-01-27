package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolPrac implements Runnable{

    @Override
    public void run() {
        System.out.println("inside run method "+Thread.currentThread().getId());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class main3{

    public static void main(String args[]){
        //ec object has 10 threads here
        ExecutorService ec= Executors.newFixedThreadPool(10);
        for(int i=0;i<=50;i++){
            //for every loop new work method is created.
            ThreadPoolPrac work=new ThreadPoolPrac();
            //ec can use any of its 10 threads  to do this work which is created
            ec.execute(work);
        }

        ec.shutdown();

    }
}
