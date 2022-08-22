package com.company;

public class J17_Arrays {
    public static void main(String[] args) {

        /*

        int arr[]; //array declaration

        // data_type variable_name[];
        //we can also declare like -> int [] arr;

        arr = new int[5]; //Memory allocation

        // variable_name = new data_type[size]
        // [5] means the array named "arr" size is 5
        //array index are like C -> arr[0],arr[1]...,arr[4]

        */
        /*
        **Declaration, memory allocation and initialization in the same line
        int arr[] = {5,10,15,20,25};
         */

        // we can also declare and allocate memory of an array in same line
        int arr[] = new int[5]; //declaration + memory allocation

        for(int i=0; i<5; i++)
            arr[i] = i*i;
        for(int i=0; i<5; i++)
            System.out.println(arr[i]);
        
        //Array Length
        int arr2[] = {5,10,15,20,25};
        System.out.println("Array2 Length: "+arr2.length);
    }
}
