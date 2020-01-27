package com.company;

public class SystemThreadPrac {
    public static void main(String args[]){
        //ThreadGroup system=Thread.;
        System.out.println(Thread.currentThread().getThreadGroup().getParent());
        Thread[] t=new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        System.out.println(Thread.currentThread().getThreadGroup().enumerate(t));
        for(Thread t1:t){
            System.out.println(t1.getName()+"..."+t1.isDaemon());
        }
        //Thread[] t=new Thread[System.ac]

    }
}
