package com.company;

public class ThreadLocalPrac2 extends Thread {
    static Integer custId = 0;
    public static ThreadLocal tl = new ThreadLocal() {
        protected Integer initialValue() {
            return ++custId;
        }
    };

    ThreadLocalPrac2(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "...executing with custmerId: " + tl.get());
    }
}

class main11 {
    public static void main(String args[]) {
        ThreadLocalPrac2 p1 = new ThreadLocalPrac2("custmer Thread1");
        ThreadLocalPrac2 p2 = new ThreadLocalPrac2("custmer Thread2");
        ThreadLocalPrac2 p3 = new ThreadLocalPrac2("custmer Thread3");
        ThreadLocalPrac2 p4 = new ThreadLocalPrac2("custmer Thread4");
        ThreadLocalPrac2 p5 = new ThreadLocalPrac2("custmer Thread5");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}
