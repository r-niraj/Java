package com.company;
import java.util.Scanner;
public class J11_If_elseConditionals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        // boolean condition = (age >= 18)
        if(age>=18) //if(condition) //if condition is true then if statement runs otherwise else runs
            System.out.println("You're invited.");
        else System.out.println("You're not invited.");
    }
}
