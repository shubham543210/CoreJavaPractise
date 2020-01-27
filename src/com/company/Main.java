package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        // write your code here+
        System.out.println("hello world");
        A apple = new A();
        A mango = new A();
        A banana = new A();
        apple.setName("Apple");
        mango.setName("Mango");
        banana.setName("Banana");
        apple.setPriority(10);
        apple.start();
        mango.start();
        banana.start();
    }
}

class A extends Thread {
    //AtomicInteger a=new AtomicInteger(0);
    int a=0;
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++){
            System.out.println("i am inside run " + Thread.currentThread().getName());
            //a.incrementAndGet();
            a++;
        }
        System.out.println(a);
        //System.out.println(a.get());
    }
}
