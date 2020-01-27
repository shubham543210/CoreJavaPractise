package com.company;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocPrac3 extends Thread {
    static ReentrantLock l = new ReentrantLock();

    ReentrantLocPrac3(String name) {
        super(name);
    }

    public void run() {
        do {
            try {
                if (l.tryLock(5000, TimeUnit.MICROSECONDS)) {
                    System.out.println(Thread.currentThread().getName() + "... got lock performing operation");
                    Thread.sleep(30);
                    l.unlock();
                    System.out.println(Thread.currentThread().getName() + "...release lock");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "...unable to get lock please try again");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
}

class main9 {
    public static void main(String args[]){
        ReentrantLocPrac3 t1=new ReentrantLocPrac3("First Thread");
        ReentrantLocPrac3 t2=new ReentrantLocPrac3("Second Thread");
        t1.start();
        t2.start();
    }
}
