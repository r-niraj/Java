package com.company;

public class J18_ForEachLoop {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        /*//Displaying array (for-loop)
        System.out.println("Printing using for-loop");
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
            */

        //Displaying array (for each loop)
        System.out.println("Printing using for-each loop");
        for (int element : arr) //for each loop used for access every element of an array
        {
            System.out.println(element);
        }
    }
}
