package com.company;

class class1{
    public void display(){
        System.out.println("Display Class1");
    }
}

class class2 extends class1{
    public void display2(){
        System.out.println("Display Class2");
    }
    public void display() {
        System.out.println("Display Class2");
    }
}

class class3 extends class2{
    public void display3(){
        System.out.println("Display Class3");
    }
    @Override // to ensure method overriding
    public void display(){
        System.out.println("Display Class3");
    }
}

/*
* to override methods we need to name the method same in every child class
*/

public class J31_MethodOverriding {
    public static void main(String[] args) {
        class1 c1 = new class1();
        class2 c2 = new class2();
        class3 c3 = new class3();
        c1.display();
        //c2.display();
        c3.display();
    }
}
