package com.company;

public class Runnablepractise implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("inside run method " + Thread.currentThread().getName() +Thread.currentThread().isDaemon());
        }
    }
}

class Main2 {
    public static void main(String args[]) {
        Runnablepractise apple = new Runnablepractise();
        Runnablepractise mango = new Runnablepractise();
        Runnablepractise banana = new Runnablepractise();
        Thread t1 = new Thread(apple);
        Thread t2 = new Thread(mango);
        Thread t3 = new Thread(banana);
        t2.setDaemon(true);
        t1.setName("Apple");
        t2.setName("Mango");
        t3.setName("Banana");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();


    }
}
