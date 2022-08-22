package com.company;
// Inheritance
/*
 Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
 */
//two classes cannot be the superclass for a subclass.
class Base{ // parent class
    int x;
    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}
//The "extends" keyword is used to inherit a subclass from a superclass.
class Derived extends Base{ // child class
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class J29_Inheritance {
    public static void main(String[] args) {
        /*
        // creating an object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // but we can't call Derived class's thing by Base class object
        //output:
//        I am in base and setting x now
//        4
        */

        // Creating an object of derived class
        // we can call Base class's thing by derived class object
        // as derived class is a child class of Base class
        Derived d = new Derived();
        d.setX(4);;
        System.out.println(d.getX());
        d.setY(6);
        System.out.println(d.getY());

    }
}


/*
Important terminologies used in Inheritance :
Parent class/superclass: The class from which a class inherits methods and attributes is known as parent class.
Child class/sub-class: The class that inherits some other class's methods and attributes is known as child class.
 */