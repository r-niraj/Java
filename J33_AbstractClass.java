package com.company;

// Abstract - existing thought as an idea but not having a physical or concrete existence
// Abstract Method -> A method that declared without an implementation
// [ abstract void moveTo(double x, double y) ] // abstract method

// abstract class - if a class includes abstract methods, the class itself must be declared abstract as in:
        /*
        public abstract class PhoneModel{
            abstract void SwitchOff();
            // non-abstract codes or ..
        }
        */

abstract class parent1{
    public parent1(){
        System.out.println("I am a constructor of parent class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet(); // abstract method that must be overridden in the child classes
    abstract public void greet2();
}

class child extends parent1{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

class child1 extends parent1{
    @Override
    public void greet() {
        System.out.println("Shuvo Sokal");
    }
    public void greet2() {
        System.out.println("Shuvo Sondha");
    }
}

public class J33_AbstractClass {
    public static void main(String[] args) {
        // parent1 p = new parent1(); // not allowed as parent1 is an abstract class
        child c = new child();
        c.greet();
    }
}
