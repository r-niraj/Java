package com.company;

// interface -> an interface in java is a collection of abstract methods
/*
> The interface is one more way to achieve abstraction in Java.
> An interface may also contain constants, default methods, and static methods.
> All the methods inside an interface must have empty bodies except default methods and static methods.
> We use the interface keyword to declare an interface.
> There is no need to write abstract keyword before declaring methods in an interface because an interface is implicitly abstract.
> An interface cannot contain a constructor (as it cannot be used to create objects)
> In order to implement an interface, java requires a class to use the implement keyword.
 */

/*
>> Multiple inheritance faces problems when there exists a method with the same signature in both the superclasses.

>> A class can implement multiple interfaces and extend a class at the same time.
 */

interface Bicycle{
    // the properties in interface final and public in default, we cannot change
    int a = 76;
    // the methods in interface public in default
    void applyBreak(int decrement);
    void speedUp(int increment);
    // this two methods has to be implemented whenever a class implements "Bicycle" interface
}
interface Horn {
    void horn1();
    void horn2();
}
class DurontoCycle implements Bicycle, Horn{ // we can implement more than one interface
    @Override
    public void horn1() {
        System.out.println("Pom Pom");
    }

    @Override
    public void horn2() {
        System.out.println("Pip Pip");
    }

    //    void horn(){
//        System.out.println("Pom Pom");
//    }
    @Override
    public void applyBreak(int decrement) {
        System.out.println("Slowing Down");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Speeding Up");
    }
}

public class J34_Interfaces {
    public static void main(String[] args) {
        DurontoCycle obj1 = new DurontoCycle();
        obj1.applyBreak(1);

        // we can create properties in interface
        System.out.println(obj1.a);
        // but we cannot change properties in interface because the properties are "final" by default
        // obj1.a = 4;

        obj1.horn1();
        obj1.horn2();
    }
}
