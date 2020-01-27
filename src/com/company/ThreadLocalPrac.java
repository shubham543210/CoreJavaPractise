package com.company;

public class ThreadLocalPrac {
    public static void main(String args[]){
        ThreadLocal tl=new ThreadLocal();
        tl.set("initial");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());

    }
}
