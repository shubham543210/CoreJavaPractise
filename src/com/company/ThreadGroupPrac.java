package com.company;

public class ThreadGroupPrac implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("inside run method " + Thread.currentThread().getName());
        }

    }
}

class main4 {
    public static void main(String args[]) {
        ThreadGroupPrac runnable = new ThreadGroupPrac();
        ThreadGroup tg1 = new ThreadGroup("GROUP_A");
        Thread t1 = new Thread(tg1, runnable, "one");
        Thread t2 = new Thread(tg1, runnable, "two");
        Thread t3 = new Thread(tg1, runnable, "three");
        t1.start();
        t2.start();
        t3.start();
        tg1.list();
       // System.out.println(tg1.getName());
    }
}
