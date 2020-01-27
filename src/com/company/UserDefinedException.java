package com.company;

import java.util.Scanner;

public class UserDefinedException {

    public static void main(String args[]) {
        //to get user input
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 60) {
            throw new TooOldException("man you are over aged");
        }
        if (age < 18) {
            throw new TooYoungException("kid you are under aged");
        } else {
            System.out.println("you are registered successfully");
        }
    }
}


class TooYoungException extends RuntimeException {
    TooYoungException(String s) {
        //argument passed here is message displayed.
        super(s);
    }
}

class TooOldException extends RuntimeException {
    TooOldException(String s) {
        super(s);
    }
}
