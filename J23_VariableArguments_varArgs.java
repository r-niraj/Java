package com.company;

public class J23_VariableArguments_varArgs {
/*    static int summation(int a,int b){
        return a+b;
    }
    static int summation(int a,int b,int c){
        return a+b+c;
    }
    static int summation(int a,int b,int c, int d){
        return a+b+c+d;
    }*/
    //but if we continue this for huge amount of number, it is hard to write method overloading for every addition

    //this is where we need Variable Arguments; in short "VarA rgs"
    static int summation(int a, int ...arr){ // here "int ...arr" is working as "int arr[]" that stores arguments as array element
        int sum=a;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        //if we want to add two or more numbers with method
        System.out.println("Sum of 2 and 3: "+ summation(2,3));
        System.out.println("Sum of 2, 4 and 3: "+ summation(2,4,3));
        System.out.println("Sum of 2, 4, 6 and 3: "+ summation(2,4,6,3));
    }
}
