package com.company;
import java.util.Scanner;

public class J24_Recursion {

    //here we are using recursive function that can call itself again and again
    static int factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of "+num+" is: "+factorial(num));
    }
}
