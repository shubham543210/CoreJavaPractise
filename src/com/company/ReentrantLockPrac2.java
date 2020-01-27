package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockPrac2 {
    ReentrantLock l=new ReentrantLock();
    public void wish(String name){
        l.lock();
        for(int i=0;i<10;i++){
            System.out.println("good morning "+ name);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        l.unlock();
    }
}
class MyThread extends Thread{
    ReentrantLockPrac2 d;
    String name;
    MyThread(ReentrantLockPrac2 d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}

class main7{
    public static void main(String args[]){
        ReentrantLockPrac2 d=new ReentrantLockPrac2();
        MyThread t1=new MyThread(d,"Dhoni");
        MyThread t2=new MyThread(d,"Yuraj");
        MyThread t3=new MyThread(d,"shubham");
        t1.start();
        t2.start();
        t3.start();

    }
}
