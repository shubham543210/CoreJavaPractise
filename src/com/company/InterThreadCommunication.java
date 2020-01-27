package com.company;

public class InterThreadCommunication {
    public static void main(String args[]) throws InterruptedException {
        Threadb b = new Threadb();
        b.start();
        //below commands will be executed when main thread gets control
        synchronized (b) {
            System.out.println("main thread trying to call wait method");
            b.wait();
            System.out.println("main thread got control");
            System.out.println(b.total);
        }
    }
}

class Threadb extends Thread {
    int total = 0;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("child thread starts calculation");
            for (int i = 1; i <= 100; i++) {
                total = total + i;

            }
                System.out.println("child thread completed calculation");
                //Thread will notify and release the token
                this.notifyAll();

        }
    }
}
