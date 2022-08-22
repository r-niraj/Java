package com.company;

import java.util.Scanner;

//there will be only one public class in a java file
class Employee{ // creating a custom class
    int id;
    String name;
    public void printDetails(){ // a method under class Employee
        System.out.println("My Name: "+name);
        System.out.println("My ID: "+id);
    }
}
public class J25_CustomClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a custom class");
        //Employee shawon = new Employee(); // declaring an object named "shawon" under Employee class
        Employee your = new Employee(); // declaring another object named "your"

        // setting attributes
//        shawon.id = 2131663;
//        shawon.name = "Asif Bhuiyan Shawon";
        System.out.println("Enter your name and ID: ");
        your.name = sc.nextLine();
        your.id = sc.nextInt();

        your.printDetails(); // calling method by object
        // printing the attributes
        //System.out.println(shawon.id+" "+shawon.name);
    }
}

// the general form of class
/*
class classname {
    type instance-variable1;
    type instance-variable2;
    // ...
    type instance-variableN;
    type methodName1(parameter-list) {
        // body of method
    }
    type methodName2(parameter-list) {
        // body of method
    }
    // ...
    type methodNameN(parameter-list) {
        // body of method
    }
}
 */