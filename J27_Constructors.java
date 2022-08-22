package com.company;

class Employee2{
    String name;
    int id;

    // constructors' name have to be named as **class name
    // created constructor
    // with three different parameters
    Employee2(){ // null parameter
        name = "Your_name_here";
        id = 0;
    }
    Employee2(String s){ // 1 parameter
        name = s;
        id = 1;
    }
    Employee2(String s,int n){ // 2 parameter
        name = s;
        id = n;
    }
    // here we overloaded the constructor named "Employee2"
    void showDetails(){
        System.out.println("Name: "+name+"\nId: "+id);
    }
}

public class J27_Constructors {
    public static void main(String[] args) {
        // constructor can be called only when the constructor is creating
        // storing details at the time of creating object
        // sending argument to constructors
        Employee2 em1 = new Employee2(); // null argument
        Employee2 em2 = new Employee2("Shawon"); // 1 arguments
        Employee2 em3 = new Employee2("Shajid",10); // 2 arguments

        // printing details
        em1.showDetails();
        em2.showDetails();
        em3.showDetails();
    }
}
