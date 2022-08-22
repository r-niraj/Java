package com.company;

public class J16_BreakAndContinue {
    public static void main(String[] args) {
        //break and continue using loops

        //using break
        //break used for stopping a loop in any point or value
        System.out.println("Break in loop\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "\nJava is great.");
            if (i == 2) {
                System.out.println("Stopping the loop");
                break; //when the value of i reaches 2 ,the loop will stop
            }
        }
        System.out.print("\n");
        first:
        for (int i = 1; i <= 5; i++) { //here"first" is level for the "for" loop, by which we can navigate the loop
            second:
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
                if (j == 5) break first; //we navigate first to break the 1st loop
            }
        }

            //using continue
            //continue used for escaping from a point or value of a loop

        System.out.println("Continue in loop");
            for (int k = 1; k <= 5; k++) {
                if (k == 2) {
                    System.out.println("Escaping this value");
                    continue; //when the value of k reaches 2 ,the loop will escape the next codes of the loop
                }
                    System.out.println(k + "\nJava is great.");
            }
        System.out.print("\n");
            first: for (int i = 1; i <= 5; i++) { //here"first" is level for the "for" loop, by which we can navigate the loop
                second: for (int j = 1; j <= 10; j++) {
                    if (j == 5) continue first; //we navigate the loop to escape
                    System.out.println(i + " X " + j + " = " + (i * j));
                }
        }
    }
}
