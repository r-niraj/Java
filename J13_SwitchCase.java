package com.company;
import java.util.Scanner;
public class J13_SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age;
        age = in.nextInt();

        //Normal switch case syntax
        switch (age) {
            case 18:
                System.out.println("You are adult now!");
                break;
            case 23:
                System.out.println("Find a job!");
                break;
            case 25:
                System.out.println("Wedding time!!");
                break;
            case 60:
                System.out.println("Retire and play with your grandchild!!!");
                break;
            default:
                System.out.println("Pray Always");

                //Enhanced switch statement
        /*
        switch (age) {
            case 18 -> System.out.println("You are adult now!");
            case 23 -> System.out.println("Find a job!");
            case 25 -> System.out.println("Wedding time!!");
            case 60 -> System.out.println("Retire and play with your grandchild!!!");
            default -> System.out.println("Pray Always");
        }
        */
        }
    }
}
