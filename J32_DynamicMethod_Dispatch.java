package com.company;

import java.security.PublicKey;

class Phone{
    public void Display(){
        System.out.println("This is Phone Class");
    }
    public void Info(){
        System.out.println("This is One");
    }
}

class SmartPhone extends Phone{
    public void Display(){
        System.out.println("This is Phone Class");
    }
    public void Info2(){
        System.out.println("This is Two");
    }
}

public class J32_DynamicMethod_Dispatch {
    public static void main(String[] args) {
//        Phone p1 = new Phone();
//        p1.Display();
//        p1.Info();
//        SmartPhone s1 = new SmartPhone();
//        s1.Display();
//        s1.Info2();
//        s1.Info();
       /*
        This is Phone Class
        This is One
        This is Phone Class
        This is Two
        This is One
       */
        Phone p2 = new SmartPhone();
        p2.Info(); // info of Phone class
        p2.Display(); // display of Smartphone class
        // p2.Info2(); // not allowed
        // allowed [ super_class object = new child_class(); ]
        
        // SmartPhone s2 = new Phone(); // not allowed [ child_class object = new super_class(); ]
    }
}
