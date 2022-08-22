package com.company;
import javax.sound.midi.Soundbank;
import java.util.Scanner; //to take input

public class javaInput {
    public  static void main(String[] args)
    {
        System.out.println("Taking Input>>>");
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter number 1");
        //int a = sc.nextInt();
        //float c = sc.nextFloat();
        //System.out.println("Enter number 2");
        //int b = sc.nextInt();
        //float d = sc.nextFloat();
        //int sum = a+b;
        //float sum2 = c+d;
        //System.out.print("The sum of two numbers: ");
        //System.out.println(sum2);

        //Checking a number int or not?
        /*
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
         */
        //Taking string
        /*
        String str1 = sc.next(); //to take input one word
        System.out.println(str1);
         */
        String str2 = sc.nextLine(); //to take input string with spaces
        System.out.println(str2);
    }
}
