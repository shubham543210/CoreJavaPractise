package com.company;

import java.io.IOException;
import java.util.Scanner;

public class UpdatedCatchPrac {
    public static void main(String args[]){
        int a=10;
        try{
            int b=a/0;
          /*  Scanner sc=new Scanner(System.in);
            sc.nextInt();*/

        }
        //we can catch multiple catch in same exception.
        catch(ArithmeticException e){

            throw new NullPointerException();
        }
    }
}
