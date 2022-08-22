package com.company;

public class J15_Loops {
    public static void main(String[] args) {
        int i = 1;
        //While loop
        while(i!=5){
            System.out.println("I love Bangladesh. <3");
            i++;
        }

        //do while loop
        i = 1;
        do{
            System.out.println("I'm Shawon");
            i++;
        }while(i!=5);

        //for loop
        for(i=1; i<=10; i+=2) {
            System.out.println(i);
        }
    }
}
