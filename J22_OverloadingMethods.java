//Overloading Methods
/*
In Java, it is possible for a class to contain two or more methods with the same name but
with different parameters. Such methods are called Overloaded methods
 */

package com.company;

public class J22_OverloadingMethods {
    static void hello(){
        System.out.println("Hello! Good People!");
    }
    static void hello(String name){
        System.out.println("Hello! "+name+", How are you?");
    }
    static void hello(int a){
        for(int i=1; i<=a; i++)
            System.out.println("Hello");
    }
    static int hello(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        //overloading method
            //calling the method hello() with different arguments
        hello(); //without any argument
        hello("Shawon"); //with string argument
        hello(3); // with 1 integer argument
        System.out.println(hello(1,4)); //with 2 integer arguments and returning value
    }
}


//Output
/*
Hello! Good People!
Hello! Shawon, How are you?
Hello
Hello
Hello
5
 */