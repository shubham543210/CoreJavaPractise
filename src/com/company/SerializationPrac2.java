package com.company;

import java.io.*;

public class SerializationPrac2 {
    int i=10;
}
class Dog extends SerializationPrac2 implements Serializable {
    int j=20;
}
class main14{
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos =new ObjectOutputStream(fos);
        Dog d1=new Dog();
        oos.writeObject(d1);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog)ois.readObject();

        System.out.println("value of i.."+d2.i);
        System.out.println("value of j.."+d2.j);
    }
}
