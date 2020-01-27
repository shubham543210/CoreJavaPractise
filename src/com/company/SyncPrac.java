package com.company;

public class SyncPrac implements Runnable {
    int a = 0;

    public void run() {
        synchronized (this){
            for (int i = 0; i <= 50; i++) {
                System.out.println(a++);
            }
        }
    }
}

class main5 {
    public static void main(String args[]) {

        SyncPrac runnable = new SyncPrac();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
