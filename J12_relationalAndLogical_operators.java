package com.company;

public class J12_relationalAndLogical_operators {
    public static void main(String[] args) {
        boolean a, b, c;
        //AND Operator
        a = true;
        b = false;
        c = true;
        if(a && b)
            System.out.println("a and b true");
        else if(a && c)
            System.out.println("a and c true");
        else
            System.out.println("b and c true");

        //OR operator
        a = false;
        b = false;
        c = true;
        if(a || b)
            System.out.println("a or b true");
        else if(a || c)
            System.out.println("a or c true");
        else
            System.out.println("b or c true");
    }
}