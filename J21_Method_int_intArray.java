package com.company;

public class J21_Method_int_intArray {
    static void change(int a){ //case 1
        a = 55;
    }

    static void change2(int arr[]){ //case 2
        arr[0] = 5;
    }

    public static void main(String[] args) {
        //Case-1: Changing a integer
        int x = 30; // here x storing the value 5
        change(x); // passing the value
        System.out.println("The Value of x after running change: "+x); // but as the method change copied the value of x, ultimate value not changing

        //Case-2: Changing value of an array
        int a[] = {1,2,3,4}; //here arr storing reference of the element in it
        change2(a); // passing the references to the method
        System.out.println("Value of a[0] after running change 2: "+a[0]); // and in the change2 method the reference of the first index changes as well as in the main method
    }
}
