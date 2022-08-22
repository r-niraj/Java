package com.company;


//Access Modifier
/*
Access Modifiers specify where a property/method is accessible. There are four types of access modifiers in java :

1. private
2. default
3. protected
4. public
 */

//here we will use private
class Employee1{
    private int id1;
    int id2;
    void storeId1(int a){  //to access id1
        this.id1 = a;
    }
    void showId1(){ //to show id1
        System.out.println("id1: "+id1);
    }
}
public class J26_AccessModifier {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1();
        int a = 2;
        emp1.storeId1(a); // giving a=2 to id1 through storeId1 method
        emp1.id2 = 3;
        emp1.showId1();
    }
}
