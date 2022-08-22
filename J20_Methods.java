//Methods (in C or C++ -> functions)
//syntax of method
/*
return_dataType method_name(parameter){
    //codes
        }
 */

//method should be in class (user defined or in main class)

//here we are making a method to subtract two number with condition
package com.company;

import java.util.Scanner;

public class J20_Methods {
//    static int subtract(int x, int y) //Creating a method with static
//    {
//        int z;
//        z = x-y;
//        return z;
//    }

     int subtract(int x, int y) //Creating a method without static
    {
        int z;
        z = x-y;
        return z;
    }

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two number");
        a = sc.nextInt();
        b = sc.nextInt();
        //if we want to call a method that was declared without static
        //then we have to create a object first and then call the method
        J20_Methods obj = new J20_Methods(); //creating object
        if(a>b) c = obj.subtract(a,b);
        else c = obj.subtract(b,a); //calling methods by object

//        if(a>b) c = subtract(a,b);
//        else c = subtract(b,a);

        System.out.println("Subtraction(no negative): "+c);

    }
}
