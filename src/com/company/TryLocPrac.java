package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class TryLocPrac extends Thread {
    //checkout class level ReentrantLock here
    static ReentrantLock i=new ReentrantLock();
    TryLocPrac(String name){
        super(name);
    }
    public void run(){
        //notice that lock is checked on ReentrantLock object.
        if(i.tryLock()){
            System.out.println(Thread.currentThread().getName()+"...got lock and performing safe operation");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
                i.unlock();
            }
        }
        else{
            System.out.println("unable to get lock performing alternate operation..." +Thread.currentThread().getName());
        }
    }

}
class main8{
    public static void main(String args[]){
        TryLocPrac t1=new TryLocPrac("First Thread");
        TryLocPrac t2=new TryLocPrac("Second Thread");
        TryLocPrac t3=new TryLocPrac("Third Thread");
        t1.start();
        t2.start();
        t3.start();
    }
}
