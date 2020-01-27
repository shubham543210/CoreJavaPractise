package com.company;

public class SyncPrac2 extends Thread {

    Display d;
    String name;

    SyncPrac2(Display d,String name){
        this.d=d;
        this.name=name;
    }
    //this sync will not have any effect
    public synchronized void run(){
        d.wish(name);
    }
}
class Display{
    public  synchronized  void wish(String name){
        for(int i=0;i<=10;i++){
            System.out.println("good morning "+name);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class main6{
    public static void main(String args[]){
        Display d= new Display();
        SyncPrac2 t1=new SyncPrac2(d,"Dhoni");
        t1.start();
        SyncPrac2 t2=new SyncPrac2(d,"Yuraj");
        t2.start();

    }
}
