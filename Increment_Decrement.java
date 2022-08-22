package com.company;

public class Increment_Decrement {
    public static void main(String[] args) {
        int i = 15;
        System.out.println("i++= "+i++); //first prints 15 then increase i by 1
        System.out.println("i= "+i); //previous increment value i=16
        System.out.println("++i= "+(++i)); //first increase i by 1 (i=16+1) and then prints i=17
        System.out.println("i= "+i); //as i=17, prints 17
        System.out.println("i--= "+i--); //first prints 17 then decrease i by 1
        System.out.println("i= "+i); //previous decrement value i=16
        System.out.println("--i= "+--i); //first decrease i by 1 (i=16-1) and then prints i=15
        System.out.println("i= "+i); //as i=15, prints 15

        //Quick Problem
        /*
        int y=7;
        int x = ++y*8;
        value of x?
        */
        int y=7;
        System.out.println("\nIf y=7;\n++y*8= "+(++y*8));
        /*
        here, the precedence of "++" > "*"
        so, ++y run first then ++y*8 runs
        so, ++y=8; 8*8 = 64 is the answer
         */
        /*
        char a = ‘B’;
        a++ = ?;
         */
        char a = 'B';
        a++;
        System.out.println("\na= "+a);
        /*
        here a will be the letter 'C' because the next letter is C
         */
    }
}
