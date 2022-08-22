package com.company;

public class Operators {
    public static void main(String[] args)
    {
        int a,b,c,d;
        a = 10;
        b = 5;

        //Arithmetic Operator
        c = a+b;
        d = a%b;
        System.out.println("a+b= "+c);
        System.out.println("a%b= "+d);
        System.out.println("Floating point Modulus: 3.3%2.1= "+(3.3f%2.1f));

        //Comparison Operator
        System.out.println("a>b: "+(a>b));
        System.out.println("a==d: "+(a==d));

        //Logical Operator
        System.out.println("a>b && b<c: "+(a>b && b<c));
        System.out.println("a==b || c>a: "+(a==b || c>a));

        //Bitwise Operator
        System.out.println("Bitwise AND operation: 2&3= "+(2&3));
    }
}
