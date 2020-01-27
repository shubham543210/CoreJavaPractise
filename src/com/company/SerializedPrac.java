package com.company;

import java.io.*;

public class SerializedPrac implements Serializable {
    transient  final int i = 10;
    int j = 20;
}

class main13 {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        SerializedPrac d1 = new SerializedPrac();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerializedPrac d2 = (SerializedPrac) ois.readObject();

        System.out.println("value of i..."+d2.i);
        System.out.println("value of j..."+d2.j);

    }
}
