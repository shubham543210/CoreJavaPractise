package com.company;

public class InheritableThreadLocalPrac extends Thread {

    public static InheritableThreadLocal itl = new InheritableThreadLocal() {
        public Object childValue(Object p) {
            return "cc";
        }
    };

    @Override
    public void run() {
        itl.set("pp");
        System.out.println("parent thread value.."+ itl.get());
        ChildThread ct=new ChildThread();
        ct.start();
    }
}
class ChildThread extends  Thread{
    @Override
    public void run() {
        System.out.println("child thread value..."+InheritableThreadLocalPrac.itl.get());
    }
}
class main12{
    public static void main(String args[]) {
        InheritableThreadLocalPrac pt = new InheritableThreadLocalPrac();
        pt.start();
    }
}
