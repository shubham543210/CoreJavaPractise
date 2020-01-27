package com.company;

import java.io.*;

public class SerializationPrac3 {
    public static void main(String args[]) throws IOException, ClassNotFoundException {

        DogPrac d1=new DogPrac();
        d1.i=101;
        d1.j=202;

        FileOutputStream fos=new FileOutputStream("abc2.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);

        System.out.println("deserialization started");
        FileInputStream fis=new FileInputStream("abc2.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        DogPrac d2=(DogPrac)ois.readObject();

        System.out.println(d2.i+"....."+d2.j);

    }

}

class Animal {
    //since I is coming from non serialized class jvm will track its default value,to make it right it use serializable at parent also.
    int i=10;
    Animal(){
        System.out.println("Animal constructor called");
    }
}
class DogPrac extends Animal implements Serializable{
    int j=20;
    DogPrac(){
        System.out.println("Dog constructor is called");
    }
}
