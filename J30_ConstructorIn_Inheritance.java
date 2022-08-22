package com.company;

class Parent{ // Parent class
    Parent(){
        System.out.println("I am Parent Class");
    }
    Parent(int a){
        System.out.println("I am Parent Class with value: "+a);
    }
}
class Child extends Parent{ // Child's parent class is Parent
    Child(){
        System.out.println("I am Child Class");
    }
    Child(int x){
        super(x*x); // here super means Parent class
        // super is automatically called at the time of subclass(child class) is being called
        System.out.println("I am a Child Class with value of: "+x);
    }
}
class GrandChild extends Child{  // GrandChild's parent class is Child
    GrandChild(){
        // here we didn't call the "super" but it will be called auto
        System.out.println("I am GrandChild Class");
    }
    GrandChild(int a){
        super(a*a); // here "super" means Child Class
        System.out.println("I am a GrandChild Class with value of: "+a);
    }
}

public class J30_ConstructorIn_Inheritance {
    public static void main(String[] args) {

        System.out.println("Without Parameter");
        GrandChild g = new GrandChild();
        // when we create an object under GrandChild , it calls it's Parent class Child and Child class calls it's parent Class Parent
        // So the constructor of the Parent class executes first then Child and lastly GrandChild

        System.out.println("\nWith Parameter");
        GrandChild g2 = new GrandChild(2);
    }
}
